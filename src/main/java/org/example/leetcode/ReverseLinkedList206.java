package org.example.leetcode;

import org.example.leetcode.utility.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode reverseRoot = head;

        List<ListNode> nodes = new ArrayList<>();

        while (currentNode != null) {
            nodes.add(currentNode);
            currentNode = currentNode.next;
        }

        int size = nodes.size() - 1;
        if (size > 0) {
            reverseRoot = nodes.get(nodes.size() - 1);
        }

        for (int i = nodes.size() - 1; i >= 0; i--) {
            if (i - 1 >= 0) {
                nodes.get(i).next = nodes.get(i - 1);
            } else {
                nodes.get(i).next = null;
            }
        }

        return reverseRoot;
    }
}
