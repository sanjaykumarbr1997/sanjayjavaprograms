package assignments.doubt;

public class MyInsDemo {

	public static void main(String[] args) { 
		
		int array1[]= {7,6,3,24,5,224,4};
		
		for(int ar:array1) {
			System.out.print(ar+" ");
		}
		
		System.out.println();
		for(int i=1;i<array1.length;i++) {
			System.out.println("value of i is "+i);
			
			int number=array1[i];
			
			for(int j =i-1;j>-1;j--) {
				System.out.println("j value is "+j);
				if(number<array1[j] ) {
					
					int largest= array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=largest;
					
					for(int ar:array1) {
						System.out.print(ar+" ");
					}
					System.out.println();
				}
			}
			
			System.out.println();
		}
		
		for(int ar:array1) {
			System.out.print(ar+" ");
		}
		
		
		

	}

}
