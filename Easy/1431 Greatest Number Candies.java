// For https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i = 0; i < candies.length; i++) {  // find the max in candies
            if(candies[i] > max) {
                max = candies[i];
            }
        }
        ArrayList<Boolean> kids = new ArrayList<Boolean>();
        for(int i = 0; i < candies.length; i++) {  // add extra candies to kids in i to see if more than max
            if((candies[i]+extraCandies) >= max) {
                kids.add(true);
            }
            else {
                kids.add(false);
            }
        }
        return kids;
    }
}
