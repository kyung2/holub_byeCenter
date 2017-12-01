package com.holub.life;
import java.io.*;

/***
 *hyunkyung
 * cell이 저장된 것들을.. 걍 죽음의 상징이면 기념인건가...?
 *
 * All mementos created by the Cells are Storable.
 *
 * @include /etc/license.txt
 */

public interface Storable
{
	void load ( InputStream in   ) throws IOException;
	void flush( OutputStream out ) throws IOException;
}
