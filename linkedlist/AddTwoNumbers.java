package linkedlist;

import java.util.*;

public class AddTwoNumbers {

    public static class ListNode {
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

    public static ListNode addition(ListNode l1, ListNode l2) {
        ListNode result = null;
        int count = 0;
        while (l1 != null && l2 != null) {
            int temp = l1.val + l2.val + count;
            if (temp > 9) {
                result = insert(result, (temp % 10));
                count = temp / 10;
            } else {
                result = insert(result, temp);
                count = temp / 10;
            }

            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            int temp = l1.val + count;
            if (temp > 9) {
                result = insert(result, (temp % 10));
                count = temp / 10;
            } else {
                result = insert(result, temp);
                count = temp / 10;
            }

            l1 = l1.next;
        }
        while(l2 != null) {
            int temp = l2.val + count;
            if (temp > 9) {
                result = insert(result, (temp % 10));
                count = temp / 10;
            } else {
                result = insert(result, temp);
                count = temp / 10;
            }

            l2 = l2.next;
        }
        if (count > 0)
            result = insert(result, count);
        return result;
    }

    public static ListNode insert(ListNode head, int val) {
        ListNode node = new ListNode(val, null);
        if (head == null) {
            head = node;
        } else {
            ListNode tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
        return head;
    }

    //with collection
    public static LinkedList<Integer> addition(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int count = 0;
        LinkedList<Integer> result = new LinkedList<Integer>();
        Iterator<Integer> iterator1 = l1.iterator();
        Iterator<Integer> iterator2 = l2.iterator();

        while (iterator1.hasNext() && iterator2.hasNext()) {
            int temp = iterator1.next() + iterator2.next() + count;
            if (temp > 9) {
                result.add(temp % 10);
                count = temp / 10;
            } else {
                result.add(temp);
            }
        }
        while (iterator1.hasNext()) {
            int temp = iterator1.next() + count;
            if (temp > 9) {
                result.add(temp % 10);
                count = temp / 10;
            } else {
                result.add(temp);
            }
        }
        while (iterator2.hasNext()) {
            int temp = iterator2.next() + count;
            if (temp > 9) {
                result.add(temp % 10);
                count = temp / 10;
            } else {
                result.add(temp);
            }
        }
        if (count > 0)
            result.add(count);
        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(List.of(9));
        LinkedList<Integer> l2 = new LinkedList<>(List.of(1));
        ListNode list1 = new ListNode(9,null);
        list1.next =  new ListNode(9,null);
        list1.next.next =  new ListNode(1,null);
//        list1.next.next.next =  new ListNode(9,null);
//        list1.next.next.next.next =  new ListNode(9,null);
//        list1.next.next.next.next.next =  new ListNode(9,null);
//        list1.next.next.next.next.next.next =  new ListNode(9,null);
       // list1.next.next.next.next.next.next.next =  new ListNode(9,null);
        ListNode list2 = new ListNode(1,null);
//        list2.next =  new ListNode(6,null);
//        list2.next.next =  new ListNode(4,null);
//        list2.next.next.next =  new ListNode(9,null);
       // System.out.println(addition(list1, list2));
        ListNode head = addition(list1, list2);
        while(head != null) {
            System.out.print(head.val+ " ");
            head = head.next;
        }
    }
}
