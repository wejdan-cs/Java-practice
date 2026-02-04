class Solution {
    public int romanToInt(String s) {
       char[] arr={'I','V','X','L','C','D','M'}; 
       int [] value={1,5,10,50,100,500,1000};
       int sum=0;
      
        for(int j=0;j<s.length();j++){
            char curChar=s.charAt(j);
            int curValue=0;
             for(int i=0; i<7;i++){
            if(arr[i]==curChar){
               curValue=value[i];
               break;
            } 
             }
            if(j<s.length()-1){
                char nextC=s.charAt(j+1);
                int nextV=0;
                for(int i=0;i<7;i++){
                    if(arr[i]==nextC){
                        nextV=value[i];
                        break;
                    }
                }
                if(curValue<nextV){
                    sum-=curValue;
                }else{
                    sum+=curValue;
                }
            }
                else{
                    sum+=curValue;
                }
            } 
        
    
       return sum;
       }
    }
