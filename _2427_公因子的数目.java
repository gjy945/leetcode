// _2427_公因子的数目 https://leetcode.cn/problems/number-of-common-factors/
/*给你两个正整数 a 和 b ，返回 a 和 b 的 公 因子的数目。
如果 x 可以同时整除 a 和 b ，则认为 x 是 a 和 b 的一个 公因子 。
示例 1：
输入：a = 12, b = 6
输出：4
解释：12 和 6 的公因子是 1、2、3、6 。
示例 2：
输入：a = 25, b = 30
输出：2
解释：25 和 30 的公因子是 1、5 。
提示：
1 <= a, b <= 1000*/

class _2427_公因子的数目 {
    public int commonFactors(int a, int b) {
        int n = a > b ? a : b; // 找出最大的数
        int num = 0;
        for (int i = 1; i <= n; i++) {
            if (a % i == 0 && b % i == 0) {
                num++;
            }
        }
        return num;
    }
}
