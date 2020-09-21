package com.example.appengine.java8.infrastructure;

import com.example.appengine.kotlin.application.GreetingService;
import com.google.inject.AbstractModule;

public class ApplicationModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(GreetingService.class);
	}
}