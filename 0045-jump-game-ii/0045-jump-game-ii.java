class Solution {
    public int jump(int[] nums) {

        int jump=0;
        int currentend=0;
        int maxreach=0;

        for(int i=0;i<nums.length-1;i++){
            maxreach=Math.max(maxreach,i+nums[i]);

            if(i==currentend){
                jump++;
                currentend=maxreach;
            }
        }

        return jump;
        
    }
}