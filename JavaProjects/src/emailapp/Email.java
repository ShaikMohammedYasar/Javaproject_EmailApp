package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=500;
	private int defaultPasswordLength =9;
	private String alternateEmail;
	private String companySuffex="hillco.com";

	
	// need constructor to recieve fname and lname
	public Email(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		//System.out.println("EMAIL CREATED:  " + this.firstName + " "+ this.lastName);
		
		// call method asking for dep:  return the dep
		this.department=setDeprtment();
		//System.out.println("Department :" +this.department);
		
		// call a method that return a random password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is:"+ this.password);
		
		//combine elements to generate email
		email =firstName.toLowerCase() +"."+lastName.toLowerCase() +"@"+ department+"."+companySuffex;
		//	System.out.println("Your email is:" +this.email);
	}
	//ask dept
	
	private String setDeprtment()
	{
		System.out.println("New Employee: "+firstName +".DEPARTMENT CODES \n1 for Sales \n2 for Development\n3 for Accounting\n0 for none \nEnter department code:");
		Scanner in=new Scanner(System.in);
		int depChoice =in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "dev";}
		else if(depChoice==3) {return "acc";}
		else {return " "; }
	}
	
	//generate a random password
	 private String randomPassword(int length)
	 {
		 String passwordSet= "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
		 char[] password=new char[length];
		 for(int i=0;i<length;i++)
		 {
			 int rand =(int) (Math.random() *passwordSet.length());
			 password[i]=passwordSet.charAt(rand);
		 }
		 return new String(password);
	 }
	//set the mailbox capacity
	 public void setMailboxCapacity(int capacity)
	 {
		 this.mailboxCapacity = capacity;
	 }
	// set alternative email
	 
	 public void setAlternateEmail(String altEmail)
	 {
		 this.alternateEmail=altEmail;
	 }
	//change the password
	 
	 public void changePassword(String password)
	 {
		 this.password=password;
	 }
	 
	 public int getMailboxCapacity() {return mailboxCapacity;}
	 public String getAlternateEmail() {return alternateEmail;}
	 public String getPassword() {return password;}
	 
	 public String showInfo()
	 {
		 return "DISPLAY NAME: " +firstName+ ""+lastName+
				 "\nCOMPANY EMAIL: " +email+
				 "\nMAILBOX CAPACITY : " +mailboxCapacity +"mb";
	 }
	
	
}
