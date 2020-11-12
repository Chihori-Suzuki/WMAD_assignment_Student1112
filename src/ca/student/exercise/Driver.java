package ca.student.exercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Driver {

	private static void printIterable(Iterator<Student> iterator) {
	    while (iterator.hasNext()) {
	    	Student s = iterator.next();
		    System.out.println(s);
		}
	}
	private static void removeIterable(Iterator<Student> iterator, int id) {
	    while (iterator.hasNext()) {
	    	Student s = iterator.next();
	    	if(s.getId() == id) {
	    		iterator.remove();
	    	}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		Student s1 = new Student(100, "email1@mail.com", "Aya Aikawa");
		Student s2 = new Student(200, "email2@mail.com", "Ami Yamakawa");
		Student s3 = new Student(300, "email3@mail.com", "Yuri Shido");
		
		System.out.println("Write your name, please.");
		int id = input.nextInt();
		System.out.println("Write your email, please");
		String email = input.nextLine();
		System.out.println("Write your name, please");
		String name = input.nextLine();

		Student s4 = new Student(id, email, name);
		
		
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		printIterable(list.iterator());
		
		System.out.println("Write the ID what you remove.");

		int delId = input.nextInt();
		
		removeIterable(list.iterator(), delId);
		System.out.println(list);
		
	}

}
