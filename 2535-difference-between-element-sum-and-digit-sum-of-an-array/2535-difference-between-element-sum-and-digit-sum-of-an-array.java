class Solution {
    public int differenceOfSum(int[] nums) {

        int Esum=0;
        int Dsum=0;

        for(int num:nums){
            Esum+=num;

        }

        for(int i=0;i<nums.length;i++){
         
         while(nums[i]!=0){
            int digit=nums[i]%10;
            Dsum+=digit;
            nums[i]=nums[i]/10;
         }
        }
        return Esum-Dsum;
    }
}