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

    public static ListNode removeNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        int num1 = stack.pop();
        while (!stack.isEmpty()) {
            int num2 = stack.pop();
            if (num1 <= num2) {
                stack1.add(num1);
                num1 = num2;
            }
        }
        ListNode head2 = new ListNode(num1);
        ListNode current = head2;

        while (!stack1.isEmpty()) {
            current.next = new ListNode(stack1.pop());
            current = current.next;
        }
        return head2;
    }

    public static int[] findMinMaxDifference(List<Integer> sortedArray) {
        int minDifference = Integer.MAX_VALUE;
        int maxDifference = sortedArray.get(sortedArray.size() - 1) - sortedArray.get(0);

        // Sliding window to find minimum difference
        int left = 0, right = 1;
        while (right < sortedArray.size()) {
            int diff = sortedArray.get(right) - sortedArray.get(left);
            if (diff < minDifference) {
                minDifference = diff;
            }
            left++;
            right++;
        }

        return new int[]{minDifference, maxDifference};
    }

    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode current = head.next;
        ListNode prev = head;
        ListNode next = current.next;
        List<Integer> list = new ArrayList<>();
        int count = 2;
        while(next != null) {
            if(current.val < prev.val && current.val < next.val) {
                list.add(count);
            }else if(current.val > prev.val && current.val > next.val) {
                list.add(count);
            }
            count++;
            next = next.next;
            current = current.next;
            prev = prev.next;
        }
        System.out.println(list.size());
        if(list.size() == 0 || list.size() == 1) {
            return new int[]{-1, -1};
        }
        return findMinMaxDifference(list);
    }

    public ListNode swapNodes(ListNode head, int k) {

    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(2, null);
        list1.next = new ListNode(2, null);
        list1.next.next = new ListNode(1, null);
        list1.next.next.next = new ListNode(3, null);
//        list1.next.next.next.next = new ListNode(5, null);
//        list1.next.next.next.next.next = new ListNode(1, null);
//        list1.next.next.next.next.next.next = new ListNode(2, null);
//        list1.next.next.next.next.next.next.next = new ListNode(8, null);

        nodesBetweenCriticalPoints(list1);

    }
}
