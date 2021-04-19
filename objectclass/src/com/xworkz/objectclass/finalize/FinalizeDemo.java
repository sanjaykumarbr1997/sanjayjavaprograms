package com.xworkz.objectclass.finalize;

public class FinalizeDemo {

	public static void main(String[] args) {
		Battery battery = new Battery();
		System.gc();
		System.out.println(battery);
		//System.out.println(battery.brand);

	}

}
