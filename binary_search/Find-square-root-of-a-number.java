class Solution {
    public int floorSqrt(int n) {

        long low = 1, high = n;
        long ans = 1;

        while (low <= high) {
            long mid = (low + high) / 2;

            if (mid <= n / mid) {
                ans = mid;
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return (int) ans;
    }
}