package a_daily_topic;

// 链表组件

import java.util.HashSet;
import java.util.Set;

public class No_0817 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int ans = 0;
        while (head != null){
            if(set.contains(head.val)){
                while (head != null && set.contains(head.val))
                    head = head.next;
                ans++;
            }
            else{
                head = head.next;
            }
        }
        return ans;
    }

}
