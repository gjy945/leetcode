// 704.二分查找 https://leetcode.cn/problems/binary-search/description/
class Solution {
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
