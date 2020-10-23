import unittest


# https://leetcode-cn.com/problems/valid-anagram/?utm_source=LCUS&utm_medium=ip_redirect_q_uns&utm_campaign=transfer2china
# No.557. 反转字符串中的单词 III
# 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
#
# 示例 1:
#
# 输入: “Let’s take LeetCode contest”
# 输出: “s’teL ekat edoCteeL tsetnoc”
# 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。

class Solution(object):
    def reverseWords(self, s):
        return " ".join(map(lambda x : x[::-1], s.split(" ")))


class TestSolution(unittest.TestCase):
    def testSolution(self):
        sol = Solution()
        s = "Let's take LeetCode contest"
        t = "s'teL ekat edoCteeL tsetnoc"
        self.assertEqual(sol.reverseWords(s), t)

if __name__ == '__main__':
    unittest.main()
