class BST <Key extends Comparable<Key>, Value> {
    Node root;
    
    class Node {
        Key key;
        Value value;
        Node ls, rs;

        public Node() {
            key = null;
            value = null;
            ls = rs = null;
        }

        public Node(Key _key, Value _value) {
            key = _key;
            value = _value;
            ls = rs = null;
        }

        public String toString() {
            return "(key:" + key.toString() + " value:" + value.toString() + ")";
        }
    }

    public BST() {
        root = null;
    }

    public void Insert(Key key, Value val) {
        root = Insert(root, key, val);
    }

    private Node Insert(Node x, Key key, Value val) {
        if (x == null) return new Node(key, val);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.ls = Insert(x.ls, key, val);
        else if (cmp > 0) x.rs = Insert(x.rs, key, val);
        else x.value = val;
        return x;
    }

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node x) {
        if (x != null) {
            inorder(x.ls);
            System.out.print(x.toString());
            inorder(x.rs);
        }
    }

    public Value prefix(Key key) {
        Node result = prefix(root, key, null);
        return (result != null) ? result.value : null;
    }

    private Node prefix(Node x, Key key, Node best) {
        if (x == null) return best;
        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            best = x;
            return prefix(x.rs, key, best); 
        } else {
            return prefix(x.ls, key, best);
        }
    }
}

public class AnotherMain {
    public static void main(String[] args) {
        BST<Integer, String> B = new BST<>();
        B.Insert(3, "How");
        B.Insert(2, "Hello");
        B.Insert(9, "Yes");
        B.Insert(5, "Are");
        B.Insert(8, "You");
        
        B.inorder();
        
        System.out.println(B.prefix(3)); 
        System.out.println(B.prefix(8)); 
        System.out.println(B.prefix(9)); 
    }
}
