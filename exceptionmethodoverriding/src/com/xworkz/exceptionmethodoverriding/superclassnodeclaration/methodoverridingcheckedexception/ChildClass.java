package com.xworkz.exceptionmethodoverriding.superclassnodeclaration.methodoverridingcheckedexception;
import java.io.IOException;
public class ChildClass extends ParentClass {
	
	//@Override
	void name() throws IOException {
		System.out.println("child class");
	}



}
