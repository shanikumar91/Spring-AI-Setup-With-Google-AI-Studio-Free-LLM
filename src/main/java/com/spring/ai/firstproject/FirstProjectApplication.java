package com.spring.ai.firstproject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Spring AI Setup with Google AI Studio
//        --> Generate  Google AI Studio API Key
//        --> Create a Spring boot project
//        --> Add Dependencies in pom.xml
//        --> Configure API Key in application.properties
//        --> Autowired ChatClient.Builder
@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}

}
