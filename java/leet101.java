public class leet101 {
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

    public static boolean issymmetric(Node left, Node right){
        if(left == null && right == null){
            return true;
        }
        if (left == null || right == null) {
            return false; 
        }

        return left.data == right.data && issymmetric(left.left, right.right) && issymmetric(left.right, right.left);
    }



    public static void main(String[] args){
        int[] Nodes1 = {1,2,-1,-1,2,-1,-1}, Nodes2 = {1,2,-1,-1,3,-1,-1};

        Binarytree tree = new Binarytree();

        Binarytree.idx = -1;
        Node root1 = tree.builtree(Nodes1);
        Binarytree.idx = -1;
        Node root2 = tree.builtree(Nodes2);

        System.out.println(issymmetric(root1.left , root1.right));

    }
}
