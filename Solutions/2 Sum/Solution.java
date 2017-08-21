public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> complements = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(complements.containsKey(complement)) {
                int[] output = {complements.get(complement),i};
                return output;
            }
            else {
                complements.put(nums[i], i);
            }
        }
        return null;
    }
}