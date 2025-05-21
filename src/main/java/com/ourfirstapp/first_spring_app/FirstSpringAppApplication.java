package com.ourfirstapp.first_spring_app;

import com.ourfirstapp.first_spring_app.model.Address;
import com.ourfirstapp.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@ComponentScan
//@Configuration
//@EnableAutoConfiguration
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("Hello everyone, welcome to first spring app!");
		// example for tight coupling
//		Employee emp = new Employee();
//		emp.id = 123;
//
//		Address adrs = new Address();emp.name="Ajay";
//		emp.email="ajay123@gmail.com";
//		emp.designation="Junior developer";
//
//		adrs.doorNo=999;
//		adrs.streetName="some street";
//		adrs.city="some city";
//
//		emp.address= adrs;
//
//		System.out.println("emp is : "+emp);
//		System.out.println("adrs is : "+adrs);
//
//		adrs.streetName="new street";
//		adrs.city="new city";
//		System.out.println("emp after address change  is : "+emp);
//		System.out.println("adrs after address change is : "+adrs);

		// loose coupling

		// setter injection
//		Employee emp1 = new Employee();
//		emp1.setId(234);
//		emp1.setName("Vijay");
//		emp1.setEmail("vijay123@gmail.com");
//		emp1.setDesignation("Junior developer");
//
//		Address adrs1 = new Address();
//		adrs1.setDoorNo(777);
//		adrs1.setStreetName("ABCDE");
//		adrs1.setCity("PQRDF");
//
//		emp1.setAddress(adrs1);
//
//		System.out.println("emp1 is : "+emp1);
//		System.out.println("adrs1 is :"+adrs1);
//
//		// changing address with emp1 object
//		emp1.getAddress().setStreetName("BBBBBBB");
//		emp1.getAddress().setCity("LLLLLLL");
//
//		System.out.println("emp1 after changing adrs1 is : "+emp1);
//		System.out.println("adrs1 after changing adrs1 is :"+adrs1);
//
//		// constructor injection
//		Address adrs2 = new Address(888, "OOOOO","PPPPPP");
//		Employee emp2 = new Employee(555,"Snajay","sanjay123@gmail.com","tester",adrs2);
//
//		System.out.println("emp2 is : "+emp2);
//		System.out.println("adrs2 is : "+adrs2);
//
//		emp2.getAddress().setCity("EEEEEE");
//		System.out.println("emp2 after changing adrs2 is : "+emp2);
//		System.out.println("adrs2 after changing adrs2 is : "+adrs2);
	}

}
