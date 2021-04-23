package com.xworkz.arrays.assignment_enum;

public class EnumSwitchDemo {
	
	enum Day{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	}
	
	Day day;
	public EnumSwitchDemo(Day day) {
		this.day = day;
	}
	
	public void dayIsLike() {
		switch (day) {
		
		case MONDAY:
			System.out.println("Mondays are boring");
			break;
			
		case TUESDAY:
			System.out.println("Tuesdays are better");
			break;
			
		case WEDNESDAY:
			System.out.println("Wednesdays are ok");
			break;
		case THURSDAY:
			System.out.println("Thursdays are ok ok");
			break;
			
		case FRIDAY:
			System.out.println("Fridays are somewhat good");
			break;
			
		case SATURDAY:
			System.out.println("Saturdays are very good");
			break;	
		
		
		}
	}
	
	public static void main(String[] args) {
		String str = "MONDAY";
		EnumSwitchDemo eas = new EnumSwitchDemo(Day.valueOf(str));
		eas.dayIsLike();
	}

}
