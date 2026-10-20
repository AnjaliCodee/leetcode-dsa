package Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return String.valueOf(max);
    }
}
