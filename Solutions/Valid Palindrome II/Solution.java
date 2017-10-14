class Solution {
    public boolean validPalindrome(String s) {
        Boolean removedACharacter = false;
        Boolean triedRight = false;
        int charRemovedStart = 0;
        int charRemovedEnd = 0;
        int start = 0;
        int end = s.length()-1;
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                if(removedACharacter) {
                    if(triedRight) {
                        return false;
                    }
                    else {
                        // Goes back to where we branched removing the left char and tries the right instead
                        start = charRemovedStart;
                        end = charRemovedEnd - 1;
                        triedRight = true;
                    }
                }
                else {
                    // Try moving start pointer inward
                    start++;
                    if(s.charAt(start) != s.charAt(end)) {
                        //Try moving the end instead
                        start--;
                        end--;
                        if(s.charAt(start) != s.charAt(end)) {
                            return false;
                        }
                        else {
                            removedACharacter = true;
                            triedRight = true;
                        }
                    }
                    else {
                        charRemovedStart = start - 1;
                        charRemovedEnd = end;
                        removedACharacter = true;
                    }
                }
            }
            start++;
            end--;
        }
        return true;
    }
}