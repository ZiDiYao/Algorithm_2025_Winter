package Tree.TreeDP;
import Binary_Search_Tree.Node;

public class IsBalanced {
    public boolean isBalancedTree(Node node){
        return process(node).isBalance;

    }
    public class ReturnType{
        public boolean isBalance;
        public int height;
        public ReturnType(boolean isB, int height){
            this.isBalance = isB;
            this.height = height;
        }
    }
    public ReturnType process(Node node){
        // base case
        if (node == null){
            return new ReturnType( true, 0);
        }
        ReturnType leftDate = process(node.left);
        ReturnType rightDate = process(node.right);
        int height = Math.max(leftDate.height, rightDate.height) + 1;
        boolean isBalance = leftDate.isBalance && rightDate.isBalance
                && Math.abs(leftDate.height - rightDate.height) < 2;
        return new ReturnType(isBalance, height);
    }
}
