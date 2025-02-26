package Graph02;

public class GraphGenerator {
    /*
    input is a matrix
    |5,0,1|
    |3,1,2|
    |7,0,2|
    代表着: 长度为 1 的 edge 从 5 ---> 0
           长度为 2 的 edge 从 3 ---> 1
     */
    public Graph createGraph(Integer[][] matrix){
        Graph graph = new Graph();
        for (int i=0; i<matrix.length; i++){ // matrix[0][0]
            Integer from = matrix[i][0];
            Integer to = matrix[i][1];
            Integer weight = matrix[i][2];
            // 查看这个节点是否被添加过曾经
            if (!graph.nodes.containsKey(from)){
                graph.nodes.put(from,new Node(from));
            }
            if (!graph.nodes.containsKey(to)){
                graph.nodes.put(to, new Node(to));
            }
            Node fromNode = graph.nodes.get(from);
            Node toNode = graph.nodes.get(to);
            Edge newEdge = new Edge(weight,fromNode,toNode);
            fromNode.nexts.add(toNode);
            fromNode.nexts.add(toNode);
            fromNode.out++;
            toNode.in++;
            fromNode.edges.add(newEdge);
            graph.edges.add(newEdge);

        }
        return graph;
    }

}

