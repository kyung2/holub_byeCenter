package com.holub.life;

import java.io.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import com.holub.io.Files;
import com.holub.ui.MenuSite;

import com.holub.life.Cell;
import com.holub.life.Storable;
import com.holub.life.Clock;
import com.holub.life.Neighborhood;
import com.holub.life.Resident;

/**
 * hyunkyung : 싱글톤이어ㅇ야함. \
 * Universe.instance()통해서 접근해야함... */
/**
 * sagnwon : 이미 싱글톤인 상태
 * 이게 프로그램 시작시에 싱글톤 객체를 만듦
 * 배운대로라면 이게 안쓰는데도 메모리에 용량 차지하면 문제인데
 * 이건 항상 쓰이기 때문에 문제 없는듯
 */

/**
 * The Universe is a mediator that sits between the Swing
 * event model and the Life classes. It is also a singleton,
 * accessed via Universe.instance(). It handles all
 * Swing events and translates them into requests to the
 * outermost Neighborhood. It also creates the Composite
 * Neighborhood.
 *
 * @include /etc/license.txt
 */

public class Universe extends JPanel
{	private 		final Cell  	outermostCell;
	private static	final Universe 	theInstance = new Universe();

	/** The default height and width of a Neighborhood in cells.
	 *  If it's too big, you'll run too slowly because
	 *  you have to update the entire block as a unit, so there's more
	 *  to do. If it's too small, you have too many blocks to check.
	 *  I've found that 8 is a good compromise.
	 */
	/**hyunkyung
	 * grid 와 cell 사이즈는 8로 지정한다.
	 *sagnwon
     * 그리드 사이즈는 좀 쓸데없어보임 이거 좀 더 이쁘게 바꾸면 좋을듯
     * 이걸 지금은 2차배열로 만들었는데 아마 3차 배열하고 성능 테스트 해보는게 좋을듯
	 * hyunkyung 3차원 배열을한다는게 몬대?
     *
	 * */
	/**
	Universe는 스윙의 이벤트 모델과 life클래스 사이에 있는 mediator
	 */

	//현경 : 팩토리..? 아니면 우선 grid size 을 팩토리로 따로 빼면..
	private static final int  DEFAULT_GRID_SIZE = 4;

	/** The size of the smallest "atomic" cell---a Resident object.
	 *  This size is extrinsic to a Resident (It's passed into the
	 *  Resident's "draw yourself" method.
	 */
	private static final int  DEFAULT_CELL_SIZE = 8;

	// The constructor is private so that the universe can be created
	// only by an outer-class method [Neighborhood.createUniverse()].

	private Universe()
	{	// Create the nested Cells that comprise the "universe." A bug
		// in the current implementation causes the program to fail
		// miserably if the overall size of the grid is too big to fitzzzzez
		// on the screen.


        /**
        sangwon
        바로밑에 생성자를 보면 2차배열로 생성함
        같은 셀인 놈인 네이버후드 밑에 레지던스가 있는 구조가 트리처럼 되어잇음
        이건 마치 그 뭐냐 파일 트리했던 패턴임
        근데 그것보다 좀 더 **한듯
		 */
        /**
		outermostCell = new Neighborhood
						(	DEFAULT_GRID_SIZE,
							new Neighborhood
							(	DEFAULT_GRID_SIZE,
								new Resident()
							)
						);

		*/

			outermostCell = new Neighborhood
            (	DEFAULT_GRID_SIZE,
                    new Neighborhood
                            (	DEFAULT_GRID_SIZE,
                                    new Neighborhood
                                            (	DEFAULT_GRID_SIZE,
                                                    new Resident()
                                            )
                            )
            );
		//        outermostCell = new Neighborhood
//						(
//								DEFAULT_GRID_SIZE,
//								new Resident()
//
//						);

		final Dimension PREFERRED_SIZE =
				//** sangwon 이거 tktlf  이거 사실//현경 경 경


						new Dimension
						(  outermostCell.widthInCells() * DEFAULT_CELL_SIZE,
						   outermostCell.widthInCells() * DEFAULT_CELL_SIZE
						);

		addComponentListener
		(	new ComponentAdapter()
			{	public void componentResized(ComponentEvent e)
				{
					// Make sure that the cells fit evenly into the
					// total grid size so that each cell will be the
					// same size. For example, in a 64x64 grid, the
					// total size must be an even multiple of 63.

					Rectangle bounds = getBounds();
					bounds.height /= outermostCell.widthInCells();
					bounds.height *= outermostCell.widthInCells();
					bounds.width  =  bounds.height;
					setBounds( bounds );
				}
			}
		);

		setBackground	( Color.white	 );
		setPreferredSize( PREFERRED_SIZE );
		setMaximumSize	( PREFERRED_SIZE );
		setMinimumSize	( PREFERRED_SIZE );
		setOpaque		( true			 );

		addMouseListener					//{=Universe.mouse}
		(	new MouseAdapter()
			{	public void mousePressed(MouseEvent e)
				{	Rectangle bounds = getBounds();
					bounds.x = 0;
					bounds.y = 0;
					outermostCell.userClicked(e.getPoint(),bounds);
					repaint();
				}
			}
		);

		MenuSite.addLine( this, "Grid", "Clear",
			new ActionListener()
			{	public void actionPerformed(ActionEvent e)
				{	outermostCell.clear();
					repaint();
				}
			}
		);

		MenuSite.addLine			// {=Universe.load.setup}
		(	this, "Grid", "Load",
			new ActionListener()
			{	public void actionPerformed(ActionEvent e)
				{	doLoad();
				}
			}
		);

		MenuSite.addLine
		(	this, "Grid", "Store",
			new ActionListener()
			{	public void actionPerformed(ActionEvent e)
				{	doStore();
				}
			}
		);

		MenuSite.addLine
		(	this, "Grid", "Exit",
			new ActionListener()
			{	public void actionPerformed(ActionEvent e)
		        {	System.exit(0);
		        }
			}
		);

		//클록 틱 이벤트 구독
		Clock.instance().addClockListener //{=Universe.clock.subscribe}
		(	new Clock.Listener()
			{	public void tick()
				{	if( outermostCell.figureNextState
						   ( Cell.DUMMY,Cell.DUMMY,Cell.DUMMY,Cell.DUMMY,
							 Cell.DUMMY,Cell.DUMMY,Cell.DUMMY,Cell.DUMMY
						   )
					  )
					{	if( outermostCell.transition() )
							refreshNow();
					}
				}
			}
		);
	}

	/** Singleton Accessor. The Universe object itself is manufactured
	 *  in Neighborhood.createUniverse()
	 */

	public static Universe instance()
	{	return theInstance;
	}

	private void doLoad()
	{	try
		{
			FileInputStream in = new FileInputStream(
			   Files.userSelected(".",".life","Life File","Load"));

			Clock.instance().stop();		// stop the game and
			outermostCell.clear();			// clear the board.

			Storable memento = outermostCell.createMemento();
			memento.load( in );
			outermostCell.transfer( memento, new Point(0,0), Cell.LOAD );

			in.close();
		}
		catch( IOException theException )
		{	JOptionPane.showMessageDialog( null, "Read Failed!",
					"The Game of Life", JOptionPane.ERROR_MESSAGE);
		}
		repaint();
	}

	private void doStore()
	{	try
		{
			FileOutputStream out = new FileOutputStream(
				  Files.userSelected(".",".life","Life File","Write"));

			Clock.instance().stop();		// stop the game

			Storable memento = outermostCell.createMemento();
			outermostCell.transfer( memento, new Point(0,0), Cell.STORE );
			memento.flush(out);

			out.close();
		}
		catch( IOException theException )
		{	JOptionPane.showMessageDialog( null, "Write Failed!",
					"The Game of Life", JOptionPane.ERROR_MESSAGE);
		}
	}

	/** Override paint to ask the outermost Neighborhood
	 *  (and any subcells) to draw themselves recursively.
	 *  All knowledge of screen size is also encapsulated.
	 *  (The size is passed into the outermost <code>Cell</code>.)
	 */

	public void paint(Graphics g)
	{
		Rectangle panelBounds = getBounds();
		Rectangle clipBounds  = g.getClipBounds();

		// The panel bounds is relative to the upper-left
		// corner of the screen. Pretend that it's at (0,0)
		panelBounds.x = 0;
		panelBounds.y = 0;
		outermostCell.redraw(g, panelBounds, true);		//{=Universe.redraw1}
	}

	/** Force a screen refresh by queing a request on
	 *  the Swing event queue. This is an example of the
	 *  Active Object pattern (not covered by the Gang of Four).
	 *  This method is called on every clock tick. Note that
	 *  the redraw() method on a given <code>Cell</code>
	 *  does nothing if the <code>Cell</code> doesn't
	 *  have to be refreshed.
	 */

	private void refreshNow()
	{
		SwingUtilities.invokeLater
		(	new Runnable()
			{	public void run()
				{	Graphics g = getGraphics();
					if( g == null )		// Universe not displayable
						return;
					try
					{
						Rectangle panelBounds = getBounds();
						panelBounds.x = 0;
						panelBounds.y = 0;
						outermostCell.redraw(g, panelBounds, false); //{=Universe.redraw2}
					}
					finally
					{	g.dispose();
					}
				}
			}
		);
	}
}
