public class leet100 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree {
        static int idx = -1;

        public static Node builtree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = builtree(nodes);
            newNode.right = builtree(nodes);

            return newNode;
        }

    }

    public static boolean issame(Node root1, Node root2){
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return root1.data == root2.data && issame(root1.left, root2.left) && issame(root1.right, root2.right);
    }



    public static void main(String[] args){
        int[] Nodes1 = {1,2,-1,-1,3,-1,-1}, Nodes2 = {1,2,-1,-1,3,-1,-1};

        Binarytree tree = new Binarytree();

        Binarytree.idx = -1;
        Node root1 = tree.builtree(Nodes1);
        Binarytree.idx = -1;
        Node root2 = tree.builtree(Nodes2);

        System.out.println(issame(root1, root2));

    }
}
