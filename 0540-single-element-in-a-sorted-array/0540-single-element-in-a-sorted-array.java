class Solution {
    public int singleNonDuplicate(int[] A) {
        int n = A.length;

        if (n == 1) return A[0];

        int st = 0;
        int end = n - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            // First element
            if (mid == 0 && A[0] != A[1])
                return A[mid];

            // Last element
            if (mid == n - 1 && A[n - 1] != A[n - 2])
                return A[mid];

            // Unique element found
            if (A[mid - 1] != A[mid] && A[mid + 1] != A[mid])
                return A[mid];

            if (mid % 2 == 0) { // even index
                if (A[mid - 1] == A[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else { // odd index
                if (A[mid - 1] == A[mid]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}