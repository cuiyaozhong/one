package com.example.one.binaryTree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author 崔耀中
 * @since 2020-12-21
 */
public class OrderTravel {

    private static class TreeNode {

        int data;

        TreeNode leftChild;

        TreeNode rightChild;

        TreeNode(int data) {
            this.data = data;
        }


    }

    /**
     * @Description 创建二叉树
     * @Param inputList 输入序列
     */
    public static TreeNode createTreeNode(List<Integer> inputList) {
        if (inputList == null || inputList.isEmpty()) {
            return null;
        }

        TreeNode node = null;
        Integer data = inputList.remove(0);
        if (data != null) {
            node = new TreeNode(data);
            node.leftChild = createTreeNode(inputList);
            node.rightChild = createTreeNode(inputList);

        }
        return node;
    }

    /**
     * @Description 二叉树前序遍历（根-左-右）
     * @Param node 二叉树节点
     */
    public static void preOrderTravel(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preOrderTravel(node.leftChild);
        preOrderTravel(node.rightChild);
    }

    /**
     * @Description 二叉树中序遍历（左-根-又）
     * @Param node 二叉树节点
     */
    public static void inOrderTravel(TreeNode node){
        if (node == null){
            return;
        }
        inOrderTravel(node.leftChild);
        System.out.println(node.data);
        inOrderTravel(node.rightChild);

    }

    /**
     * @Description 二叉树后序遍历（左-右-根）
     * @Param node 二叉树节点
     */
    public static void postOrderTravel(TreeNode node){
        if (node == null){
            return;
        }
        postOrderTravel(node.leftChild);
        postOrderTravel(node.rightChild);
        System.out.println(node.data);
    }

    /**
     * @Description 利用栈前序遍历二叉树
     * @Param [args]
     */
    public static void preOrderTraveralWithStack(TreeNode root){

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode treeNode = root;
        while (treeNode!=null || !stack.isEmpty()){
            //迭代访问节点的左孩子，并入栈
            while (treeNode != null){
                System.out.println(treeNode.data);
                stack.push(treeNode);
                treeNode = treeNode.leftChild;
            }
            //如果节点没有左孩子，则弹出栈顶节点，访问节点右孩子
            while (!stack.isEmpty()){
                treeNode = stack.pop();
                treeNode = treeNode.rightChild;

            }
        }
    }

    public static void main(String[] args) {
        List<Integer> inputList = new LinkedList<Integer>(Arrays.asList(new Integer[]{3,2,9,null,null,10,null, null,8,null,4}));
        TreeNode node = createTreeNode(inputList);

        System.out.println("前序遍历");
        preOrderTravel(node);

        System.out.println("中序遍历");
        inOrderTravel(node);

        System.out.println("后序遍历");
        postOrderTravel(node);

        System.out.println("利用栈前序遍历二叉树");
        preOrderTraveralWithStack(node);
    }

}