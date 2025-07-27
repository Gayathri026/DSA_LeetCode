class Solution {
    public boolean isSubsequence(String s, String t) {
        int total=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j =count;j<t.length();){
               if (s.charAt(i) == t.charAt(j)) {
                    count = j+1;
                    total++;
                    break;
                }
                else{
                    j++;
                }
            }
        }
        if(total==s.length()){
            return true;
        }
        
        return false;
    }
}