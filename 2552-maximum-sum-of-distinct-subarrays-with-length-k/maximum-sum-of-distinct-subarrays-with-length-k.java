class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        Set<Integer> hs = new HashSet<>();
        int j = 0;
        long sum = 0;
        long msum = 0;

        for (int i = 0; i < arr.length; i++) {
            while (hs.contains(arr[i])) {
                hs.remove(arr[j]);
                sum -= arr[j];
                j++;
            }

            hs.add(arr[i]);
            sum += arr[i];

            if (i - j + 1 == k) {
                msum = Math.max(msum, sum);

                hs.remove(arr[j]);
                sum -= arr[j];
                j++;
            }
        }

        return msum;
    }
}