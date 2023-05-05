package ThreeSumClosest;
//This is a really bad solution. Need to come back and clean up
//See problem here: https://leetcode.com/problems/3sum-closest/submissions/944675238/
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Integer closest = null;
        for(int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for( int j = i + 1; j < nums.length; j++) {
                int num2 = nums[j];
                for(int k = j + 1; k < nums.length; k++) {
                    int num3 = nums[k];
                    int total = num1 + num2 + num3;
                    if (closest == null || Math.abs(target-total) < Math.abs(target-closest) ) {
                        closest = total;
                    }
                }
            }
        }
        return closest;
    }
}
