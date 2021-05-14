package assignments.doubt;

public class CombinedSort {
	
public static void main(String[] args) {
		
		int ar1[] = {12,11,25,123,523,234,23,};
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
			
			int smallest = ar1[index]; //12
			ar1[index]= ar1[l];  //ar1[4]= ar1[0]
			ar1[l]=smallest;	
			
			
			
			
		}
		
		
		System.out.println();
			
		System.out.println("after sorting");
		for(int i=0;i<ar1.length;i++) {
			System.out.print(ar1[i]+" ");
		}	
	}

}
