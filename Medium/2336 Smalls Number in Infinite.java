// For the problem at https://leetcode.com/problems/smallest-number-in-infinite-set/description/

class SmallestInfiniteSet {

    private Set<Integer> infin;
    private PriorityQueue<Integer> minAdded;
    private Integer current;

    public SmallestInfiniteSet() {
        infin = new HashSet<Integer>();
        minAdded = new PriorityQueue<>();
        current = 1;
    }
    
    public int popSmallest() {
        if(minAdded.isEmpty() == false) {
            infin.remove(Collections.min(infin));
            return minAdded.poll();
        }
        else {
            current += 1;
            return current-1;
        }
    }
    
    public void addBack(int num) {
        if(current <= num || infin.contains(num)) {
            return;
        }
        infin.add(num);
        minAdded.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
