// 34.在排序数组中查找元素的第一个和最后一个位置 https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/description/
/* 题目: 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
如果数组中不存在目标值 target，返回 [-1, -1]。
你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
示例 1：
输入：nums = [5,7,7,8,8,10], target = 8
输出：[3,4]
示例 2：
输入：nums = [5,7,7,8,8,10], target = 6
输出：[-1,-1]
示例 3：
输入：nums = [], target = 0
输出：[-1,-1]
提示：
0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums 是一个非递减数组
-109 <= target <= 109 */
class _34_在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        int leftIndex = binarySearch(nums, target, "leftIndex");
        int rightIndex = binarySearch(nums, target, "rightIndex");
        int[] res;
        try {
            res = new int[] { nums[leftIndex] == target ? leftIndex : -1,
                    nums[rightIndex] == target ? rightIndex : -1 };
        } catch (Exception e) {
            res = new int[] { -1, -1 };
        }
        return res;
    }

    public int binarySearch(int[] nums, int target, String leftOrRight) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (nums[m] < target) {
                i = m + 1;
            } else if (target < nums[m]) {
                j = m - 1;
            } else {
                if (leftOrRight.equals("leftIndex")) {
                    j = m - 1;
                } else {
                    i = m + 1;
                }
            }
        }
        return leftOrRight.equals("leftIndex") ? i : j;
    }
}
