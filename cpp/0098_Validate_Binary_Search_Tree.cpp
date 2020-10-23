#include <iostream>
#include "BinaryTreeNode.h"
#include <gtest/gtest.h>

class Solution {
public:
    bool isValidBST(TreeNode* root) {
        return isValidBST(root, nullptr, nullptr);
    }
private:
    bool isValidBST(TreeNode* root, int* min_val, int* max_val) {
        if (!root) return true;
        if ((min_val && root->val <= *min_val)
            ||(max_val && root->val >= *max_val))
            return false;

        return isValidBST(root->left, min_val, &root->val)
               && isValidBST(root->right, &root->val, max_val);
    }
};

TEST(ValidBst, test) {
    Solution* s = new Solution();

    TreeNode* node1 = new TreeNode(2);
    node1->left = new TreeNode(1);
    node1->right = new TreeNode(3);

    EXPECT_EQ(true, s->isValidBST(node1));


    TreeNode* node2 = new TreeNode(5);
    node2->left = new TreeNode(1);
    node2->right = new TreeNode(4);
    node2->right->left = new TreeNode(3);
    node2->right->right = new TreeNode(6);

    EXPECT_EQ(false, s->isValidBST(node2));
}
int main() {
    ::testing::InitGoogleTest();
    return RUN_ALL_TESTS();
}