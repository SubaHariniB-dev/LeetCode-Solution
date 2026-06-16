class Solution {
    public int minCostToMoveChips(int[] position) {

        int ecount=0;
        int oddcount=0;
        for(int pos:position){
            if(pos%2==0){
                ecount++;
            }
            else{
                oddcount++;
            }
            
        }
        return Math.min(ecount,oddcount);
        
    }
}