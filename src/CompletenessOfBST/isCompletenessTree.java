package CompletenessOfBST;
import Binary_Search_Tree.Node;

import java.util.LinkedList;
import java.util.Queue;


public class isCompletenessTree {
    // 1. 有右孩子, 但是无左孩子 直接 false
    // 2. 但凡遇到一个左右两个孩子不双全的情况., 那么接下来所有节点都必须是叶节点

    public boolean isCBT(Node node){
        if (node == null){
            return true;
        }
        // 宽度优先遍历
        Queue<Node> queue = new LinkedList<>();
        boolean leaf = false; // 是否遇到了左右两个孩子不双全这个时间的发生
        Node l = null;
        Node r = null;
        queue.add(node);
        while (!queue.isEmpty()){
            Node curr = queue.poll();
            if ((leaf && (curr.right != null || curr.left !=null)) ||
                    (curr.left == null && curr.right !=null)
            ){
                return false;
            }
            if (curr.left !=null){
                queue.add(curr.left);
            }
            if (curr.right !=null){
                queue.add(curr.right);
            }
            if (curr.right == null && curr.right == null){
                leaf = true;
            }
        }
        return true;
    }

}
