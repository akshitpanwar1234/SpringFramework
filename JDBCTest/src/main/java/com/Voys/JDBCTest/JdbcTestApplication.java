package com.Voys.JDBCTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Voys.JDBCTest.Model.Alien;

@SpringBootApplication
public class JdbcTestApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(JdbcTestApplication.class, args);
		Alien obj = context.getBean(Alien.class);
		obj.setId(111);
		obj.setName("Akshit");
		obj.setTech("JAVA");
		
		AlienDAO alienDAO = context.getBean(AlienDAO.class);
		alienDAO.save(obj);
		System.out.println(alienDAO.findAll());
		
		
	}

}
