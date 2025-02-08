package Tree.TreeDP;
import Binary_Search_Tree.Node;

public class LargestDistanceTwoNode {
    // 最大距离
    // 情况 1 node curr 不参与但情况下, 左树的最大距离 或者 右树的最大距离
    // 情况 2 node curr 参与的情况下, curr 左树离我最远的距离出发 和 右边树离 curr 最远的 node 出发
    public class info{
        int maxDistance;
        int height;
        public info(int maxDis, int height){
            this.height = height;
            this.maxDistance = maxDis;
        }
    }
    public info process(Node node){
        if (node == null){
            return new info(0,0);
        }
        // black box
        info leftInfo = process(node.left);
        info rightInfo = process(node.right);
        int p1 = leftInfo.maxDistance;
        int p2 = rightInfo.maxDistance;
        int p3 = leftInfo.height + rightInfo.height + 1;
        int maxDistance = Math.max(p3, Math.max(p1,p2));
        int height = Math.max(leftInfo.height, rightInfo.height);
        return new info(maxDistance,height);
    }
}
