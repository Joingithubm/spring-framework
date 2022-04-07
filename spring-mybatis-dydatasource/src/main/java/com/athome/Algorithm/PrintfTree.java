package com.athome.Algorithm;

import java.util.List;

/**
 * @Description:
 * @Author: fanchao@dtstack.com
 * @Date: 2022-02-08 10:16 上午
 */
public class PrintfTree {




}

class TreeNode{

    private int value;
    private TreeNode leftTree;
    private TreeNode rightTree;

    public TreeNode(){}
    public TreeNode(int value){
        this.value = value;
    }
    public TreeNode(TreeNode leftTree, TreeNode rightTree, int value){
        this.leftTree = leftTree;
        this.rightTree = rightTree;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(TreeNode leftTree) {
        this.leftTree = leftTree;
    }

    public TreeNode getRightTree() {
        return rightTree;
    }

    public void setRightTree(TreeNode rightTree) {
        this.rightTree = rightTree;
    }
}

class PreOrderReverse{

    public static void main(String[] args) {

    }

    public static void preReverse(TreeNode root, List<Integer> list){
        if (root != null) {
            preReverse(root.getLeftTree(),list);
        }
        list.add(root.getValue());
    }

}

class BuiderTree{

    public static void main(String[] args) {

    }

    public static void reBuiderTree(List<Integer> list){

    }

}