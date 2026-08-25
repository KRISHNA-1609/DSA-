import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);  // Step 1: Sort the array
        int closestSum = nums[0] + nums[1] + nums[2];  // Initialize with first triplet

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Update closest sum if needed
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    // Perfect match found
                    return currentSum;
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println(s.threeSumClosest(nums1, target1)); // Output: 2

        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println(s.threeSumClosest(nums2, target2)); // Output: 0
    }
}
 