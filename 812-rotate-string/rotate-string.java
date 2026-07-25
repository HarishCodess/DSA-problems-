class Solution {
    public boolean rotateString(String s, String goal) {
        int x=goal.length();
        if(x==s.length()){
            for(int i=0;i<x;i++){
               String rotated=s.substring(i)+s.substring(0,i);
               if(rotated.equals(goal)){
                return true;
               }
            }

            }
            return false;  
        }
      
    }
