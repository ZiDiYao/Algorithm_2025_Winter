package Tree;
import Binary_Search_Tree.Node;

public class IsBSTRecurssion {
    // 列可能性, assume 可以向左边树要信息, 可以向右边树要信息
    // 1. 左边是 BST 右边是 BST
    // 2. 左边的最大值应该小于当前 curr, 并且右边最小值应该大于 curr
    // 所以, 我要向左边要什么信息? 第一, 最大值, 最小值, 和是否是搜索二叉树
    public class ReturnType{
        public boolean isBST;

        public int max;
        public int min;

        public ReturnType(boolean isBST, int min, int max){
            this.isBST = isBST;
            this.max = max;
            this.min = min;
        }
        public ReturnType process(Node node){
            // base case
            if (node == null) {
                return null;
            }
            ReturnType leftTree = process(node.left);
            ReturnType rightTree = process(node.right);
            int min = node.value;
            int max = node.value;
            if (leftTree != null){
                min = Math.min( leftTree.min, min);
                max = Math.max(leftTree.max, max);
            }
            if (rightTree != null){
                min = Math.min( rightTree.min, min);
                max = Math.max(rightTree.max, max);
            }
            boolean isBST = true;
            if (leftTree != null && (!leftTree.isBST || leftTree.max >= node.value)){
                isBST = false;
            }

            if (rightTree != null && (!rightTree.isBST || node.value >= rightTree.min)){
                isBST = false;
            }

            return new ReturnType(isBST,min, max);
        }
    }
}
