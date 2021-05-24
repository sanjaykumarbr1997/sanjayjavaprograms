package com.xworkz.java_revision.bikeinfo;


public enum Model {
	
	//Y_2019,Y_2020,Y_2021;
	
	
	TWENTY_TWENTY(2020),TWENTY_TWENTY_ONE(2021);

	private int yearInWords;
	public int getyearInWords() {
		return this.yearInWords;
	}

	private Model(int yearInWords) {
		this.yearInWords = yearInWords;
	}
	 

	
	
	
	
}


	



