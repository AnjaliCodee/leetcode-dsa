package Greedy;
import java.util.Arrays;

class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int maxVal=nums[nums.length-1];
        int[] dp=new int[maxVal+2];
        int maxLen=0;

        for(int num:nums){
            dp[num+1]=dp[num]+1;
            dp[num]=dp[num-1]+1;
            maxLen=Math.max(maxLen,Math.max(dp[num],dp[num+1]));
        }
        return maxLen;
    }
}
