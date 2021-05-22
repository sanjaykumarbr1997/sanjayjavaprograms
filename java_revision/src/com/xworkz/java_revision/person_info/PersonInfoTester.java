package com.xworkz.java_revision.person_info;

public class PersonInfoTester {

	public static void main(String[] args) {
		
		
		PersonInfo.displayAll();
		PersonInfo.setInfo("Robert",PersonStatus.SINGLE,8997899746l,Gender.MALE) ;
		
		PersonInfo.displayAll();

	}

}
