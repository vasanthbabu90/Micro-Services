package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "main.controllers"})
public class Application {
	public static void main(String[] args) {
		System.out.println("Starting Spring Application...");
		SpringApplication.run(Application.class, args);
	}
}