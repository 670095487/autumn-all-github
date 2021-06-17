package com.yun.autumn.leetcode;

import javax.annotation.Resource;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by yunN on 2021/04/21.
 * <p>
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {


}


class ListNode2AddTwoNumbers {
    int val;
    ListNode next;

    ListNode2AddTwoNumbers() {
    }

    ListNode2AddTwoNumbers(int val) {
        this.val = val;
    }

    ListNode2AddTwoNumbers(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}