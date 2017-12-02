package com.holub.life.Theme;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.*;

import com.holub.io.Files;
import com.holub.life.Cell;
import com.holub.ui.MenuSite;
import com.holub.ui.Colors;
import com.holub.asynch.ConditionVariable;

import com.holub.life.Cell;
import com.holub.life.Clock;
import com.holub.life.Direction;
import com.holub.life.Storable;


/***
 * made by hyunkyung
 * The <code>Theme</code> class handles the color of gameboard,cell... etc
 * It creates its own menu (which sets the theme),
 * and sends notifications off to any observers theme the click colock
 *
 */

/**
 * color 가 쓰이는곳 : Neighborhood : redraw method (cell의 color 재 설정하는 부분: 이부분도 고쳐야하나 ?
 *                   Universe :		setBackground methond 역시 	( Color.white	 );
 *                   Resident : Cell의 color 를 조정하는 부분 -. pirvate static final color로 선언되어 있음 .
 *                   */
/**브릿지패턴 이용 ! */

//각 색깔이 쓰이는 곳을 theme로 지정하여 바꿀수 있다. red theme

public interface ITheme {

    //cell
    public Color getLive_Color ();
    public Color getDead_Color ();
    public Color getBorder_Color ();

    //Neighborhood 색깔 지정
    public Color getRedraw_Graphic();

    //universe
    public Color getBackGround_Color ();


//        private static final Color BORDER_COLOR = Colors.DARK_YELLOW;
    //private static final Color BORDER_COLOR = Colors.BLAZINGORANGE;
    //     private static final Color LIVE_COLOR 	= Color.RED;
    //   private static final Color DEAD_COLOR   = Colors.LIGHT_ORANGE;




}
