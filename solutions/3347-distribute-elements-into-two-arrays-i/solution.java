class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int x = 0;
        int y = 0;
        for(int i=2;i<n;i++){
            if(arr1[x] > arr2[y]){
                arr1[++x] = nums[i];
            }
            else{
                arr2[++y] = nums[i];
            }
        }

        for(int i=0;i<=x;i++){
            res[i] = arr1[i];
        }

        for(int i=0;i<=y;i++){
            res[x+1+i] = arr2[i];
        }
        return res;
    }
}
