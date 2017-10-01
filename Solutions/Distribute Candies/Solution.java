class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> uniqueCandies = new HashSet<>();
        for(int candie : candies) {
            uniqueCandies.add(candie);
        }
        return Math.min(uniqueCandies.size(), candies.length / 2);
    }
}