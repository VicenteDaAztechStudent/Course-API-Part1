//SpringBoot QS 11

package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Annotation to make class REST Controller
@RestController

public class HelloController {
	
	// Annotation with parameter that takes request
	// When typing '/hello' in the URL 
	// Since we're using port 8080 with Tomcat Server, you access the sayHi() method
	// with http://localhost:8081/hello
	
	@RequestMapping("/hello")
	
	// Should return this method
	// Returns 'Hi' back
	public String sayHi() {
		return "Hi, hope all is well with you and your loved ones. \n"
				+ "Welcome to DaAztechStudent's 1st RESTful web service!";
	}
}
