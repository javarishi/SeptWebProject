package com.h2kinfosys.servlet;

import java.io.Serializable;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Customer implements Serializable, HttpSessionBindingListener {
	
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("Customer Object is Going inside the session");
	}
	
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("Customer Object is Going outside the session");
	}

}
