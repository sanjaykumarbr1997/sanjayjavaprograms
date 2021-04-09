package com.xworkz.interfacedemo.interface_example.dvd_example;

public class DVDTypeExample {

	public static void main(String[] args) {
		
		DVD5 dvd5 = new DVD5();
		DVD9 dvd9 = new DVD9();
		DVD10 dvd10 = new DVD10();
		DVDPlayer dvdplayer = new DVDPlayer();
		
		dvdplayer.slot(dvd10);
		dvdplayer.slot(dvd9);
		dvdplayer.slot(dvd5);
		
		
		
		

	}

}
