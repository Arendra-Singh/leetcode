class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);              // skip this if already sorted
        int lo = 0, hi = nums.length;   // hi = n, since the answer can be n

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > mid) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
    }
