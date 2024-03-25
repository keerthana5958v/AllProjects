public class BTree {
    public Node rootNode = null;

    public void addNewNode(Node newNode) {
        if (rootNode == null) {
            rootNode = newNode;
        }
        else {
            Node parent = insertNodeInTree(rootNode, newNode);
        }

    }

    public Node insertNodeInTree(Node root, Node newNode) {
        if (root.data < newNode.data) {
            if (root.right != null) {
                insertNodeInTree(root.right, newNode);

            } else {
                root.right = newNode;
            }

        } else if (root.data > newNode.data) {
            if (root.left != null) {
                insertNodeInTree(root.left, newNode);
            } else {
                root.left = newNode;
            }
        }
        return newNode;

    }
}
class Node{

    int data;
    Node left;
    Node right;

}