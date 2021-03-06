import java.util.HashMap;

/**211. 添加与搜索单词 - 数据结构设计
 * https://leetcode-cn.com/problems/add-and-search-word-data-structure-design/description/
 * Created by 老蹄子 on 2018/8/25 下午9:44
 */
class WordDictionary {

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

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new Node();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {

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

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return match(root,word,0);
    }

    private boolean match(Node node,String word,int index){

        if (index == word.length()){
            return node.isWord;
        }

        char c = word.charAt(index);
        if (c != '.'){
            if (node.next.get(c) == null){
                return false;
            }
            return match(node.next.get(c),word,index+1);
        }
        else {
            for (char nextChar : node.next.keySet()){
                if (match(node.next.get(nextChar),word,index+1))
                    return true;
            }
            return false;
        }
    }
}
