package assignments.doubt;

public class CombinedSort {
	
public static void main(String[] args) {
		
		char ar1[] = {'A','2','b','5','C','3','d','9','E','2'};
		System.out.println("Before sorting");
		
		for(int i=0;i<ar1.length;i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		
		
		for(int l=0;l<ar1.length;l++) {
		
			int index=l;
			for(int j=l+1;j<ar1.length;j++) {
				if(ar1[j]<ar1[index]) {
					index=j;	
				}
				
			}
			
			char smallest = ar1[index];
			ar1[index]= ar1[l];
			ar1[l]=smallest;
			

			
			}
		System.out.println("after sorting");
		for(int i=0;i<ar1.length;i++) {
			System.out.print(ar1[i]+" ");
		}
			
			
			
			
		
			
			
	}


}
