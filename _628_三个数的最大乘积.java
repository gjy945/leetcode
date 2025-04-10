// _628_三个数的最大乘积 https://leetcode.cn/problems/maximum-product-of-three-numbers/description/
/*给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
示例 1：
输入：nums = [1,2,3]
输出：6
示例 2：
输入：nums = [1,2,3,4]
输出：24
示例 3：
输入：nums = [-1,-2,-3]
输出：-6
提示：
3 <= nums.length <= 104
-1000 <= nums[i] <= 1000*/

class _628_三个数的最大乘积 {
    /**
    可能出现情况 
        -5 -3 -1 1 3 5  最大值就是前两个负数乘以最后一个正数
        -5 -4 -3 -2 -1  最大值就是最前面的三个数相乘
        1 2 3 4 5 6     最大值就是最前面的三个数相乘
     */
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums); // 排序
        int length = nums.length;
        return Math.max(nums[length - 1] * nums[length - 2] * nums[length - 3],nums[0] * nums[1] * nums[length - 1]);
    }
}
