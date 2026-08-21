class Solution {
    public int largestAltitude(int[] gain) {
        int res=0;
        int temp=0;
        int n = gain.length;
        for(int i=0;i<n;i++){
            temp = temp + gain[i];
            if(temp>res){
                res=temp;
            }
        }
        return res;
    }
}
