import 'package:test/test.dart';


class TreeNode<T> {
  T val;
  TreeNode<T>? left;
  TreeNode<T>? right;

  TreeNode(this.val) {
    left  = null;
    right = null;
  }
}

bool isValidBST(TreeNode<num>? root, [num? min ,num? max  ]) {
  if (root == null) return true;
  if ( min != null && root.val <= min ) return false;
  if ( max != null && root.val >= max ) return false;

  return isValidBST(root.left, min, max)
      && isValidBST(root.right, root.val, max);
}
// https://nullsafety.dartpad.dev/3e53f7b92a90a1b5a31484453e76160e

void main() {
  test('0098_Validate_Binary_Search_Tree', () {

    final node1 =  TreeNode(2);
    node1.left  =  TreeNode(1);
    node1.right =  TreeNode(3);
    expect(isValidBST(node1), true);

    final node2 =  TreeNode(5);
    node2.left =  TreeNode(1);
    node2.right =  TreeNode(4);

    if( node2.right != null ){
      node2.right?.left   =  TreeNode(3);
      node2.right?.right  =  TreeNode(3);
    }

    expect(isValidBST(node2),false);

  });

}


// void main(List<String> arguments) {
//   print('Hello world11!');
// }