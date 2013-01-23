package com.blogspot.javapeanuts.jarachis.test.naming;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;

public class SimpleInitialContextFactory implements InitialContextFactory {
	private final Context context;
	
	public SimpleInitialContextFactory(Context context) {
		this.context = context;
	}

	public SimpleInitialContextFactory() {
		this.context = new MockContext();
	}

	@Override
	public Context getInitialContext(Hashtable<?, ?> environment) throws NamingException {
		return context;
	}

	public void bind(String name, Object obj) throws NamingException {
		context.bind(name, obj);
	}
}
