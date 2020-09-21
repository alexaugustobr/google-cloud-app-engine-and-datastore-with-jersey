package com.example.appengine.kotlin.application

import com.example.appengine.kotlin.domain.Greeting
import com.google.inject.Singleton

@Singleton
class GreetingService {

    fun createNew(name: String): Greeting {
        return Greeting(greeting, name)
    }

    companion object {
        const val greeting = "Hello"
    }
}