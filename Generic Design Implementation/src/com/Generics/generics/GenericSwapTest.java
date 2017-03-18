package com.assignment6.generics;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenericSwapTest {
	
	@SuppressWarnings("rawtypes")
	@Test
	public void Integer() {
		@SuppressWarnings("unchecked")
		Variable b= new Variable(8);
		Variable a=new Variable(10);
		a.swap(b);
		assertEquals(10,b.getValue());
	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void Double() {
		@SuppressWarnings("unchecked")
		Variable b= new Variable(8.89);
		Variable a=new Variable(10.88);
		a.swap(b);
		assertEquals(10.88,b.getValue());
	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void testDouble_Integer() {
		@SuppressWarnings("unchecked")
		Variable b= new Variable(8);
		Variable a=new Variable(8.8);
		a.swap(b);
		assertEquals(8.8,b.getValue());
		
	}
		@SuppressWarnings("rawtypes")
		@Test
		public void testString() {
			@SuppressWarnings("unchecked")
			Variable b= new Variable("abc");
			Variable a=new Variable("def");
			a.swap(b);
			assertEquals("def",b.getValue());
		}
		
		@SuppressWarnings("rawtypes")
		@Test
		public void testInteger_String() {
			@SuppressWarnings("unchecked")
			Variable b= new Variable(8);
			Variable a=new Variable("def");
			a.swap(b);
			assertEquals("def",b.getValue());
		}	
}
