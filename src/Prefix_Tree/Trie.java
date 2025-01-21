package Prefix_Tree;

public class Trie {

    private TrieNode root; // 头节点

    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        if (word == null){
            return;
        }
        char[] chs = word.toCharArray();
        TrieNode node = root;
        node.pass++;
        int index =0;
        for (int i =0; i< chs.length; i++){
            index = chs[i] -'a';
            // 如果这个之前没有被加入进去 
            if (node.nexts[index] == null){
                node.nexts[index] = new TrieNode();
            }
            // node 转移到新的节点， 继续向下
            // 如果有节点， 那么就复用节点， 直接移动 
            node = node.nexts[index];
            node.pass++;
        }
        // 最后一个节点，说明到达了字符串尾部， 所以 end++
        node.end++;
    }

    public int search(String word){
        // edge case
        if ( word == null){
            return 0;
        }
        char[] chs = word.toCharArray();
        TrieNode node = root;
        int index = 0;
        for (int i =0; i < chs.length; i++){
            index = chs[i] - 'a';
            // next 里没了， 但是字符没有走完
            if (node.nexts[index] == null){
                return 0;
            }
            node = node.nexts[index];
        }
        // 返回最后一个字符的 end 值
        return node.end;
    }

    // 所以加入的字符串中，有几个是以 pre 这个字符串作为前缀的
    // 唯一区别是， 返回 node.pass 的值

    public int preFixNumber(String pre){
            if ( pre == null){
                return 0;
            }
            char[] chs = pre.toCharArray();
            TrieNode node = root;
            int index = 0;
            for (int i =0; i < chs.length; i++){
                index = chs[i] - 'a';
                if (node.nexts[index] == null){
                    return 0;
                }
                node = node.nexts[index];
            }
            return node.pass;
    }

    public void delete(String word){
        // 需要保证，树中确实加入过 word
        if (search(word) !=0){
            char[] chs = word.toCharArray();
            TrieNode node = root; // 赋值根节点 
            node.pass--;
            int index =0;
            for (int i =0; i <chs.length; i++){
                index = chs[i] -'a';
                if (--node.nexts[index].pass == 0){
                    node.nexts[index] = null;
                    return;
                }
                node = node.nexts[index];
            }
            // 最后一个值的 end 值减 1 
            node.end--;

        }
    }
}
