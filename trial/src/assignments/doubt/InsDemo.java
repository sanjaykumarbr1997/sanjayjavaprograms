package assignments.doubt;

public class InsDemo {
	
	public static void main(String[] args) {
		
	 

		
		int[] iSort = {7,6,3,24,5,224,4};

	
		for (int i = 0; i < iSort.length; i++) {
			int compare = iSort[i];
			int j = i-1;
			while (j >=0 && compare < iSort[j]) {
				iSort[j+1]= iSort[j];
				j=j-1;
			}
			iSort[j+1]=compare;
			
			for(int n=0;n<iSort.length;n++) {
				System.out.print(iSort[n]+" ");
			}
			System.out.println();
			
		}
		System.out.println("After sorting");
		
		for(int m=0;m<iSort.length;m++) {
			System.out.print(iSort[m]+" ");
		}
		System.out.println();
	}

}
