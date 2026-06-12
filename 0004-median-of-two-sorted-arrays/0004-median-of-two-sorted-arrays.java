class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int count = 0;
        int[] arr = new int[nums1.length + nums2.length];
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                arr[count] = nums1[i];
                i++;
                count++;
            } else {
                arr[count] = nums2[j];
                j++;
                count++;
            }
        }
        while (i < nums1.length) {
            arr[count] = nums1[i];
            count++;
            i++;
        }
        while (j < nums2.length) {
            arr[count] = nums2[j];
            j++;
            count++;
        }
        int n = arr.length;
        double median = 0.0 ; 
        if(n%2!=0){
            median = arr[n/2];

        }
        else{
            median = (arr[n/2]+arr[n/2-1])/2.0;
        }
        return median;

    }
}