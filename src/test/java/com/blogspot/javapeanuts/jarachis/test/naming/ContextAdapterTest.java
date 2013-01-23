package com.blogspot.javapeanuts.jarachis.test.naming;

import javax.naming.Context;
import javax.naming.Name;

import org.junit.Before;
import org.junit.Test;

public class ContextAdapterTest {
	private static final Object AN_OBJECT = new Object();
	private static final String A_NAME = "aName";
	private static final String OTHER_NAME = "otherName";
	private Context context;

	@Before
	public void initContext() {
		context = new ContextAdapter();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void lookupByStringOperationUnsupported() throws Exception {
		context.lookup(A_NAME);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void lookupByNameOperationUnsupported() throws Exception {
		context.lookup((Name) null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void bindByStringOperationUnsupported() throws Exception {
		context.bind(A_NAME, AN_OBJECT);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void bindByNameOperationUnsupported() throws Exception {
		context.bind((Name) null, AN_OBJECT);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void rebindByStringOperationUnsupported() throws Exception {
		context.rebind(A_NAME, AN_OBJECT);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void rebindByNameOperationUnsupported() throws Exception {
		context.rebind((Name) null, AN_OBJECT);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void unbindByStringOperationUnsupported() throws Exception {
		context.unbind(A_NAME);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void unbindByNameOperationUnsupported() throws Exception {
		context.unbind((Name) null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void renameByStringOperationUnsupported() throws Exception {
		context.rename(A_NAME, OTHER_NAME);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void renameByNameOperationUnsupported() throws Exception {
		context.rename((Name) null, (Name) null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listByStringOperationUnsupported() throws Exception {
		context.list(A_NAME);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listByNameOperationUnsupported() throws Exception {
		context.list((Name) null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listBindingsByStringOperationUnsupported() throws Exception {
		context.listBindings(A_NAME);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listBindingsByNameOperationUnsupported() throws Exception {
		context.listBindings((Name) null);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void destroySubcontextByStringOperationUnsupported() throws Exception {
		context.destroySubcontext(A_NAME);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void destroySubcontextByNameOperationUnsupported() throws Exception {
		context.destroySubcontext((Name) null);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void createSubcontextByStringOperationUnsupported() throws Exception {
		context.createSubcontext(A_NAME);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void createSubcontextByNameOperationUnsupported() throws Exception {
		context.createSubcontext((Name) null);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void lookupLinkByStringOperationUnsupported() throws Exception {
		context.lookupLink(A_NAME);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void lookupLinkByNameOperationUnsupported() throws Exception {
		context.lookupLink((Name) null);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void getNameParserByStringOperationUnsupported() throws Exception {
		context.getNameParser(A_NAME);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void getNameParserByNameOperationUnsupported() throws Exception {
		context.getNameParser((Name) null);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void composeNameByStringOperationUnsupported() throws Exception {
		context.composeName(A_NAME, OTHER_NAME);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void composeNameByNameOperationUnsupported() throws Exception {
		context.composeName((Name) null, (Name)null);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void addToEnvironmentOperationUnsupported() throws Exception {
		context.addToEnvironment(A_NAME, AN_OBJECT);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void removeFromEnvironmentOperationUnsupported() throws Exception {
		context.removeFromEnvironment(A_NAME);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void getEnvironmentOperationUnsupported() throws Exception {
		context.getEnvironment();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void closeOperationUnsupported() throws Exception {
		context.close();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void getNameInNamespaceOperationUnsupported() throws Exception {
		context.getNameInNamespace();
	}
}
