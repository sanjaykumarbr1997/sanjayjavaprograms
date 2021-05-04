package com.xworkz.stringutils;
import org.apache.commons.lang3.StringUtils;
public class StringUtilsDemo {

	public static void main(String[] args) {
		
		
		String name = "Hello everyone, i hope you all are well";
		
		// isEmpty
		System.out.println(StringUtils.isEmpty(name));
		
		// abbreviate - shorten string and append ellipsis(...)
		System.out.println(StringUtils.abbreviate(name, 7));
		
		// isBlank() - check if a string is all whitespaces , empty or null
		System.out.println(StringUtils.isBlank(name));
		
		//isNumeric() - checks if a string represents a positive integer
		System.out.println(StringUtils.isNumeric("-6"));
		
		//join - join an array together in to a single string
		Character na[] = {'A','P','P','L','E'};
		String joinedWithComma = StringUtils.join(na, ' ');
		System.out.println(joinedWithComma);
		
		
	}

}
