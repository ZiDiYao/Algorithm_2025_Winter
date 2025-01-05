package Binary_Search_Tree;
public class isBST {

    private int preValue = Integer.MIN_VALUE;
    public boolean isBST(Node node){
        if (node == null){
            return true;
        }
        // check left tree
        boolean isLeftBST = isBST(node.left);
        if (!isLeftBST){
            return false;
        }else{
            preValue = node.value;
        }
        return isBST(node.right);
    }


    // 使用非递归的方法
//    public boolean isBST02(Node node){
//
//
//
//    }
}
