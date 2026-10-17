import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int n = s.length();
        char arrA[] = s.toCharArray();
        char arrB[] = t.toCharArray();
        java.util.Arrays.sort(arrA);
        java.util.Arrays.sort(arrB);
        int i = 0;
        int j = 0;
        while(i<n && j<n){
            if(arrA[i]!=arrB[j]){
               return false;
            }
            i++;
            j++;
        }
        return true;
    }
}