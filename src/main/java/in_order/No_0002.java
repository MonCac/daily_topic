package in_order;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */



public class No_0002 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addnum = 0;
        int sum = 0;
        int a1 = 0;
        int a2 = 0;
        ListNode head = null,tail = null;
        while (l1 != null || l2 != null){
            if(l1 != null){
                a1 = l1.val;
                l1 = l1.next;
            }
            else
                a1 = 0;
            if(l2 != null){
                a2 = l2.val;
                l2 = l2.next;
            }
            else
                a2 = 0;
            sum = addnum + a1 + a2;
            addnum = sum / 10;
            sum = sum % 10;
            if (head == null){
                head = tail = new ListNode(sum);
            }
            else{
                tail.next = new ListNode(sum);
                tail = tail.next;
            }

        }
        if(addnum != 0){
            tail.next = new ListNode(addnum);
        }
        return head;
    }
}
