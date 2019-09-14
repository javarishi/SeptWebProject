package com.h2kinfosys.servlet.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class TestRequestListener 
				implements ServletRequestListener, ServletRequestAttributeListener{
	
	
	/*
	 * Request Life CYcle Events
	 */
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("TestRequestListener :: requestInitialized ");
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("TestRequestListener :: requestDestroyed ");
	}
	
	/*
	 * Attribute Listeners - added , replaced, removed
	 */
	
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("TestRequestListener :: attributeAdded " + srae.getName() 
		+ "added value " + srae.getValue()  );
	}
	
	
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("TestRequestListener :: attributeReplaced " + srae.getName()
			+ "Old Value :: " + srae.getValue()  );
	}
	
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("TestRequestListener :: attributeRemoved " + srae.getName()
		+ "removed value " + srae.getValue()  );
	}
}
