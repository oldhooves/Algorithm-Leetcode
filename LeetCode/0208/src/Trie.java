import java.util.HashMap;

/**
 * 208. 实现 Trie (前缀树)
 * https://leetcode-cn.com/problems/implement-trie-prefix-tree/description/
 * Created by 老蹄子 on 2018/8/25 下午9:21
 */
class Trie {

    private class Node{

        public boolean isWord;
        public HashMap<Character,Node> next;

        public Node(boolean isWord){
            this.isWord = isWord;
            next = new HashMap<>();
        }

        public Node(){
            this(false);
        }
    }

    private Node root;

    public Trie(){
        root = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {

        Node cur = root;
        for (int i = 0 ; i < word.length(); i++){
            Character c = word.charAt(i);
            if (cur.next.get(c) == null){
                cur.next.put(c,new Node());
            }
            cur = cur.next.get(c);
        }
        cur.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {

        Node cur = root;
        for (int i = 0; i <word.length();i++){
            Character c = word.charAt(i);
            if (cur.next.get(c) == null){
                return false;
            }
            cur = cur.next.get(c);
        }
        return cur.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {

        Node cur = root;
        for (int i = 0; i < prefix.length(); i++){
            Character c = prefix.charAt(i);
            if (cur.next.get(c) == null){
                return false;
            }
            cur = cur.next.get(c);
        }
        return true;
    }
}
