/*Given the root of a binary tree and a key, find the level order successor of the key.

The level order successor is the node that appears immediately after the given node in BFS (Level Order Traversal).

If the key is the last node in the traversal, return null.

Example:-
Tree:
        12
       /  \
      7    1
     /    / \
    9    10  5

key = 9

Level Order: 12 → 7 → 1 → 9 → 10 → 5

Output: 10

*/


import java.util.LinkedList;
import java.util.Queue;

public class findSuccessor {

    public static TreeNode find(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            TreeNode curr = q.poll();
            if (curr.left != null) {
                q.offer(curr.left);
            }
            if (curr.right != null) {
                q.offer(curr.right);
            }
            if (curr.val == key) {
                return q.peek();
            }
        }

        return null;

    }
}
