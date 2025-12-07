package stringChekcing;

public class PairSumSortedArray {

	public static void main(String[] args) {
		int[] arr = {1,2,5,6,7,8,9,10};
		int target = 9;
		int sum = 0;
		
		int left=0, right =arr.length -1;
		
		while(left < right) {
			sum = arr[left] + arr[right];
			if(sum == target) {
				System.out.println(sum);
				System.out.println(target);
				System.out.println("sum pair exits");
			 break;
			} else if(sum < target) {
				left++;
			}else if(sum > target) {
				right--;
			} else {
				System.out.println("pair does not exists");
			}
		}

	}

}
