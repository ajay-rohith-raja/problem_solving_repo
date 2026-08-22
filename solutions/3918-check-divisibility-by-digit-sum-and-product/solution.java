class Solution {
    public boolean checkDivisibility(int n) {
        int res = 0;
        int sum = 0;
        int pro = 1;
        int num = n;
        while(num!=0){
            int temp = num%10;
            sum = sum + temp;
            pro = pro * temp;
            num = num/10;
        }
        res = sum + pro;
        return n%res==0;
    }
}
