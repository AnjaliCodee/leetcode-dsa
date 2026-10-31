package Strings;

class Pivot{
    public int pivotIndex(int[] nums) {
        int leftSum=0,rightSum=0;
        for(int i=0;i<nums.length;i++){
            rightSum+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            if(leftSum==rightSum-nums[i]){
                return i;
            }
            leftSum+=nums[i];
            rightSum-=nums[i];
        }
        return -1;
    }
}