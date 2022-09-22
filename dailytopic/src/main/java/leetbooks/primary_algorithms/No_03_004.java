package leetbooks.primary_algorithms;

// 合并两个有序链表

public class No_03_004 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeList = new ListNode(-1);
        ListNode head = mergeList;
        int n1,n2;
        while (list1 != null && list2 != null){
            n1 = list1.val;
            n2 = list2.val;
            if(n1 < n2){
                head.next = list1;
                list1 = list1.next;
            }else{
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        if(list1 != null)
            head.next = list1;
        else
            head.next = list2;
        return mergeList.next;
    }
}
