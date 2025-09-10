class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> charMap = new HashMap<>();
        String[] words = s.split(" ");

        // Length mismatch case
        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char sc = pattern.charAt(i);
            String tc = words[i];

            if (charMap.containsKey(sc)) {
                if (!charMap.get(sc).equals(tc)) {
                    return false;
                }
            } else {
                if (charMap.containsValue(tc)) {
                    return false;
                }
                charMap.put(sc, tc);
            }
        }
        return true;
    }
}
