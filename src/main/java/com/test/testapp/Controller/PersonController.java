package com.test.testapp.Controller;

import java.sql.Connection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.testapp.Data.DatabaseConnection;
import com.test.testapp.Data.MySqlConnection;
import com.test.testapp.Models.Student;

@RestController
@RequestMapping("/person")
@CrossOrigin(origins ="*")

public class PersonController {
	
	@GetMapping("/test")
	public Integer addNum() {
		
		String s = " test done";
		
		System.out.println("Enter number 1");
		int number1 = 119;
		System.out.print("Enter number 2");
		int number2 = 101;
		
		//two number add together
		
		int total = number1 + number2;
		
		
		//additionl 5 dollers add here
//		total =+ 5 + total;	
		total =+25 + total;
		
		System.out.println("a is : "+number1);
		System.out.println("b is : "+number2);
		System.out.println(" this is total of a + b = "+ total);
		
		if(total >= 225) {
			System.out.println("total is greter than 225");
			System.out.println("********");
		}
		else if(total > 200) {
//			else {
			System.out.println("total is grater than 200");
			System.out.println();
		}
		
		return  total;
	}
	
//	@GetMapping("/ht")
//	@PostMapping("/ht")
	@PutMapping("/ht/{id}")
	public Student stGet(@RequestBody Student stu,@PathVariable ("id") int id) {
		
		System.out.println("name is"+stu.getName());
		System.out.println(" this is id "+id);
		
//		test comand
		
//		test for main branch
		return null;
		
	}

}
