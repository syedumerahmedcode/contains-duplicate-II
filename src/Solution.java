import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        /**
         * We have the additional data structure, HashSet to save numbers that have
         * already been read in a sliding window
         */
        Set<Integer> set = new HashSet<>();
        // We loop through the numbers
        for (int i = 0; i < nums.length; ++i) {
            // Checking the condition: nums[i]=nums[j]
            if (set.contains(nums[i])) {
                return true;
            }
            // if the number is not present already in the hashset, insert it in
            set.add(nums[i]);
            // If the size of the hashset is greater than k,. as in greater tha the sliding
            // window allowed.
            if (set.size() > k) {
                // remove the earliest element inserted in the sliding window.
                set.remove(nums[i - k]);
            }
        }
        return false;

    }
}
