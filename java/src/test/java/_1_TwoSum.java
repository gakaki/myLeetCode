import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 本代码来自 Cspiration，由 @Cspiration 提供
 * 题目来源：http://leetcode.com
 * - Cspiration 致力于在 CS 领域内帮助中国人找到工作，让更多海外国人受益
 * - 现有课程：Leetcode Java 版本视频讲解（1-900题）（上）（中）（下）三部
 * - 算法基础知识（上）（下）两部；题型技巧讲解（上）（下）两部
 * - 节省刷题时间，效率提高2-3倍，初学者轻松一天10题，入门者轻松一天20题
 * - 讲师：Edward Shi
 * - 官方网站：https://cspiration.com
 * - 版权所有，转发请注明出处
 *
 *
 ## 题目

 Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 Example:
 ```
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 ```

 ## 题目大意

 在数组中找到 2 个数之和等于给定值的数字，结果返回 2 个数字在数组中的下标。

 ## 解题思路

 这道题最优的做法时间复杂度是 O(n)。

 顺序扫描数组，对每一个元素，在 map 中找能组合给定值的
 */
public class _1_TwoSum {

    /**
     * time : O(n)
     * space : O(n)
     * @param nums
     * @param target
     * @return
     */

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }

        int[] res = new int[]{-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }

        return res;
    }


    @Test
    public void SolutionTest(){
        //java 下面比较用assertequal会是地址比较 ,所以要用assert array equals
        assertArrayEquals(
                twoSum(
                        new int[]{ 2,7,11,15},9),
                        new int[]{ 0,1 } // 2 , 7
        );

        assertArrayEquals(
                twoSum(
                        new int[]{ 3, 2, 4},6),
                new int[]{ 1,2 } //
        );

        assertArrayEquals(
                twoSum(
                        new int[]{ 0, 8, 7, 3, 3, 4, 2},11),
                new int[]{ 1,3 } // 2 , 7
        );
    }
}
