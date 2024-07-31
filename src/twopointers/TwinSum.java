package twopointers;

import java.util.ArrayList;
import java.util.List;

public class TwinSum {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int pairSumBruteForce(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        int sum = Integer.MIN_VALUE;
        for(int i=0;i<list.size()/2;i++) {
            sum = Math.max(sum, list.get(i) + list.get(list.size() - 1 - i));
        }
        return sum;
    }

    public int pairSum(ListNode head) {
        ListNode prev = null, slow = head, fast = head;
        while (fast != null) {
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        int res = 0;
        while (prev != null) {
            res = Math.max(res, prev.val + slow.val);
            prev = prev.next;
            slow = slow.next;
        }
        return res;
    }
}