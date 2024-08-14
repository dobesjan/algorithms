package org.example;

import org.example.leetcode.AddTwoNumbers2;
import org.example.leetcode.LargestNumber179;
import org.example.leetcode.utility.ListNode;

public class Main {
    public static void main(String[] args) {
        /*
        LargestNumber179 l = new LargestNumber179();
        System.out.println(l.largestNumber(new int[]{10,2}));
        System.out.println(l.largestNumber(new int[]{3,30,34,5,9}));
         */

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
    }
}