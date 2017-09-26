class Solution {
    public int hammingDistance(int x, int y) {
        String binaryXOR = Integer.toBinaryString(x ^ y);
        return Math.abs(count(binaryXOR));
    }
    
    // Counts the number of 1's in a binary string
    public int count(String binary) {
        int ones = 0;
        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') ones++;
        }
        return ones;
    }
}