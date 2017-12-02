package com.holub.life;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.Timer;		// overrides java.awt.timer
import com.holub.ui.MenuSite;
import com.holub.tools.Publisher;

/***
 * The <code>Clock</code> class handles the timing of gameboard
 * updates. It creates its own menu (which sets the clock speed),
 * and sends notifications off to any observers every time the
 * clock "ticks."
 *
 * <h2>Revisions</h2>
 *
 * <p>
 * 12-8-2004	AIH	Added a kludge to the clock-tick handler that
 * 				checks whether any menu item is active before it
 * 				allows the clock to tick. This mod fixes a bug
 * 				that caused the running game to overwrite any
 * 				displayed menus. See {@link #menuIsActive} for
 * 				details.
 *
 * @include /etc/license.txt
 */

/**
 * hyunkyung 주석
 * Clock 이벤트를 처리하는 객체들 (Observer)에 주기적으로 클록 틱 (Clock Tick) 이벤트를 통지하다.
 * 이 경우 Universe가 Action Listener 인터페이스를 구현한 익명의 내부 클래스를 통하여 이벤트를 받는다.
 * Observer는 또한 자바의 메뉴시스템에서도 사용함.
 * Observer의 주요 목적은 이벤트를 발생시키는 객체와 이벤트르 처리하는 객체간의 결합도 를 줄이는것!!!!!!!!!!
 * 즉 옵져버패턴은 이벤트를 발생시키는 객체와 이벤트를 처리하는 객체 사이의 결합도를 줄인다는게 key Point ! */

/**
 * sangwon 0001
 * 현경이가 말했듯 옵저버 사용중인 클래스
 * 옵저버 관리 클래스는 tools의 Publisher
 * 클록은 또한 싱글톤 객체인데 얘는 싱크로나이즈드로 관리함
 * 이는 불릴때마다 성능 이슈가 있을 수 있는 구조라고 배웠음
 * //TODO 저 싱크로나이즈드 수정하면 하나 나옴
 *
 */
//clock - observer, listener(observer)-concrete observer or subscriber
public class Clock
{
	private Timer			clock		= new Timer();
	private TimerTask		tick		= null;

	// The clock can't be an everything-is-static singleton because
	// it creates a menu, and it can't -
	private Clock()
	{
		createMenus();
	}

	private static Clock instance;

	//Clock
	/** The clock is a singleton. Get a reference to it by calling
	 *  <code>Clock.instance()</code>. It's illegal to call
	 *  <code>new Clock()</code>.
	 */
	//싱글톤 접근 메소드
	public synchronized static Clock instance()
	{
		if( instance == null )
			instance = new Clock();
		return instance;
	}

	/** Start up the clock.
	 *  @param millisecondsBetweenTicks The number of milliseconds between
	 *  					 ticks. A value of 0 indicates that
	 *  					 the clock should be stopped.
	 */

	public void startTicking( int millisecondsBetweenTicks )
	{
		if(tick != null)
		{
			tick.cancel();
			tick=null;
		}



		if( millisecondsBetweenTicks > 0 )
		{	tick =	new TimerTask()
					{	public void run(){ tick(); }
					};
		//task, delay, period
			clock.scheduleAtFixedRate( tick, 0, millisecondsBetweenTicks);
		}
	}

	/** Stop the clock
	 */
	/*머지 이 거지같은 상황은???*/

	public void stop()
	{
		startTicking( 0 );
	}

	/** Create the menu that controls the clock speed and
	 *  put it onto the menu sited.
	 */
	/**저기 주석은...왜..안나오지
	 * hyunkyung 주석 아래 method의 역할은 이제 게임의 속도 조절하는 역할! */

	//hyunkyung 수정

	private void createMenus()
	{
		// First set up a single listener that will handle all the
		// menu-selection events except "Exit"

		ActionListener modifier =									//{=startSetup}
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					String name = ((JMenuItem)e.getSource()).getName();
					char toDo = name.charAt(0);

					if( toDo=='T' )
						tick();				      // single tick
					else
						startTicking(   toDo=='A' ? 500:	  // agonizing
										toDo=='S' ? 150:	  // slow
										toDo=='M' ? 70 :	  // medium
										toDo=='F' ? 30 : 0 ); // fast
				}
			};

		//메뉴 추가
																							// {=midSetup}
		MenuSite.addLine(this,"Go","Halt",  			modifier);
		MenuSite.addLine(this,"Go","Tick (Single Step)",modifier);
		MenuSite.addLine(this,"Go","Agonizing",	 	  	modifier);
		MenuSite.addLine(this,"Go","Slow",		 		modifier);
		MenuSite.addLine(this,"Go","Medium",	 	 	modifier);
		MenuSite.addLine(this,"Go","Fast",				modifier);
// {=endSetup}
}	//{=endCreateMenus}

	private Publisher publisher = new Publisher();

	/** Add a listener that's notified every time the clock ticks:
	 *  <PRE>
	 *  Clock.instance().addClockListener
	 *  (	new Clock.Listener()
	 *  	{	public void tick()
	 *  		{	System.out.println("tick!");
	 *  		}
   	 *		}
	 *  );
	 *  </PRE>
	 */
	public void addClockListener( Listener observer )
	{
		publisher.subscribe(observer);
	}

	/** Implement this interface to be notified about clock ticks.
	 *  @see Clock
	 */
	public interface Listener
	{
		void tick();
	}

	/**싱글톤 팬턴
	 * 해당 클래스의 인스터스 가 하나 만들어지고 어디서든지 그 인스턴스에 접근가능하게 하는 패턴
	 * */
	/** Force the clock to "tick," even if it's not time for
	 *  a tick. Useful for forcing a tick when the clock is
	 *  stopped. (Life uses this for single stepping.)
	 */

	public void tick()
	{
		publisher.publish
		(
				new Publisher.Distributor()
			{
				public void deliverTo( Object subscriber )
				{
					if( !menuIsActive() )
						((Listener)subscriber).tick();
				}
			}
		);
	}

	/**hyunkyung 번역
	 * 메뉴 표시 줄의 항목이 선택되었는지 확인
	 * 스윙이 메인 프레임과 동일한 "캔버스"에 메뉴를 그려야한다. 결과적으로 표시된 메뉴는
	 * 실행중인 게임으로 덮어 쓰인다.
	 * 스윙은 일부 메뉴 항목이 선택되었다(이미선택되었다)
	 * 라느 순서에 대한 경고를 제공하지 않는다. 메뉴 선택활동을 감지하는
	 * 유일한 방법은
	 * 일부 메뉴가 표시되면 true를 리턴한다.
	 * {@link #tick} 메소드는 메뉴가 표시 될 때 클록 틱을 효과적으로 정지시킨다. */

	/** Check if any item on the menu bar has been selected.
	 *  This is an incredible kluge. The problem is that Swing draws the
	 *  menus on the same "canvas" as the main frame. As a consequence,
	 *  displayed menus are overwritten by a running game. Moreover, Swing
	 *  provides no notification on the order of "some menu item has been
	 *  selected," so the only way to detect menu-bar activity is to poll
	 *  it. This method does just that, and returns true if some menu
	 *  is being displayed. The {@link #tick} method effectively suspends
	 *  clock ticks as long as a menu is displayed, (which slows down
	 *  the clock, unfortunately).
	 *  <p>
	 *  From a design-patterns perspective, this method demonstrates that
	 *  a facade (the MenuSite) does not provide strict isolation from
	 *  the underlying subsystem. I can't immagine another application
	 *  that would need to know whether or not the menu bar is active,
	 *  so adding this menu to the MenuSite would be "noise." Since
	 *  the method does something that's of no relevance to other
	 *  MenuSite users, it makes an "end run" around the facade.
	 */

	private boolean menuIsActive()
	{
		MenuElement[] path = MenuSelectionManager.defaultManager().getSelectedPath();
		return ( path != null && path.length > 0 );
	}
}
//현경