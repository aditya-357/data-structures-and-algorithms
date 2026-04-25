 class Solution {
    public int NthRoot(int N, int M) {
       int low = 1, high = M;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

           double power = Math.pow(mid,N);
            if (power == M) {
                return mid;
            } else if (power < M) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Return -1 if no integer root exists
    }
  
    }
