package stringChekcing;

public class RemoveDuplicatedSortedArray {

	public static void main(String[] args) {
	int arr[] = {1,1,2,2,3,3,4,4,5,5};
	int x = 0;

	for(int i=1;i<arr.length ; i++) {
		
		if(arr[i] != arr[x]) {
			x++;
			arr[x] = arr[i] ; 
		
			
		}
	}
	System.out.println("Unoque counts: " + (x+1));
	
	for(int i=0; i < x; i++) {
		System.out.println(arr[i]);
	}
	}

}
