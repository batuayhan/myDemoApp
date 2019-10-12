package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

 	public void testStartIndex(){
		assertEquals(2,new App().harfSay(-10,5,"batuhan ayhan",'a'));
	}

	public void testEndIndex1(){
		assertEquals(-1,new App().harfSay(2,100,"batuhan ayhan",'a'));
	}

	public void testIndexRelations(){
		assertEquals(-1, new App().harfSay(5,2,"batuhan ayhan",'a'));
	}

	public void checkResults(){
		assertEquals(2, new App().harfSay(0,6,"batuhan ayhan",'a'));
	}

	public void checkResults2(){
		assertEquals(0, new App().harfSay(0,12,"batuhan ayhan",'x'));
	}


}
