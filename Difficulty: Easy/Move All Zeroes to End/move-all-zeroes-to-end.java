class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int l=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]!=0){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
            }
        }
    }
}