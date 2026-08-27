class Solution {
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while(i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if(i >= 0) {
            int j = nums.length - 1;

            while(nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        int left = i + 1;
        int right = nums.length - 1;

        while(left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}