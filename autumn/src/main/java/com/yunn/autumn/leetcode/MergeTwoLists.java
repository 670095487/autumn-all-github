package com.yunn.autumn.leetcode;

/**
 * MergeTwoLists
 *
 * @author yunN
 * @createTime 2021年02月05日 19:43
 * @description 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class MergeTwoLists {

    /**
     * 每次返回的都是当前比较后得到的升序链表
     *
     * @param l1 /
     * @param l2 /
     * @return /
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

/**
 * l1:[1,2,3]
 * l2:[2,4,6]
 *
 * l1.val = ? :是链表的第一个元素
 * l2.next = ? :是链表的第二个元素？
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int val, int i) {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Application{
    public static void main(String[] args) {
        ListNode node2 = new ListNode(3, null);
        ListNode node1 = new ListNode(0, node2);
        System.out.println(node1.val);
        System.out.println(node1.next);
        System.out.println(node2.val);
        System.out.println(node2.next);
    }
}
