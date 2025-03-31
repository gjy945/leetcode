// _2160_拆分数位后四位数字的最小和.java https://leetcode.cn/problems/minimum-sum-of-four-digit-number-after-splitting-digits/description/
/*给你一个四位 正 整数 num 。请你使用 num 中的 数位 ，将 num 拆成两个新的整数 new1 和 new2 。new1 和 new2 中可以有 前导 0 ，且 num 中 所有 数位都必须使用。

比方说，给你 num = 2932 ，你拥有的数位包括：两个 2 ，一个 9 和一个 3 。一些可能的 [new1, new2] 数对为 [22, 93]，[23, 92]，[223, 9] 和 [2, 329] 。
请你返回可以得到的 new1 和 new2 的 最小 和。
示例 1：
输入：num = 2932
输出：52
解释：可行的 [new1, new2] 数对为 [29, 23] ，[223, 9] 等等。
最小和为数对 [29, 23] 的和：29 + 23 = 52 。
示例 2：
输入：num = 4009
输出：13
解释：可行的 [new1, new2] 数对为 [0, 49] ，[490, 0] 等等。
最小和为数对 [4, 9] 的和：4 + 9 = 13 。
提示：
1000 <= num <= 9999*/

class _2160_拆分数位后四位数字的最小和 {
    public int minimumSum(int num) {

        int[] ints = new int[4];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = num % 10; // 依次拿到个十百千 位
            num /= 10; // 每次循环/10 去掉最后一位数字
        }

        // 排序
        sort(ints,ints.length);

        return ints[0] * 10 + ints[1] * 10 + ints[2] + ints[3];
    }

    private static void sort(int[] n, int length) {
        int i, j, temp;
        for (i = 0; i < length - 1; i++) {
            for (j = 0; j < length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
    }
}
