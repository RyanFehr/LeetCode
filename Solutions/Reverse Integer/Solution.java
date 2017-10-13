class Solution {
    public int reverse(int x) {
        StringBuilder xReversed = new StringBuilder(Integer.toString(x));
        xReversed.reverse();
        if(xReversed.charAt(xReversed.length()-1) == '-') {
            xReversed.deleteCharAt(xReversed.length()-1);
            xReversed.insert(0, '-');
        }
        
        try {
            int answer = Integer.parseInt(xReversed.toString());
            return answer;
        }
        catch(Exception e) {
            return 0;
        }
    }
}