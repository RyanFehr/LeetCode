class Solution {
    public boolean detectCapitalUse(String word) {
        int lastCapital = -1;
        for(int i = 0; i < word.length(); i++){
            // Uppercase character
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                // Is there a lowercase char between these uppercase
                if(i - lastCapital > 1)
                    return false;
                lastCapital = i;
            }
            // Lowercase character
            else { 
                // Is only the first letter capitalized or no letters capitalized
                if(lastCapital > 0)
                    return false;
            }
        }
        return true;
    }
}