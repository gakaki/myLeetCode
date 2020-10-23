import unittest


# https://leetcode-cn.com/problems/valid-parentheses/
# 20. 有效的括号
# 使用堆栈方法
# Time O(1)x n push stack pop stack o(1)
# Space O(n)

#
# 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
#
# 有效字符串需满足：
#
# 左括号必须用相同类型的右括号闭合。
# 左括号必须以正确的顺序闭合。
# 注意空字符串可被认为是有效字符串。

class Solution(object):
    def isValid(self, s):
        stack = []
        paren_map = {')': '(', '}': '{',
                     ']': '['}  # 存储关系 而且把右侧符号放在左边是因为 按照题意 右边括号一定在左边的前面按照堆栈的关系肯定 左括号已经在堆栈里了 否则无法形成一一对应
        for c in s:
            if c not in paren_map:  # 按照题意 不是左边符号那就肯定是右边符号
                stack.append(c)
            elif not stack or paren_map[c] != stack.pop():  # not stack 是表示stack里是否有元素
                return False
        return not stack

    # 不推荐 性能没有stack来得好
    def isValidReplace(self, s):
        s_len = 0
        condition = True
        while condition:
            s_len = len(s)
            s = s.replace('{}', '').replace('()', '').replace('[]', '')
            condition = s_len != len(s)
        return len(s) == 0


class TestSolution(unittest.TestCase):

    def testSolution(self):
        sol = Solution()
        self.assertTrue(sol.isValid("()"))
        self.assertTrue(sol.isValid("()[]{}"))
        self.assertFalse(sol.isValid("(]"))
        self.assertTrue(sol.isValid("{[]}"))

        self.assertTrue(sol.isValidReplace("()"))
        self.assertTrue(sol.isValidReplace("()[]{}"))
        self.assertFalse(sol.isValidReplace("(]"))
        self.assertTrue(sol.isValidReplace("{[]}"))


if __name__ == '__main__':
    unittest.main()
