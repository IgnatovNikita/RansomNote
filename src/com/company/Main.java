package com.company;

import java.util.HashMap;

public class Main {
    static class Solution {
        public boolean canConstruct( String ransomNote,String magazine) {

            if (ransomNote.length() > magazine.length()) return false;
            HashMap<Character, Integer> ranMap = new HashMap<>();
            HashMap<Character, Integer> magMap = new HashMap<>();

            for (int i = 0; i < ransomNote.length(); i++){
                Character ch = ransomNote.charAt(i);
                if (ranMap.containsKey(ch)){
                    ranMap.put(ch, ranMap.get(ch) + 1);
                }else
                    ranMap.put(ch, 1);
            }

            for (int i = 0; i < magazine.length(); i++){
                Character ch = magazine.charAt(i);
                if (magMap.containsKey(ch)){
                    magMap.put(ch, magMap.get(ch) + 1);
                }else
                    magMap.put(ch, 1);
            }

            for (Character ch:ranMap.keySet()) {
                if (magMap.containsKey(ch) && magMap.get(ch) >= ranMap.get(ch)){
                    return true;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {
	// write your code here
        Solution sol = new Solution();
        System.out.println(sol.canConstruct("a","b"));
    }
}
