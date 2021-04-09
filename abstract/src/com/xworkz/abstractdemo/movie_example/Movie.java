package com.xworkz.abstractdemo.movie_example;

public abstract class Movie {
	
	void play() {
		System.out.println("Movie is playing");
	}
	
	abstract void releaseYear();
	abstract void noOfCrew();
	abstract void ratings();
	

}
