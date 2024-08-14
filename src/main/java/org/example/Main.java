package org.example;

import org.example.leetcode.AddTwoNumbers2;
import org.example.leetcode.BinaryTreePreorderTraversal;
import org.example.leetcode.LargestNumber179;
import org.example.leetcode.ReverseLinkedList206;
import org.example.leetcode.utility.ListNode;
import org.example.leetcode.utility.TreeNode;

public class Main {
    public static void main(String[] args) {
        /*
        LargestNumber179 l = new LargestNumber179();
        System.out.println(l.largestNumber(new int[]{10,2}));
        System.out.println(l.largestNumber(new int[]{3,30,34,5,9}));
         */
/*
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbers2 addTwoNumbers = new AddTwoNumbers2();
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        ListNode nextNode = result;
        String lString = "";

        while(true) {
            lString += nextNode.val;

            nextNode = nextNode.next;
            if (nextNode == null) {
                break;
            }
        }

        System.out.println(lString);
 */
/*
        TreeNode root = new TreeNode(1);
        TreeNode secondLeft = new TreeNode(3);
        TreeNode parentLeft = new TreeNode(2, secondLeft, root);


        BinaryTreePreorderTraversal tree = new BinaryTreePreorderTraversal();
        System.out.println(tree.preorderTraversal(root));
 */

        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        ReverseLinkedList206 reverseLinkedList206 = new ReverseLinkedList206();
        ListNode result = reverseLinkedList206.reverseList(head);

        ListNode currentNode = result;

        while (currentNode != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }
}