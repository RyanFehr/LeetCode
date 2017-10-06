class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        HashMap<Integer, Integer> lastSeen = new HashMap<>(); // Stores the last time we saw a particulare number of 0s and 1s and index
        lastSeen.put(0,-1); // The last time you saw zero sum is the entire array until now, so you want to add 1, thus we store -1 
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count--;
            } else {
                count++;
            }
            if(lastSeen.containsKey(count)) {
                maxLength = Math.max(maxLength, i - lastSeen.get(count));
            } else {
                lastSeen.put(count, i);
            }
        }
        return maxLength;
    }
}