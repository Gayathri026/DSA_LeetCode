class StockSpanner {

    List<Integer> li = null;
    public StockSpanner() {
        li = new ArrayList<>();

        
    }
    
    public int next(int price) {
        
        li.add(price);
        int count = 0;
        for(int i = li.size()-1; i>=0; i--){
            if(li.get(i) <= price){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */