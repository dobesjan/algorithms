package org.example.leetcode;

import org.example.leetcode.utility.ListNode;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Num = getNumberFromList(l1);
        int l2Num = getNumberFromList(l2);

        int sum = l1Num + l2Num;

        char[] reverseSumChars = reverseChars(String.valueOf(sum));
        ListNode rootNode = new ListNode(Integer.valueOf(String.valueOf(reverseSumChars[0])));

        for (int i = 1; i < reverseSumChars.length; i++) {
            ListNode currentNode = rootNode;

            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = new ListNode(Integer.valueOf(String.valueOf(reverseSumChars[i])));
        }

        return rootNode;
    }

    private int getNumberFromList(ListNode l) {
        String lString = "";

        ListNode nextNode = l;

        while(true) {
            lString += nextNode.val;

            nextNode = nextNode.next;
            if (nextNode == null) {
                break;
            }
        }

        return reverse(lString);
    }

    private char[] reverseChars(String lString) {
        char[] lStringChars = lString.toCharArray();
        List<Character> reverseChars = new ArrayList<>();

        for (int i = lStringChars.length - 1; i >= 0; i--) {
            reverseChars.add(lStringChars[i]);
        }

        // Convert List<Character> to char[]
        char[] result = new char[reverseChars.size()];
        for (int i = 0; i < reverseChars.size(); i++) {
            result[i] = reverseChars.get(i);
        }

        return result;
    }

    private int reverse(String lString) {
        char[] reverseChars = reverseChars(lString);

        lString = String.valueOf(reverseChars);

        return Integer.valueOf(lString);
    }
}
