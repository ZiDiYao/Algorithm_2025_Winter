package Graph02;

public class TopologySort {
    // 在实际的工程项目中, 不可以存在相互依赖的情况
    // 拓补排序
    // 如何确定编译的顺序呢?
    // 安排项目/工程, B 需要依赖 A 才能工作, 也就是说, 你需要先去编译 A 才能去编译 B.
    public void sortedTopology(Graph graph){
        // 先找到起始点: in = 0 的点
        // 比如说先找到 A, 然后把 A 和其影响的 edge 擦掉
        // 然后, 再去找 in = 0 的 点比如说是 B, 然后重复以上步骤




    }
}
