package Graph02;

import java.util.ArrayList;

public class Node {
    public int value;
    public int in; // 多少个点直接指向 this 节点
    public int out; // 指向多少个 Node, 无向图 in 和 out 应该是一样的
    public ArrayList<Node> nexts;
    public ArrayList<Edge> edges;

    public Node(int value){
        this.value = value;
        in =0;
        out =0;
        nexts = new ArrayList<>();
        edges = new ArrayList<>(); //
    }


}
