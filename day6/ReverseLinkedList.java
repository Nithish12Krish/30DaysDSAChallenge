package com.nithish.day6;

//Definition for singly-linked list.
//Problem Link: https://leetcode.com/problems/reverse-linked-list
class ListNode {
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

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {

		if (head == null) {
			return head;
		}

		if (head.next == null) {
			return head;
		}

		ListNode nextNode = reverseList(head.next);

		head.next.next = head;
		head.next = null;

		return nextNode;

	}

}
