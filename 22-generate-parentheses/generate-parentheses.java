class Solution {
    ArrayList<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(0,0,n,"");
        return result;
    }
    public void generate(int open, int close, int n , String ans){
        if(ans.length()==n*2){
            result.add(ans);
            return;
        }
        if(open < n){
            generate(open+1,close,n,ans+"(");
        }
        if(close < open){
            generate(open,close+1,n,ans+")");
        }

    }
}