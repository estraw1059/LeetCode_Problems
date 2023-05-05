package ThreeSumClosest;


public class Tester {
    public static void main(String args[]) throws Exception {
        Solution s = new Solution();
        //Input: nums = [-1,2,1,-4], target = 1
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        int result = s.threeSumClosest(nums1, target1);
        if (result != 2) {
            throw new Exception("Incorrect");
        }

    }
}
