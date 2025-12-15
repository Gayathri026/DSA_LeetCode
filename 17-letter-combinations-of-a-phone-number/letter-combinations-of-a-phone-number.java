class Solution {

    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0)
            return result;

        String[] map = {
            "abc",   
            "def",   
            "ghi",   
            "jkl",   
            "mno",   
            "pqrs",  
            "tuv",   
            "wxyz"   
        };

        backtrack(0, digits, "", map);
        return result;
    }

    void backtrack(int index, String digits, String current, String[] map) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        int digit = digits.charAt(index) - '2';
        String letters = map[digit];
        for (int i = 0; i < letters.length(); i++) {
            backtrack(index + 1,
                      digits,
                      current + letters.charAt(i),
                      map);
        }
    }
}
