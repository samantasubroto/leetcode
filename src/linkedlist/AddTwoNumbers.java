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
        while (l1 != null) {
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
        while (l2 != null) {
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

    public static int middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;
    }

    //leetcode question 2181
    public static ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int count = 0;
        head = head.next;
        while (head != null) {
            if (head.val != 0) {
                count += head.val;
            } else {
                ListNode newNode = new ListNode(count, null);
                temp.next = newNode;
                temp = newNode;
                count = 0;
            }
            head = head.next;
        }
        return dummy.next;
    }

    public static void delete(ListNode head, int number) {

    }

    public static ListNode printNext(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        int count = 0;
        ListNode temp1 = null, temp2 = null;
        if (a != 0) {
            while (count != a - 1) {
                temp = temp.next;
                count++;
            }
        }
        temp1 = temp;
        while (count != b) {
            temp = temp.next;
            count++;
        }
        temp2 = temp.next;
        temp1.next = list2;
        while (temp1.next != null) {
            temp1 = temp1.next;
        }
        temp1.next = temp2;
        return list1;
    }

    public static void traverseList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static ListNode insertGCD(ListNode head) {
        ListNode temp = head;
        while(temp.next != null) {
            ListNode node = new ListNode(findGCD(temp.val, temp.next.val), null);
            node.next = temp.next;
            temp.next = node;
            temp = temp.next.next;
        }
        return head;
    }

    public static void deleteGivenNode(ListNode node) {
        ListNode temp = node;
        while(temp.next.next != null) {
            temp.val = temp.next.val;
            temp = temp.next;
        }
        temp.val = temp.next.val;
        temp.next = null;
    }

    public static void main(String[] args) {
//        LinkedList<Integer> l1 = new LinkedList<>(List.of(9));
//        LinkedList<Integer> l2 = new LinkedList<>(List.of(1));

        ListNode list1 = new ListNode(18, null);
        list1.next = new ListNode(6, null);
        list1.next.next = new ListNode(10, null);
        list1.next.next.next = new ListNode(3, null);
//        list1.next.next.next.next = new ListNode(5, null);
//        list1.next.next.next.next.next = new ListNode(6, null);
//        list1.next.next.next.next.next.next = new ListNode(7, null);
//        list1.next.next.next.next.next.next.next = new ListNode(8, null);

        deleteGivenNode(list1);
        traverseList(list1.next);


//        System.out.println(middleNode(list1));
//        ListNode list2 = new ListNode(1,null);
//        list2.next =  new ListNode(6,null);
//        list2.next.next =  new ListNode(4,null);
//        list2.next.next.next =  new ListNode(9,null);
        // System.out.println(addition(list1, list2));
//        ListNode head = addition(list1, list2);
//        while(head != null) {
//            System.out.print(head.val+ " ");
//            head = head.next;
//        }
    }
}
