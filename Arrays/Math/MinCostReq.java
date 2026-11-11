package Arrays.Math;

class Solution7 {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long separateCost=(long) need1*cost1+(long) need2*cost2;
        long minNeed=Math.min(need1,need2);
        long mixedCost=minNeed*costBoth+(need1-minNeed)*cost1+(need2-minNeed)*cost2;
        long maxNeed=Math.max(need1,need2);
        long allBothCost=maxNeed*costBoth;
        return Math.min(separateCost,Math.min(mixedCost,allBothCost));
    }
}
