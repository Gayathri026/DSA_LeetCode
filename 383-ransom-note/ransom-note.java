class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       Map<Character, Integer> hm = new HashMap<>();
        for (char ch : ransomNote.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (char ch : magazine.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) - 1);
        }

        for (Map.Entry<Character, Integer> e : hm.entrySet()){
           if(e.getValue() > 0) return false;
           
        }
return true;
        
    }
}