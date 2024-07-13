package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ReorderList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void reorderList(ListNode arr) {
        List<Integer> head = new ArrayList<>();
        while(arr.next != null)
            head.add(arr.val);

        for(int i=0,j=head.size()-1;i<j;i++,j--) {
            System.out.print(head.get(i)+" "+head.get(j)+" ");
        }
        if(head.size() % 2 == 1) {
            System.out.println(head.get(head.size()/2));
        }
    }

    public static void main(String[] args) {
       //reorderList(new int[]{1,2,3,4,5});
    }
}
