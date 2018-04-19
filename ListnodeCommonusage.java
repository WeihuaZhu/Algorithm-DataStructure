class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class ListnodeCommonusage {
    // delete specific value node in this linkedlist
    public static ListNode delete(ListNode head, int value) {
        if (head == null)
            return head;
        if (head.val == value)
            return head.next;
        ListNode node = head;
        while (node.next!=null) {
            if (node.next.val == value) {
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
        return head;

    }

    public static void printList(ListNode head) {
        ListNode x = head;
        while (x.next!=null) {
            System.out.print(x.val+"->");
            x = x.next;
        }
        System.out.println(x.val);

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = head, slow = dummy;
        for (int i = 0; i < n; i++) {
            if (fast==null)
                return head;
            fast = fast.next;
        }


        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }





    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListnodeCommonusage.printList(head);
        ListNode newhead = ListnodeCommonusage.removeNthFromEnd(head,3);
        ListnodeCommonusage.printList(newhead);






    }
}