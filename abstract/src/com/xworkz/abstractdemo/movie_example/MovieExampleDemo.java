package com.xworkz.abstractdemo.movie_example;

public class MovieExampleDemo {

	public static void main(String[] args) {
		
		KungfuPanda kfp = new KungfuPanda();
		kfp.noOfCrew();
		kfp.ratings();
		kfp.releaseYear();
		
		StarTrek st = new StarTrek();
		st.noOfCrew();
		st.ratings();
		
		
		st.releaseYear();
		
		Terminator term = new Terminator();
		term.noOfCrew();
		term.ratings();
		term.releaseYear();
		term.play();
		
		

			
		
			
		

	}

}
