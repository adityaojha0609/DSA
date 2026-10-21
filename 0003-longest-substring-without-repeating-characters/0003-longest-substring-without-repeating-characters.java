class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int count = 0;

        while (j < n) {
            int k = i;

            while (k < j) {
                if (s.charAt(k) == s.charAt(j)) {
                    i = k + 1;
                    break;
                }
                k++;
            }

            j++;

            if (j - i > count) {
                count = j - i;
            }
        }

        return count;
    }
}