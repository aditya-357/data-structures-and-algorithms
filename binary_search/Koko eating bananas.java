class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1, high = maxi(piles);

        while (low <= high) {
            int mid = (low + high) / 2;

            if (findhrs(piles, mid, h)) {

                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;

    }

    public int maxi(int[] arr) {

        int maxi = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > maxi)
                maxi = i;
        }
        return maxi;

    }

    public boolean findhrs(int[] arr, int mid, int h) {
        int hrs = 0;
        for (int i : arr) {
            hrs += Math.ceil((double) i / (double) mid);
        }
        return hrs <= h;

    }
}