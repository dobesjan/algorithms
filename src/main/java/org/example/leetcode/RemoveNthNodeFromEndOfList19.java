package org.example.leetcode;

import org.example.leetcode.utility.ListNode;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndOfList19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //ListNode reverseRoot = reverse(head);
        int count = getListCount(head);
        if (count <= 1) return null;
        move(null, head, 0, count - n);
        return head;
    }

    private ListNode reverse (ListNode root) {
        ListNode reverseRoot = null;
        ListNode currentNode = root;

        List<ListNode> list = new ArrayList<>();

        while (currentNode != null) {
            list.add(currentNode);
            currentNode = currentNode.next;
        }

        if (list.size() > 0) {
            reverseRoot = list.get(list.size()-1);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            if (i - 1 >= 0) {
                list.get(i).next = list.get(i-1);
            } else {
                list.get(i).next = null;
            }
        }

        return reverseRoot;
    }

    private int getListCount(ListNode head) {
        ListNode currentNode = head;
        int count = 0;

        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }

        return count;
    }

    private void move(ListNode prevNode, ListNode currentNode, int index, int n) {
        if (currentNode == null || n < 0) {
            return;
        }

        if (index == n) {
            if (prevNode != null) {
                prevNode.next = currentNode.next;
            } else {
                if (currentNode.next == null) {
                    currentNode = null;
                } else {
                    currentNode = currentNode.next;
                }
            }
            return;
        }

        index++;

        move(currentNode, currentNode.next, index, n);
    }

    public void demo() {
        /*
        ListNode fifthNode = new ListNode(5);
        ListNode fourthNode = new ListNode(4, fifthNode);
        ListNode thirdNode = new ListNode(3, fourthNode);
         */
        ListNode secondNode = new ListNode(2);
        ListNode head = new ListNode(1, secondNode);

        removeNthFromEnd(head, 2);

        ListNode currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.val + " ");
            currentNode = currentNode.next;
        }
    }
}
