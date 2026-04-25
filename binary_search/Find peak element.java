class Solution {
    public int findPeakElement(int[] nums) {
    
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Compare nums[mid] with nums[mid + 1]
            if (nums[mid] < nums[mid + 1]) {
                // Peak must be on the right side
                low = mid + 1;
            } else {
                // Peak is on the left side (including mid)
                high = mid;
            }
        }

        // low and high will eventually converge at the peak
        return low;


    }
}