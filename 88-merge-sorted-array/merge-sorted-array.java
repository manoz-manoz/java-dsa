import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=m+n-1;
        n=n-1;
        while(j>=m)
        {
            nums1[j--]=nums2[n--];

        }
        Arrays.sort(nums1);
    }
}