import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Contains duplicate II
         * 
         * Given an integer array nums and an integer k, return true if there are two
         * distinct indices i and j in the array such that nums[i]=nums[j] and abs (i-j)
         * <=k
         */
        int[] nums = { 0, 5, 4, 2, 5, 1, 6 };
        int k = 3;
        System.out.println("Hello, World!");
        Solution solution = new Solution();
        boolean containsDuplicatesNearby = solution.containsNearbyDuplicate(nums, k);
        System.out.println("Does the given input string " + Arrays.toString(nums) + " contains dupiactes nearby:"
                + containsDuplicatesNearby);
    }
}
