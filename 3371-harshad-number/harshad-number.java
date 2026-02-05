class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n = x;
        int digit =0;
        while(n!= 0){
            int rem = n%10;
             digit+=rem;
             n/=10; 
        }
        if(x%digit == 0)return digit;
        return -1;
        
    }
}