package com.mrecw.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.Before;

/*TODO List
 *  1. ABCD => BCD
 *  2. AACD => CD
 *  3. BACD => BCD
 *  4. BBAA => BBAA
 *  5. AABAA => BAA
 *  6. A => ''
 */
public class RemovingTest 
{
	RemovingA obj ;
	
	@Before
	public void before() {
		obj = new RemovingA();
	}
   	 @Test
    public void test1() {
		assertEquals("BCD", obj.remove("ABCD"));
	}
	@Test
    public void test2() {
		assertEquals("CD", obj.remove("AACD"));
	}
	@Test
    public void test3() {
		assertEquals("BCD", obj.remove("BACD"));
	}
	@Test
    public void test4() {
		assertEquals("BBAA", obj.remove("BBAA"));
	}
	@Test
    public void test5() {
		assertEquals("BAA", obj.remove("AABAA"));
	}
	@Test
    public void test6() {
		assertEquals("", obj.remove("A"));
	}

 }
    	
    
