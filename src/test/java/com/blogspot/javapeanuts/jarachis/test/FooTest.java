package com.blogspot.javapeanuts.jarachis.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class FooTest {
	@Test
	public void initializeFoo() throws Exception {
		Foo foo = new Foo();
		assertEquals("foo", foo.getFoo());
	}
}
