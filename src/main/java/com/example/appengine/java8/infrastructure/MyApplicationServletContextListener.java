package com.example.appengine.java8.infrastructure;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class MyApplicationServletContextListener extends GuiceServletContextListener {
	
	public static Injector injector;
	
	@Override
	protected Injector getInjector() {
		injector = Guice.createInjector(new ServletModule() {
			@Override
			protected void configureServlets() {
				install(new ApplicationModule());
			}
		});
		return injector;
	}
}
