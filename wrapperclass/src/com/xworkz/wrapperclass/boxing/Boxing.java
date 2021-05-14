package com.xworkz.wrapperclass.boxing;

public class Boxing{
	
	

		public static void main(String[] args) {
			
			int a = 10;
			boolean bb = false;
			float f = 2.5f;

			Integer i = Integer.valueOf(a);  //explicit boxing
			Integer j = a;  //autoboxing
			
			Boolean b1 = Boolean.valueOf(bb);
			Boolean b2 = bb;
			
			Float f1 = f;
			Float f2 = Float.valueOf(f1);
			
			System.out.println(i);
			System.out.println(j);
			System.out.println(b1);
			System.out.println(b2);
			System.out.println(f1);
			System.out.println(f2);



		}

	}



