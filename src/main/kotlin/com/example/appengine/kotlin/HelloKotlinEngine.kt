package com.example.appengine.kotlin

import com.google.appengine.api.utils.SystemProperty
import java.io.IOException
import java.util.*
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


@WebServlet(name = "HelloAppEngineKotlin", value = ["/hello-kotlin"])
class HelloAppEngine() : HttpServlet() {

    @kotlin.jvm.Throws(IOException::class)
    public override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        val properties: Properties = System.getProperties()
        response.contentType = "text/plain"
        response.writer.println(("Hello App Engine - Standard using "
                + SystemProperty.version.get() + " Java " + properties.get("java.specification.version")))
    }

    companion object {
        val info: String
            get() = ("Version: " + System.getProperty("java.version")
                    + " OS: " + System.getProperty("os.name")
                    + " User: " + System.getProperty("user.name"))
    }
}
