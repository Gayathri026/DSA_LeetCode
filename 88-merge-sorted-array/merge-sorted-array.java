class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=nums1.length-1;
        for(int i=nums2.length-1;i>=0;i--){
             
            nums1[a] = nums2[i];
            a--;
        }
        Arrays.sort(nums1);
    }
}