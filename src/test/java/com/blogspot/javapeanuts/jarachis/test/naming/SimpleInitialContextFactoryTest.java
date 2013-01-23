package com.blogspot.javapeanuts.jarachis.test.naming;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.spi.InitialContextFactory;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleInitialContextFactoryTest {
	private static final String A_NAME = "aName";
	private static final Object AN_OBJECT = new Object();

	@Test
	public void usesProvidedInitialContext() throws Exception {
		Context theContext = new MockContext();
		InitialContextFactory factory = new SimpleInitialContextFactory(theContext);
		Hashtable<String, Object> environment = new Hashtable<String, Object>();
		assertTrue(theContext == factory.getInitialContext(environment));
	}
	
	@Test
	public void youCanBindNamesOnTheFactory() throws Exception {
		SimpleInitialContextFactory factory = new SimpleInitialContextFactory();
		factory.bind(A_NAME, AN_OBJECT);
		assertTrue(AN_OBJECT == factory.getInitialContext(new Hashtable<String, Object>()).lookup(A_NAME));
	}
}
