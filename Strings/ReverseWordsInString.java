package Strings;

class Solution {

    public void reverse(char[] arr, int start,int end){
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public String reverseWords(String s) {
        char[] ch=s.toCharArray();
        int start=0,end=0;
        while(start<ch.length){
            while(end<ch.length && ch[end]!= ' '){
                end++;
            }

            reverse(ch,start,end-1);
            start=end+1;
            end=end+1;



        }
        return new String(ch);
    }
}
