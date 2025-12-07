package stringChekcing;
public class MergedArray {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,};
		int[] arr2 = {7,8,9};
		int[] newArr = new int[arr1.length + arr2.length];
//		int n = arr1.length + arr2.length;
		int index = 0;
		for(int i = 0; i<arr1.length; i++) {
			newArr[index] += arr1[i]; 
			index++;
//			System.out.println(newArr[i]);
			
		}
		for(int j=0; j< arr2.length; j++) {
			newArr[index] = arr2[j];
			index++;
//System.out.println(newArr[]);

		}
		
//		for(int arr3 : newArr) {
//			System.out.println(arr3);
//		}
		
	}

}
