// _1979_找出数组的最大公约数 https://leetcode.cn/problems/find-greatest-common-divisor-of-array/description/
/*给你一个整数数组 nums ，返回数组中最大数和最小数的 最大公约数 。
两个数的 最大公约数 是能够被两个数整除的最大正整数。
示例 1：
输入：nums = [2,5,6,9,10]
输出：2
解释：
nums 中最小的数是 2
nums 中最大的数是 10
2 和 10 的最大公约数是 2
示例 2：
输入：nums = [7,5,6,8,3]
输出：1
解释：
nums 中最小的数是 3
nums 中最大的数是 8
3 和 8 的最大公约数是 1
示例 3：
输入：nums = [3,3]
输出：3
解释：
nums 中最小的数是 3
nums 中最大的数是 3
3 和 3 的最大公约数是 3
提示：
2 <= nums.length <= 1000
1 <= nums[i] <= 1000*/

class _1979_找出数组的最大公约数 {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0], nums[nums.length - 1]);
    }

    public int gcd(int m, int n) {
        while (n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }
}
