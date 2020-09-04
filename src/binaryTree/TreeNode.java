package binaryTree;

public class TreeNode {

    //need three Field
    private  int data;
    private  TreeNode rightChild;
    private  TreeNode leftChild;

    public void insert(int value){

        if(value == data){
            return;
        }
        if(value < data){
            if(leftChild ==null){
                leftChild = new TreeNode(value);

            }
            else{
                leftChild.insert(value);
            }
        }
        else{
            if(rightChild == null){
                rightChild = new TreeNode(value);
            }
            else {
                rightChild.insert(value);
            }
        }

    }

    public void inOrderTraverse(){
        if(leftChild != null){
            leftChild.inOrderTraverse();

        }
        System.out.println("Data: " + data + ", ");

        if (rightChild != null){
            rightChild.inOrderTraverse();
        }

    }

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }



}
