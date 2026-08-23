class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int res = 0;
        if(x<0){
            return false;
        }
        else if(x<10 && x>=0){
            return true;
        }
        while(num!=0){
            int temp = num%10;
            res = (res * 10) + temp;
            num = num/10;
        }

        return res==x;
    }
}
