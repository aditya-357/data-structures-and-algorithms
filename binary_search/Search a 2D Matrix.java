class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        // int low = 0, high = n - 1;

        // while (low <= high) {
        //     int mid = (low + high) / 2;

        //     if (matrix[mid][0] <= target && matrix[mid][m - 1] >= target) {

        //         int left = 0, right = m - 1;

        //         while (left <= right) {
        //             int midcol = (left + right) / 2;

        //             if (matrix[mid][midcol] == target){
        //                 return true; }
        //             else if (matrix[mid][midcol] < target){
        //                 left = midcol + 1;}
        //             else {
        //                 right = midcol - 1;
        //             }
        //         }
        //         return false;

        //     } else if( matrix[mid][m-1] < target ) {
        //         low=mid+1;

        //     }
        //     else{ high = mid -1; }
        // }
        // return false;

        int low = 0, high = n * m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int row = mid / m, col = mid % m;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;

    }
}