package com.holub.life;

import java.awt.*;
import javax.swing.*;

import com.holub.life.mouse.MouseCommandManager;
import com.holub.life.Theme.MyColor;
import com.holub.ui.MenuSite;

/*******************************************************************
 * An implemenation of Conway's Game of Life.
 *
 * @include /etc/license.txt
 */
/**
 * hyunkyung 주석 Life Game 규칙 설명
 * 1. 죽어 있는 셀은 정확히 3개의 이웃 셀이 살아있다면 살아난다.
 * 2. 셀은 두개 혹은 세개의 이웃을 가지면 계속 살아있는 상태가 된다.
 * 3. 이웃하는 셀이 한개 또는 4개이상이면 외롭거나 질식하여 죽는다. */
public final class Life extends JFrame {
	/**
	 * sangwon 주석
	 * Life 클래스는 JFrame 상속받음
	 * Life를 메인으로 프로그램이 동작
	 * Menusite로 메뉴창을 만듦
	 * Universe로 기본 내용을 만듦
	 */
	private static JComponent universe;

	public static void main(String[] arguments) {
		new Life();
	}

	private Life() {
		//현경
		super("The Game of Life. "
				+ "삼삼하조");
		// Must establish the MenuSite very early in case
		// a subcomponent puts menus on it.

		//hyunkyung size조절못하게함.!
//		setResizable(false);

		MenuSite.establish(this);        //{=life.java.establish}

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		getContentPane().setLayout(new  BorderLayout());
		getContentPane().add(Universe.instance(), BorderLayout.CENTER); //{=life.java.install}

		MyColor.addMenus();
		MouseCommandManager.addMenus();

		setPreferredSize(new Dimension(900, 800));


		pack();
		setVisible(true);
	}


//center에 넣을려고함


	public static void centerWindow(Window frame) {

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
		frame.setLocation(x, y);
	}
}
