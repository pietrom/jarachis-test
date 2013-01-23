package com.blogspot.javapeanuts.jarachis.test.naming;

import javax.naming.Context;

import org.junit.Test;
import static org.junit.Assert.*;

public class MockContextTest {
	private static final Object AN_OBJECT = new Object();

	@Test
	public void bindAndLookupByName() throws Exception {
		Context context = new MockContext();
		context.bind("aName", AN_OBJECT);
		Object o = context.lookup("aName");
		assertTrue(AN_OBJECT == o);
	}
}
