package com.holub.life;

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
// hyunkyung
    /**브릿지패턴 이용 ! */
    
public class Theme {
}
