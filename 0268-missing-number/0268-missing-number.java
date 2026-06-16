class Solution {
    public int missingNumber(int[] nums) {

        int n=nums.length;

        int expected=n*(n+1)/2;

        int Actual=0;

        for(int num:nums){
            Actual+=num;
        }

        return expected-Actual;
        
    }
}