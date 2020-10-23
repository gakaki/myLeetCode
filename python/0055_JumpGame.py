import unittest


# https://leetcode-cn.com/problems/valid-anagram/?utm_source=LCUS&utm_medium=ip_redirect_q_uns&utm_campaign=transfer2china
# 242. 有效的字母异位词
# hashMap 递增
# Time O(1)x n push stack pop stack o(1)
# Space O(n)

# 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
#
# 示例1:
#
# 输入: s = "anagram", t = "nagaram"
# 输出: true
# 示例 2:
#
# 输入: s = "rat", t = "car"
# 输出: false
# 说明:
# 你可以假设字符串只包含小写字母。
#
# 进阶:
# 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？

class Solution(object):
    def isAnagram(self, s, t):
        if len(s) != len(t):
            return False

        str1 = [0] * 26
        str2 = [0] * 26
        for c in s:  # ord 是求 ascii 因为都是小写字母
            str1[ord(c) - 97] += 1
        for c in t:
            str2[ord(c) - 97] += 1
        return str1 == str2

    def isAnagramUnicode(self, s, t):
        if len(s) != len(t):
            return False

        alpha = {}
        beta = {}
        for c in s:
            alpha[c] = alpha.get(c, 0) + 1
        for c in t:
            beta[c] = beta.get(c, 0) + 1
        return alpha == beta

    def isAnagramSuperEasy(self, str1, str2):
        return sorted(str1) == sorted(str2)


class TestSolution(unittest.TestCase):

    def testSolution(self):
        sol = Solution()
        s = "anagram"
        t = "nagaram"
        self.assertTrue(sol.isAnagram(s, t))
        self.assertTrue(sol.isAnagramUnicode(s, t))
        self.assertTrue(sol.isAnagramSuperEasy(s, t))

        s = "rat"
        t = "car"
        self.assertFalse(sol.isAnagram(s, t))
        self.assertFalse(sol.isAnagramUnicode(s, t))
        self.assertFalse(sol.isAnagramSuperEasy(s, t))

if __name__ == '__main__':
    unittest.main()
