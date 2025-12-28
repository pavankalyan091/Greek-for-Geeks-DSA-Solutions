// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        char s1[]=s.toCharArray();
        int l=0;
        int r=s1.length-1;
        while(l<r){
            char temp=s1[l];
            s1[l]=s1[r];
            s1[r]=temp;
            l++;
            r--;
        }
        return new String(s1);
    }
}