package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {


			StudentService service = new StudentServiceImpl();
			Student student=new Student();
			
			
			 //Create Operation
//			student.setStudentid(300);
//			student.setName("Sajid");
//			service.addStudent(student);
			
			
			// Update Operation
			student = service.findStudentById(100);
			student.setName("Sachin Tendulkar");
			service.updateStudent(student);
			
			
			// Retrieve Operation
			student = service.findStudentById(100);
			System.out.print("ID:"+student.getStudentid());
			System.out.println(" Name:"+student.getName());
			
			
			// Update Operation
			student = service.findStudentById(500);
			student.setName("M S Dhoni");
			service.updateStudent(student);
			
			
			// Retrieve Operation
			student = service.findStudentById(500);
			System.out.print("ID:"+student.getStudentid());
			System.out.println(" Name:"+student.getName());
			
			student = service.findStudentById(1);
			service.removeStudent(student);
			System.out.println("End of program/Life cycle completed...");
	}
	
	

}
