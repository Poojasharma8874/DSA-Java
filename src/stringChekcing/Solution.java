package stringChekcing;
import java.util.Arrays;

class Solution {

    private boolean allZero(int[] arr) {
        for (int x : arr) if (x != 0) return false;
        return true;
    }

    // Main function: counts valid selections
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) continue; // only start from zero positions

            for (int dirStart : new int[]{-1, 1}) {
                int[] arr = nums.clone(); // fresh copy for this simulation
                int curr = i;
                int dir = dirStart;
System.out.println("direction of dir" + dir);
                // Debug print to see start
                System.out.println("Start at " + i + " dir=" + dirStart + " arr=" + Arrays.toString(arr));

                // simulate until we step out of bounds
                while (curr >= 0 && curr < n) {
                    System.out.println("  Before: " + Arrays.toString(arr) + " curr=" + curr + " dir=" + dir);
                    if (arr[curr] == 0) {
                        // just move in same direction
                        curr += dir;
                    } else {
                        // decrement, reverse direction, then move once
                        arr[curr]--;
                        dir = -dir;
                        curr += dir;
                    }
                    System.out.println("  After:  " + Arrays.toString(arr) + " curr now=" + curr + " dir now=" + dir);
                }

                // Check result
                System.out.println("  End arr=" + Arrays.toString(arr));
                if (allZero(arr)) {
                    System.out.println("  --> VALID start " + i + " dir=" + dirStart);
                    count++;
                } else {
                    System.out.println("  --> NOT valid start " + i + " dir=" + dirStart);
                }
            }
        }

        return count;
    }

    // quick test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,0,2,0,3};
        System.out.println("Total valid = " + sol.countValidSelections(nums));
    }
}
