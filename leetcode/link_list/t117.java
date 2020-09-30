package link_list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by v_weefhuang on 2020/9/28 16:31.
 * leetcode 117 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 *
 * 初始状态下，所有 next 指针都被设置为 NULL。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t117 {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    class Solution {
        public Node connect(Node root) {
            if (root == null) {
                return null;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                int n = queue.size();
                Node last = null;
                for (int i = 1; i <= n; i++) {
                    Node f = queue.poll();

                    if (f.left != null) {
                        queue.offer(f.left);
                    }

                    if (f.right != null) {
                        queue.offer(f.right);
                    }

                    if ( i != 1) {
                        last.next = f;
                    }

                    last = f;
                }
            }

            return root;
        }
    }

}
