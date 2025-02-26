package Graph02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class GraphDFS {
    public void dfs(Node node){
        if (node != null){
            return;
        }
        // 加入节点是处理逻辑
        Stack<Node> stack = new Stack<>();
        HashSet<Node> set = new HashSet<>();
        stack.add(node);
        set.add(node);
        // 处理逻辑
        while (!stack.isEmpty()){
            Node curr = stack.pop();
            for (Node next: curr.nexts){
                if (!set.contains(next)){
                    stack.push(curr);
                    stack.push(next);
                    set.add(next);
                    break; // 一旦发现有一条没走过, 直接往死里走, 不走其他的先
                }
            }
        }
    }
}
