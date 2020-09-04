package binaryTree;

public class Tree {

    private  TreeNode root;

    public void  insert(int value){

        if(root == null){
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }

    public void inOrderTraverse(){
        if(root != null){
            root.inOrderTraverse();

        }
    }


}
