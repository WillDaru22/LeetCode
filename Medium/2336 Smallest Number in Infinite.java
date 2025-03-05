// For the problem at https://leetcode.com/problems/smallest-number-in-infinite-set/description/

class SmallestInfiniteSet {

    private PriorityQueue<Integer> minAdded;
    private int current;

    public SmallestInfiniteSet() {
        minAdded = new PriorityQueue<>();
        current = 1;
    }
    
    public int popSmallest() {
        if(minAdded.isEmpty()) {
            return current++;
        }
        return minAdded.poll();  // return and remove the front item
    }
    
    public void addBack(int num) {
        if(current > num && !minAdded.contains(num)) {
            minAdded.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
