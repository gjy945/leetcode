// 704.二分查找 https://leetcode.cn/problems/binary-search/description/
// 题目: 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
/*示例 1:
输入: nums = [-1,0,3,5,9,12], target = 9
输出: 4
解释: 9 出现在 nums 中并且下标为 4
示例 2:
输入: nums = [-1,0,3,5,9,12], target = 2
输出: -1
解释: 2 不存在 nums 中因此返回 -1
 
提示：
你可以假设 nums 中的所有元素是不重复的。
n 将在 [1, 10000]之间。
nums 的每个元素都将在 [-9999, 9999]之间。*/
class _704_二分查找 {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1; // 定义指针
        while (i <= j) { // 如果左侧指针跑到了右侧指针右面则说明没找到结束循环
            int m = (i + j) >>> 1; // 寻找中间索引
            if (nums[m] < target) i = m + 1; // 如果要找的数在右侧,则左侧指针移到中间索引右侧一个位置
            else if (nums[m] > target) j = m - 1; // 如果要找的数在左侧,则右侧指针移到中间索引左侧一个位置
            else return m; // 找到返回索引
        }
        return -1; //没找到返回-1
    }
}
