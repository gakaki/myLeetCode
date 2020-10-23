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
public class _58_LengthofLastWord {

    // 感觉是最优解
    //https://leetcode-cn.com/problems/length-of-last-word/solution/cong-hou-xiang-qian-bian-li-zhu-yi-kong-ge-by-ivan/
    public int solutionBest(String s){
        if ( s == null || s.length() == 0) return 0;
        int count = 0;
        for ( int i = s.length() -1 ;i >= 0;i--){
            if(s.charAt(i) == ' '){
                if(count == 0) continue;
                break;// 从最后面往前计算count 如果遇到空格并且不是最后一个空格的时候计算
            }
            count++;
        }
        return count;
    }

    /**
     * 58. Length of Last Word
     * For example,
     Given s = "Hello World",
     return 5.

     time : O(n)
     space : O(n)

     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        if (strings.length == 0) {
            return 0;
        }
        return strings[strings.length - 1].length();
    }

    public int solution2( String s){
        s = s.trim();
        int start = s.lastIndexOf(" ") + 1;
        return s.substring(start).length();
    }

    @Test
    public void solutionTest(){
        String s = "Hello World";
        assertEquals( solutionBest(s),5);
        assertEquals( lengthOfLastWord(s),5);
        assertEquals( solution2(s),5);
    }
}
