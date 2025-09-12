import java.util.HashMap;

class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int temp = n;

        while (true) {
            if (hm.containsKey(temp)) {
                return false; 
            }

            hm.put(temp, 1); 

            int sum = 0;
            int curr = temp; 
            while (curr > 0) {
                int rev = curr % 10;
                sum += rev * rev;
                curr /= 10;
            }

            if (sum == 1) {
                return true; 
            }

            temp = sum; 
        }
    }
}
