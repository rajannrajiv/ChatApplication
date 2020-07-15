package com.udacity.jwdnd.c1.review;

import com.udacity.jwdnd.c1.review.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}
	/*@Bean
	public String message()
	{
		System.out.println("creating message bean");
		return "Hello Spring!";
	}

	@Bean
	public String UpperCaseMessage(MessageService msg)
	{
		System.out.println("Creating UpperCasemessage bean");
		return  msg.uppercase();
	}
	@Bean
	public String LowerCaseMessage(MessageService msg)
	{
		System.out.println("Creating lowerCasemessage bean");
		return msg.lowercase();
	}
*/
}
