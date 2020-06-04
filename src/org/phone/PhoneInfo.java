package org.phone;

import java.util.Scanner;

public class PhoneInfo {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		 System.out.println("Enter the Age");
		 byte age = a.nextByte();
		 System.out.println("my age is "+age);
		 System.out.println("Enter the atm pin");
		 short atm = a.nextShort();
		 System.out.println("my atm pin is "+atm);
		 System.out.println("Enter the Pincode");
		 int pincode = a.nextInt();
		 System.out.println("my pincode is "+pincode);
		 System.out.println("Enter the phone number");
		 long phoneNo = a.nextLong();
		 System.out.println("my mobile no is "+phoneNo);
		 System.out.println("Enter the first Name");
		  String firstName = a.nextLine();
		  byte firstame = a.nextByte();
		 System.out.println("my first name is "+firstName);
		 }
	
}