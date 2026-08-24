class Solution {
    public String reversePrefix(String s, int k) {
        int i=0;
        int j=k-1;
        int n = s.length();
        char[] arr = s.toCharArray();

        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
