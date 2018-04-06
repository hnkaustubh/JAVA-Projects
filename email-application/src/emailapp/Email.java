package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private String companySuffix = "apple.com";
	private int defaultPasswordLength = 10;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	
	//Constructor to receive the FirstName and the LastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: "+this.firstName + " "+this.lastName);
		System.out.println();
		
		//Call a method asking for the Department
		this.department = setDepartment();
		
		//Call a method that returns a Random Password
		this.password = randomPassword(defaultPasswordLength);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
	//Ask for the Department
	private String setDepartment() {
		System.out.println("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code");
		Scanner s = new Scanner(System.in);
		int depChoice = s.nextInt();
		if(depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "development";}
		else if(depChoice == 3) {return "accounting";}
		else {return "";}
	}
	
	//Ask for the Password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	//Set the Mailbox Capacity
	public void setMailboxCapacity(int capacity) {	
		this.mailboxCapacity = capacity;
	}

	//Set an Alternate Email
	public void setAleternateEmail(String altemail) {
		this.alternateEmail = altemail;
	}
	
	//A method for an employee wanting to change his/her password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	
	public String getAlternateEmail() {return alternateEmail;}
	
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "\nNAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb" +
				"\nPASSWORD: " + password;
	}
}





