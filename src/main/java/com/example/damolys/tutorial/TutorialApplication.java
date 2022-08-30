package com.example.damolys.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
	ApplicationContext app = SpringApplication.run(TutorialApplication.class, args);
		for(String s: app.getBeanDefinitionNames()){
			System.out.println(s);
		}

		Scanner scaner = new Scanner(System.in);
		scaner.nextInt();
	}


}
