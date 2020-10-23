import org.junit.jupiter.api.Test;

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
 */

//编写一个函数来查找字符串数组中的最长公共前缀。
//
//如果不存在公共前缀，返回空字符串""。
//
//示例1:
//
//输入: ["flower","flow","flight"]
//输出: "fl"
//示例2:
//
//输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
//说明:
//
//所有输入只包含小写字母a-z。

public class _14_LongestCommonPrefix {

    public String solutionIndexOf(String[] strs){
        if(strs == null || strs.length == 0) return "";
        String res = strs[0];
        for (int i = 0; i< strs.length ; i++){
            while( strs[i].indexOf(res) != 0){
                res = res.substring(0,res.length() - 1);
            }
        }
        return res;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    @Test
    public void solutionTest(){
        String[] strArray = { "flower","flow","flight"};
        assertEquals( solutionIndexOf(strArray),"fl");
        assertEquals( longestCommonPrefix(strArray),"fl");

        String[] strArray2 = { "dog","racecar","car" };
        assertEquals( solutionIndexOf(strArray2),"");
        assertEquals( longestCommonPrefix(strArray2),"");

    }

}
