import java.lang.*;
public class Solution {
    public String convertToTitle(int n) {
        StringBuilder output = new StringBuilder("");
        n--; // Set our base to 0
        
        while(n > 25) {
            int suffix = n % 26; // This will determine the last char of column title at n
            output.append((char) (suffix+65));
            n -= suffix; // Subtract suffix to give us multiple of 26
            n /= 26; // Divide to move in a char in column title
            n--; // Adjust after division
        }
        output.append((char) (n+65)); // Append the first char in the column title
        output = output.reverse(); // We built the string in reverse since inserting to the front is n^2 operation
        
        return output.toString();
    }
}