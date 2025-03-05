// For the problem at https://leetcode.com/problems/smallest-number-in-infinite-set/description/

class SmallestInfiniteSet {

    private PriorityQueue<Integer> minAdded;
    private int current;

    public SmallestInfiniteSet() {
        minAdded = new PriorityQueue<>();
        current = 1;
    }
    
    public int popSmallest() {
        if(minAdded.isEmpty() == false) {
            return minAdded.poll();
        }
        else {
            current += 1;
            return current-1;
        }
    }
    
    public void addBack(int num) {
        if(current <= num || minAdded.contains(num)) {
            return;
        }
        minAdded.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
