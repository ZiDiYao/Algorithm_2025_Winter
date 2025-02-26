package Graph02;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
    // 宽度优先遍历
    public void bfs(Node node){
        // 宽度优先遍历, 从一个点出发就行
        if (node == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        // 确保不重复进队列
        HashSet<Node> set = new HashSet<>();
        queue.add(node);
        set.add(node);
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            // 处理逻辑
            for (Node next : curr.nexts){
                if (!set.contains(next)){
                    set.add(next);
                    queue.add(next);
                }
            }
        }
    }
}
