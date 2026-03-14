package day12.dataStructure.nonLinear.trees.BinarySearchTrees;
class TreeNode{
    int data;
    TreeNode left, right;
    TreeNode(int value){
        data = value;
        left = right = null;
    }
}
public class BinarySearchTree {
    public static void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    static TreeNode insert(TreeNode root, int key){
        if(root == null){
            return new TreeNode(key);
        }
        if (key < root.data){
            root.left = insert(root.left, key);
        } else if(key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    static void main() {
        TreeNode root = null;
        root = insert(root, 50);
        inorder(root);
        System.out.println();
        int[] arr = {60,20,30,10,58,100};
        for(int i=0; i<arr.length; i++){
            root = insert(root, arr[i]);
        }
        inorder(root);
        System.out.println();
    }
}
