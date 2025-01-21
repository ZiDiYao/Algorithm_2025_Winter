package Prefix_Tree;
public class TrieNode{
    public int pass;
    public int end;
    public TrieNode[] nexts;

    public TrieNode(){
        pass = 0;
        end = 0;
        nexts = new TrieNode[26]; // assume there are only lower English character 
    }




}