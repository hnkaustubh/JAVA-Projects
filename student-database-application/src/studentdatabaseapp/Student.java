package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600; 
	private static int id = 1000;
	
	// Constructor to prompt user to enter name and year
	public Student() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Name");
		this.firstName = s.nextLine();
		System.out.println("Enter the Last Name");
		this.lastName = s.nextLine();
		System.out.println("Enter the Student Grade Level\n 1.Freshman\n 2.Sophomore\n 3.Junior\n 4.Senior");
		this.gradeYear = s.nextInt();
		setStudentID();
	}
	
	
	// Generate an ID
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in Courses
	public void enroll() {
		// Get inside a loop, user hits a 0
		
		do {
			System.out.println("Enter a Course to enroll(Q to Quit): ");
			Scanner s = new Scanner(System.in);
			String course = s.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		}while(1 != 0);
	}
	// View Balance
	public void viewBalance() {
		System.out.println("Your Balance is: "+tuitionBalance);
	}
	
	// Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: Rs.");
		Scanner s = new Scanner(System.in);
		int payment = s.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of "+payment);
		viewBalance();
	}

	// Show Info
	public String toString() {
		return firstName + " " + lastName + " " + 
				"\nGrade Level: " + gradeYear +
				"\nStudent ID" + studentID + 
				"\nCourses Enrolled: " + courses + 
				"\n Balance: " + tuitionBalance;
	}
}
