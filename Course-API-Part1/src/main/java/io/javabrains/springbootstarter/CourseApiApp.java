package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * In directory: 'src/main/resources' there's an 'aplication.properties' file in which we set 
 * our working port to 'http://localhost:8081'
 * Since we're using port 8081 with Tomcat Server for our 1st RESTful web service,
 * it's important to make sure no PID's are listening to port 'http://localhost:8081' before running application  
 * Since my OS is Windows, I will list the Windows commands to kill PID's listening to port 8081
 * -------> Linux OS Assistance for Ports: 
 * 				https://til.hashrocket.com/posts/e4c8c665a8-find-and-kill-all-processes-listening-on-a-port



C:\Users\vicente.cruz>netstat -ano | findstr :8081                                          | ----> command to identify what PID is listening to port 'http://localhost:8081'
  TCP    0.0.0.0:8081           0.0.0.0:0              LISTENING       13768				|
  TCP    [::]:8081              [::]:0                 LISTENING       13768				|
																							|
C:\Users\vicente.cruz>taskkill /PID 13768 /F												| -----> kill command for PID from listening to port 'http://localhost:8081'
SUCCESS: The process with PID 13768 has been terminated.									|
																							|
C:\Users\vicente.cruz>netstat -ano | findstr :8081											| -----> verify no other PID is listening before starting CourseApiApp.java class

C:\Users\vicente.cruz>



 *  
 *  Finally, double check with Spring Boot Console to make sure Tomcat Server successfully connected to port 'http://localhost:8081' 
 */

// Creation of SpringBoot Application
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		
		SpringApplication.run(CourseApiApp.class, args);

	}

}
