package com.holub.asynch;

/**
 *	This class is a simplified version of the com.asynch.Condition
 *	class described in Taming Java Threads. It's really supplanted
 *	by classes in the Java 1.5 java.util.concurrent package.
 *	Use it to wait for some condition to become true. For example:
 *	<PRE>
 *	ConditionVariable hellFreezesOver = new ConditionVariable(false);
 *
 * 	Thread 1:
 * 		hellFreezesOver.waitForTrue();
 *
 * 	Thread 2:
 * 		hellFrezesOver.set(true);
 *	</PRE>
 *	Unlike <code>wait()</code> you will not be suspened at all if you
 *	wait on a true condition variable. Call <code>set(false)</code>,
 *	to put the variable back into a false condition (thereby forcing
 *	threads to wait for the condition to become true, again).
 *
 *	@include c:/etc/license.txt
 */

/**
 * sangwon주석
 * 이거 좀 신기한 클래스인데 비동기 구성할때 서로 싱크 안맞는거 수정하려고 하는듯
 * 이부분도 한번 보면 좋을듯
 * //TODO 싱크 부분 조금 더 이쁘게 바꿀 수 있을듯 
 */
public class ConditionVariable
{	private volatile boolean isTrue;

	public ConditionVariable( boolean isTrue ){ this.isTrue = isTrue; }

	public synchronized boolean isTrue()
	{	return isTrue;
	}

	public synchronized void set( boolean how )
	{	if( (isTrue = how) == true )
			notifyAll();
	}

	public final synchronized void waitForTrue() throws InterruptedException
	{	while( !isTrue )
			wait();
	}
}
