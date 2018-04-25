/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class LC382 {
    private ListNode head;
    private Random rad;

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head = head;
        rad = new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int count = 1;
        int res = 0;
        ListNode x = head;
        while (x != null) {
            if (rad.nextInt(count) == 0)
                res = x.val;
            x = x.next;
            count++;
            
        }
        return res;
        
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */