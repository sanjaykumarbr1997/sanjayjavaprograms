package com.xworkz.stringutils;
import org.apache.commons.lang3.StringUtils;
public class StringUtilsDemo {

	public static void main(String[] args) {
		
		
		String name = "Hello everyone, i hope you all are well";
		String name1 = "Hello everyone, i hope you all are well";

		
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
		
		//center - keeps the string in center for given size;
		System.out.println(StringUtils.center(name, 50));
		
		//compareIgnoreCase
		System.out.println(StringUtils.compareIgnoreCase(name, name1));
		
		//countMatches
		System.out.println(StringUtils.countMatches(name, 'e'));
		
		
		//leftPad -- gives spaces to the left , if string size is lesser than the width given
		System.out.println(StringUtils.leftPad(name, 60));
		
		//normalizeSpace = omits out unwanted spaces
		String name2 = "Hello    everyone, i     hope you all are well";
		System.out.println(StringUtils.normalizeSpace(name2));
		
		
		//strip - similar to trim , deltets unwanted spaces at start and end
		String name3 = "     Hello everyone, i hope you all are well   ";
		System.out.println(StringUtils.strip(name3));
		
		
		
		
	}

}
