package com.blogspot.javapeanuts.jarachis.test.naming;

import java.util.HashMap;
import java.util.Map;

import javax.naming.NamingException;

public class MockContext extends ContextAdapter {
	private final Map<String, Object> bindings;
	
	public MockContext() {
		this.bindings = new HashMap<String, Object>();
	}
	
	@Override
	public void bind(String name, Object obj) throws NamingException {
		bindings.put(name, obj);
	}
	
	@Override
	public Object lookup(String name) throws NamingException {
		return bindings.get(name);
	}
}
