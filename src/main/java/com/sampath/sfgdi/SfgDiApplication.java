package com.sampath.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sampath.sfgdi.controller.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);
		
		MyController myController = (MyController) ctx.getBean("myController");
		
		String greetingString = myController.myString();
		
		System.out.println(greetingString);
	}

}
