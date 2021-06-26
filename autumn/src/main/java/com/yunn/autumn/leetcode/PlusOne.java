package com.yunn.autumn.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * PlusOne
 *
 * @author yunN
 * @createTime 2021年03月11日 17:37
 * @description 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * <p>
 * 示例1：
 * <p>
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * 示例2：
 * <p>
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * 示例 3：
 * <p>
 * 输入：digits = [0]
 * 输出：[1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PlusOne {

    /**
     * 处理不了整型溢出的问题
     *
     * @param digits .
     * @return .
     */
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        //4321 = 1*1 + 2*10 + 3*100 + 4*1000
        //     = 4*length-i + 3*length-i + 2*length-i + 1*length-i  0<= i <4
        //     = j*lenth-i + ……   j从lenth - 1 开始递减，直到j=0
        int j = length - 1;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (j < 0) break;
            sum += digits[i] * Math.pow(10, (length - i - 1));
        }
        System.out.println(sum);
        sum = sum + 1;
        String resultStr = String.valueOf(sum);
        int[] resultArr = new int[resultStr.length()];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = Character.getNumericValue(resultStr.charAt(i));
        }
        return resultArr;
    }

    @Test
    public void testPlusOne() {
        int[] digits = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    @Test
    public void testPow() {
        String a = "";
        Integer integer = Integer.valueOf(a);
        System.out.println(integer);

    }
}
