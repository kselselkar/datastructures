package trees.impl;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

     TreeNode rootNode = null;

    private  TreeNode insert(int data, TreeNode rootNode) {
        if (rootNode == null) {
            rootNode = new TreeNode(data);
            return rootNode;
        } else if (data >= rootNode.getData()) {
            TreeNode rightChild = rootNode.getRightChild();
            if(rightChild == null) {
                rightChild = new TreeNode(data);
                rootNode.setRightChild(rightChild);
                return rootNode;
            }
            return insert(data, rootNode.getRightChild());
        } else {
            TreeNode leftChild = rootNode.getLeftChild();
            if(leftChild == null) {
                leftChild = new TreeNode(data);
                rootNode.setLeftChild(leftChild);
                return rootNode;
            }
            return insert(data, rootNode.getLeftChild());
        }
    }

    private TreeNode find(int data,TreeNode rootNode)
    {
        if(rootNode == null) return null;
        else if(data == rootNode.getData()) return rootNode;
        else if(data >= rootNode.getData() && rootNode.getRightChild() != null){
            return find(data,rootNode.getRightChild());
        }else if(data < rootNode.getData() && rootNode.getLeftChild() != null){
            return find(data,rootNode.getLeftChild());
        }
        return null;
    }



    public void delete(int data) {

    }

    public static void main(String[] args) {

        System.out.println("inserting data");
        BinarySearchTree bs=new BinarySearchTree();

        if(bs.rootNode == null)bs.rootNode=bs.insert(25, bs.rootNode);
        bs.insert(24, bs.rootNode);
        bs.insert(28, bs.rootNode);
        bs.insert(27, bs.rootNode);
        bs.insert(29, bs.rootNode);
        bs.insert(23, bs.rootNode);
        bs.insert(21, bs.rootNode);
        bs.insert(18, bs.rootNode);
        System.out.println("insertion done");
        System.out.println("finding node " + bs.find(18,bs.rootNode).getData());

    }
}
