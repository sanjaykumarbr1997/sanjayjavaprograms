package com.xworkz.java_revision.person_info;

public class PersonInfo {
	
	static String name ;
	static PersonStatus status;
	static long contactNo;
	static Gender gender ;
	
	
	static void setInfo(String nName ,PersonStatus nStatus,long nContactNo,Gender nGender) {
		
		name =nName;
		status = nStatus;
		contactNo = nContactNo;
		gender = nGender;
		
		
		
	}
	
	static void displayAll() {
		System.out.println("Name:"+name);
		System.out.println("Person status:"+status);
		System.out.println("Contact No:"+contactNo);
		System.out.println("Gender:"+gender);
	}

}
