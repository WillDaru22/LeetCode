// For the problem at https://leetcode.com/problems/permutations/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();  // our list
        recurse(list, new ArrayList<>(), nums);
        return list;
    }

    // solve through recursion
    private void recurse(List<List<Integer>> list, List<Integer> temp, int[] nums) {
        if(temp.size() == nums.length) {
            list.add(new ArrayList<>(temp));
        } 
        else {
            for(int i = 0; i < nums.length; i++) {
                if(temp.contains(nums[i])) {
                    continue;
                }
                temp.add(nums[i]);
                recurse(list, temp, nums);
                temp.remove(temp.size()-1);
            }
        }
    }
}
