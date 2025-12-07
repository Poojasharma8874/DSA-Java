package stringChekcing;

import java.util.Arrays;

public class ThreeSum_Target {

	public static void main(String[] args) {
		int []arr = {-1,0,1,1,2,-1,-4};
		int target = 0;
		Arrays.sort(arr);
		for(int i=0; i< arr.length -2; i++) {
			if(i > 0 && arr[i] == arr[i-1]) 
				continue;
			int left = i+1;
			int right = arr.length -1;
			while(left < right) {
				int sum = arr[i] + arr[left] + arr[right];
				if(sum == target) {
//					System.out.print("Matched triplet" +arr[i] + ","+  arr[left] + ","+ arr[right]);
					System.out.println(Arrays.asList(arr[i], arr[left], arr[right]));
					while(left< right && arr[left] == arr[left+1]) { left++; }
					while(left<right && arr[right] == arr[right-1]) {right--; }
					left++;
					right--;
				}
				else if (sum < target) {
					left++;
				} else {
					right--;
				}
			}
			}
		
	}

}
