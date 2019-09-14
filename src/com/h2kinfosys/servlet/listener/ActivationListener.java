package com.h2kinfosys.servlet.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class ActivationListener implements HttpSessionActivationListener {
	
	/*
	 * Session is going to passivate - and transfered - so please get rid of it
	 */
	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		HttpSessionActivationListener.super.sessionWillPassivate(se);
	}
	
	
	// Session is ready now - add objects back
	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		HttpSessionActivationListener.super.sessionDidActivate(se);
	}

}
