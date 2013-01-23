package com.blogspot.javapeanuts.jarachis.test.naming;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.spi.InitialContextFactory;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleInitialContextFactoryTest {
	@Test
	public void usesProvidedInitialContext() throws Exception {
		Context theContext = new MockContext();
		InitialContextFactory factory = new SimpleInitialContextFactory(theContext);
		Hashtable<String, Object> environment = new Hashtable<String, Object>();
		assertTrue(theContext == factory.getInitialContext(environment));
	}
}
