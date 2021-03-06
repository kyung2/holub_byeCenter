package com.holub.ui;
import java.awt.*;

/*	The Colors interface contains nothing but symbolic constants for various
 *	color values. The names are self explanatory.
 */

/*** Provides symbolic definitions for various colors not defined in the
 * {@link java.awt.Color} class.
 * <p>
 *<table>
 *	<tr><td>Color 			</td><td> Sample 								   </td><td> R  </td><td> G  </td><td> B  </td></tr>
 *	<tr><td>TRANSPARENT		</td><td> &nbsp;								   </td colspan=3> no value, alias for null. </td></tr>
 *
 *	<tr><td>DARK_R ED		</td><td bgcolor=#990000> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> 99 </td><td> 00 </td><td> 00 </td></tr>
 *	<tr><td>MEDIUM_RED		</td><td bgcolor=#cc0000> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> cc </td><td> 00 </td><td> 00 </td></tr>
 *	<tr><td>LIGHT_RED		</td><td bgcolor=#ff0000> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> ff </td><td> 00 </td><td> 00 </td></tr>
 *	
 *	<tr><td>DARK_ORANGE		</td><td bgcolor=#ff6600> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> ff </td><td> 66 </td><td> 00 </td></tr>
 *	<tr><td>MEDIUM_ORANGE	</td><td bgcolor=#ff9900> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> ff </td><td> 99 </td><td> 00 </td></tr>
 *	<tr><td>LIGHT_ORANGE	</td><td bgcolor=#ffcc00> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> ff </td><td> cc </td><td> 00 </td></tr>
 *	<tr><td>ORANGE			</td><td bgcolor=#ff9900> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> ff </td><td> 99 </td><td> 00 </td></tr>
 *	
 *	<tr><td>OCHRE			</td><td bgcolor=#cc9900> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> cc </td><td> 99 </td><td> 00 </td></tr>
 *	<tr><td>DARK_YELLOW		</td><td bgcolor=#ffff00> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> ff </td><td> ff </td><td> 00 </td></tr>
 *	<tr><td>MEDIUM_YELLOW	</td><td bgcolor=#ffff99> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> ff </td><td> ff </td><td> 99 </td></tr>
 *	<tr><td>LIGHT_YELLOW	</td><td bgcolor=#ffffdd> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> ff </td><td> ff </td><td> dd </td></tr>
 *	
 *	<tr><td>DARK_GREEN		</td><td bgcolor=#006600> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> 00 </td><td> 66 </td><td> 00 </td></tr>
 *	<tr><td>MEDIUM_GREEN	</td><td bgcolor=#009900> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> 00 </td><td> 99 </td><td> 00 </td></tr>
 *	<tr><td>LIGHT_GREEN		</td><td bgcolor=#00ff00> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> 00 </td><td> ff </td><td> 00 </td></tr>
 *	<tr><td>GREEN			</td><td bgcolor=#009900> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> 00 </td><td> 99 </td><td> 00 </td></tr>
 *	
 *	<tr><td>DARK_BLUE		</td><td bgcolor=#000099> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> 00 </td><td> 00 </td><td> 99 </td></tr>
 *	<tr><td>MEDIUM_BLUE		</td><td bgcolor=#0000cc> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> 00 </td><td> 00 </td><td> cc </td></tr>
 *	<tr><td>LIGHT_BLUE		</td><td bgcolor=#0000ff> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> 00 </td><td> 00 </td><td> ff </td></tr>
 *	
 *	<tr><td>DARK_PURPLE		</td><td bgcolor=#990099> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> 99 </td><td> 00 </td><td> 99 </td></tr>
 *	<tr><td>MEDIUM_PURPLE	</td><td bgcolor=#cc00ff> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> cc </td><td> 00 </td><td> ff </td></tr>
 *	<tr><td>LIGHT_PURPLE	</td><td bgcolor=#cc99ff> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> cc </td><td> 99 </td><td> ff </td></tr>
 *	<tr><td>PURPLE			</td><td bgcolor=#cc00ff> &nbsp;&nbsp;&nbsp;&nbsp; </td><td> cc </td><td> 00 </td><td> ff </td></tr>
 *</table>
 *
 * @include /etc/license.txt
 * @see java.awt.Color
 */

//interface로 하면 모든 변수가 public static final 이라서 class기능만 하는 interface 변수만 담아놓은 클래스를
    //편히 쓸려고 interface로 만들었다.!
public interface Colors
{
/*** RGB=(0x99, 0x00, 0x00); <span style="background-color:#990000;">&nbsp;&nbsp;&nbsp;</span> */ static final Color DARK_RED	   = new Color(0x99, 0x00, 0x00);
/*** RGB=(0xcc, 0x00, 0x00); <span style="background-color:#cc0000;">&nbsp;&nbsp;&nbsp;</span> */ static final Color MEDIUM_RED    = new Color(0xcc, 0x00, 0x00);
/*** RGB=(0xff, 0x00, 0x00); <span style="background-color:#ff0000;">&nbsp;&nbsp;&nbsp;</span> */ static final Color LIGHT_RED	   = new Color(0xff, 0x00, 0x00);

/*** RGB=(0xff, 0x66, 0x00); <span style="background-color:#ff6600;">&nbsp;&nbsp;&nbsp;</span> */ static final Color DARK_ORANGE   = new Color(0xff, 0x66, 0x00);
/*** RGB=(0xff, 0x99, 0x00); <span style="background-color:#ff9900;">&nbsp;&nbsp;&nbsp;</span> */ static final Color MEDIUM_ORANGE = new Color(0xff, 0x99, 0x00);
/*** RGB=(0xff, 0xcc, 0x00); <span style="background-color:#ffcc00;">&nbsp;&nbsp;&nbsp;</span> */ static final Color LIGHT_ORANGE  = new Color(0xff, 0xcc, 0x00);
/*** RGB=(0xff, 0x99, 0x00); <span style="background-color:#ff9900;">&nbsp;&nbsp;&nbsp;</span> */ static final Color ORANGE 	   = new Color(0xff, 0x99, 0x00);
/*** RGB=(0xcc, 0x99, 0x00); <span style="background-color:#cc9900;">&nbsp;&nbsp;&nbsp;</span> */ static final Color OCHRE         = new Color(0xcc, 0x99, 0x00);
/*** RGB=(0xff, 0xff, 0x00); <span style="background-color:#ffff00;">&nbsp;&nbsp;&nbsp;</span> */ static final Color DARK_YELLOW   = new Color(0xff, 0xff, 0x00);
/*** RGB=(0xff, 0xff, 0x99); <span style="background-color:#ffff99;">&nbsp;&nbsp;&nbsp;</span> */ static final Color MEDIUM_YELLOW = new Color(0xff, 0xff, 0x99);
/*** RGB=(0xff, 0xff, 0xdd); <span style="background-color:#ffffdd;">&nbsp;&nbsp;&nbsp;</span> */ static final Color LIGHT_YELLOW  = new Color(0xff, 0xff, 0xdd);
/*** RGB=(0x00, 0x66, 0x00); <span style="background-color:#006600;">&nbsp;&nbsp;&nbsp;</span> */ static final Color DARK_GREEN    = new Color(0x00, 0x66, 0x00);
/*** RGB=(0x00, 0x99, 0x00); <span style="background-color:#009900;">&nbsp;&nbsp;&nbsp;</span> */ static final Color MEDIUM_GREEN  = new Color(0x00, 0x99, 0x00);
/*** RGB=(0x00, 0xff, 0x00); <span style="background-color:#00ff00;">&nbsp;&nbsp;&nbsp;</span> */ static final Color LIGHT_GREEN   = new Color(0x00, 0xff, 0x00);
/*** RGB=(0x00, 0x99, 0x00); <span style="background-color:#009900;">&nbsp;&nbsp;&nbsp;</span> */ static final Color GREEN         = MEDIUM_GREEN;

/*** RGB=(0x00, 0x00, 0x99); <span style="background-color:#000099;">&nbsp;&nbsp;&nbsp;</span> */ static final Color DARK_BLUE     = new Color(0x00, 0x00, 0x99);
/*** RGB=(0x00, 0x00, 0xcc); <span style="background-color:#0000cc;">&nbsp;&nbsp;&nbsp;</span> */ static final Color MEDIUM_BLUE   = new Color(0x00, 0x00, 0xcc);
/*** RGB=(0x00, 0x00, 0xff); <span style="background-color:#0000ff;">&nbsp;&nbsp;&nbsp;</span> */ static final Color LIGHT_BLUE    = new Color(0x00, 0x00, 0xff);

/*** RGB=(0x99, 0x00, 0x99); <span style="background-color:#990099;">&nbsp;&nbsp;&nbsp;</span> */ static final Color DARK_PURPLE   = new Color(0x99, 0x00, 0x99);
/*** RGB=(0xcc, 0x00, 0xff); <span style="background-color:#cc00ff;">&nbsp;&nbsp;&nbsp;</span> */ static final Color MEDIUM_PURPLE = new Color(0xcc, 0x00, 0xff);
/*** RGB=(0xcc, 0x99, 0xff); <span style="background-color:#cc99ff;">&nbsp;&nbsp;&nbsp;</span> */ static final Color LIGHT_PURPLE  = new Color(0xcc, 0x99, 0xff);
/*** RGB=(0xcc, 0x00, 0xff); <span style="background-color:#cc00ff;">&nbsp;&nbsp;&nbsp;</span> */ static final Color PURPLE 	   = MEDIUM_PURPLE;

//hyunkyung 2017 pantone color for color picker

    static final Color PRIMROSE_YELLOW = new Color(246,210,88); //f6d258
    static final Color PALE_DOGWOOD = new Color(239,206,197); //efce5
    static final Color HAZELNUT = new Color(209,175,148); //d1af94
    static final Color ISLAND_PARADISE = new Color (151,213,224); //97d5e0
    static final Color GREENERY = new Color(136,177,75); //88b14b
    static final Color FLAME = new Color(239,86,45); //ef562d
    static final Color PINK_YARROW = new Color(209,48,118); //d13076
    static final Color NIAGARA = new Color(85,135,162); //5587a2
    static final Color KALE = new Color(92,113,72); //5c7148
    static final Color LAPIS_BLUE = new Color(12,76,138); //0c4c8a

//hyunkyung 2016 pantone color for color picker (not yet)
    static final Color ROSE_QUARTZ = new Color (247,202,201); //f7cac9
    static final Color SERENITY = new Color(154,168,209); // 92a8d1

    //hyunkyung pantone color chart
    static final Color SUNSHINE = new Color(250,222,133); //fade85
    static final Color CITRUS = new Color (255,176,37); //FFB025
    static final Color LEMONCHROME = new Color (255,198,0); //ffc600
    static final Color BLAZINGORANGE = new Color (255,164,74); //ffa44a


    //hyunkyung pantone color chart RED
    static final Color LIGHTSALMON = new Color (255,160,122); //ffa07a
    static final Color SALMON = new Color(250,128,114); //fa8072
    static final Color DARKSALMON = new Color(233,150,122); //e9967a
    static final Color LIGHTCORAL = new Color (240,128,128); // f0808
    static final Color INDIANRED = new Color (240,128,128); //cd5c5c
    static final Color CRIMSON = new Color (220,20,60); //dc143c;
    static final Color FIREBRICK = new Color (178,34,34); //b22222
    static final Color MAROON = new Color(128,0,0); // 80000
    static final Color DARKRED = new Color(139,0,0);// 8b0000
    static final Color TOMATO = new Color(255,99,71); // ff6347
    static final Color PALEVIOLETRED = new Color(219,112,147); //db7093


    //hyunkyung color chart BLUE
    static final Color ALICEBLUE = new Color(240,248,255); //f0f8ff
    static final Color LAVENDER = new Color (230,230,250);
    static final Color POWDERBLUE = new Color(176,224,230);

   //hyunkyung color chart White 계열
    static final Color WHITE = new Color (255,255,255);
    static final Color MISTYROSE = new Color (255,228,225);
    static final Color NAVAJOWHITE = new Color (255,222,173);
    static final Color LINEN = new Color (250,240,230);
   // transparent
    static final Color TRANSPARENT = new Color (0,0,0,0); //투명한 색상을 나타낸다.



    //hyunkyung for cell color



}
