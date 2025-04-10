// _414_第三大的数 https://leetcode.cn/problems/third-maximum-number/
/*给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
示例 1：
输入：[3, 2, 1]
输出：1
解释：第三大的数是 1 。
示例 2：
输入：[1, 2]
输出：2
解释：第三大的数不存在, 所以返回最大的数 2 。
示例 3：
输入：[2, 2, 3, 1]
输出：1
解释：注意，要求返回第三大的数，是指在所有不同数字中排第三大的数。
此例中存在两个值为 2 的数，它们都排第二。在所有不同数字中排第三大的数为 1 。
提示：
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
进阶：你能设计一个时间复杂度 O(n) 的解决方案吗？*/

class _414_第三大的数 {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>(); // 创建set用来去重
        for (int n : nums) {
            set.add(n);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.size() < 3 ? list.get(list.size() - 1) : list.get(list.size() - 3); // 如果集合长度小于三,则直接返回最后一位最大的数,如果集合长度大于等于三,则返回集合长度-3的位置的数
    }
}
