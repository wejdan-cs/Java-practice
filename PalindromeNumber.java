class Solution {
    public boolean isPalindrome(int x) {
     if(x<0){
        return false;
     }
     int xcopy=x;   
     int  rev=0;
     while(x>0){
        int x1=x%10;
        rev= rev*10+x1;
        x /=10;
        
     }
     return xcopy==rev;
    }
}
