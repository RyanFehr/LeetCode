class Solution {
    public int lengthOfLongestSubstring(String s) {
        int pointerStart = 0;
        int pointerEnd = 0;
        HashSet<Character> characterSet = new HashSet<>();
        int longestSubstringLength = 0;
        int currentSubstringLength = 0;
        while(pointerEnd <= s.length()-1) { // We haven't checked all valid substrings
            if(characterSet.contains(s.charAt(pointerEnd))) { // If char is already in the current substring
                while(characterSet.contains(s.charAt(pointerEnd))) {
                    characterSet.remove(s.charAt(pointerStart));
                    pointerStart++;
                    currentSubstringLength--;
                }
                characterSet.add(s.charAt(pointerEnd)); // This is a new char
                currentSubstringLength++; // Add the char to the current substring
                pointerEnd++;
            }
            else {
                characterSet.add(s.charAt(pointerEnd)); // This is a new char
                currentSubstringLength++; // Add the char to the current substring
                if(currentSubstringLength > longestSubstringLength) // If the current unique char substring is the longest reassign it
                        longestSubstringLength = currentSubstringLength;
                pointerEnd++;
            }
        }
        return longestSubstringLength;
    }
}