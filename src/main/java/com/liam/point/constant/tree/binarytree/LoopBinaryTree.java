package com.liam.point.constant.tree.binarytree;

import com.liam.point.constant.tree.TreeNode;

/**
 * @author: liangzy
 * @date: 2019/08/24 下午3:09
 * @desc: 二叉树的遍历有三种方式:前序遍历、中序遍历、后续遍历
 */
public class LoopBinaryTree {

    public static void main(String[] args) {
        LoopBinaryTree loopBinaryTree = new LoopBinaryTree();
        TreeNode tree = loopBinaryTree.initBTree();

        System.out.println("前序遍历");
        loopBinaryTree.preLoopBTree(tree);

        System.out.println("中序遍历");
        loopBinaryTree.middleLoopBTree(tree);

        System.out.println("后序遍历");
        loopBinaryTree.afterleLoopBTree(tree);

    }


    /**
     * @author: liangzy
     * @date: 19-8-24 下午3:21
     * @param: [treeNode]
     * @return: void
     * @desc: 先序遍历: 递归实现 先打印本身，再打印左节点，在打印右节点
     */
    public void preLoopBTree(TreeNode treeNode){
        if (treeNode == null) {
            return;
        }
        System.out.println(treeNode.getData());
        preLoopBTree(treeNode.getLeft());
        preLoopBTree(treeNode.getRight());
    }


    /**
     * @author: liangzy
     * @date: 19-8-24 下午3:23
     * @param: [treeNode]
     * @return: void
     * @desc: 中序遍历 先输出左节点，再输出本身，最后输出右节点
     */
    public void middleLoopBTree(TreeNode treeNode){
        if (treeNode == null) {
            return;
        }
        middleLoopBTree(treeNode.getLeft());
        System.out.println(treeNode.getData());
        middleLoopBTree(treeNode.getRight());
    }



    /**
     * @author: liangzy
     * @date: 19-8-24 下午3:30
     * @param: [treeNode]
     * @return: void
     * @desc: 后序遍历 先输出左节点，再输出右节点，最后输出本身
     */
    public void afterleLoopBTree(TreeNode treeNode){
        if (treeNode == null) {
            return;
        }
        afterleLoopBTree(treeNode.getLeft());
        afterleLoopBTree(treeNode.getRight());
        System.out.println(treeNode.getData());
    }


    /**
     * @author: liangzy
     * @date: 19-8-24 下午3:14
     * @param: []
     * @return: void
     * @desc: 初始化一个3层的完全二叉树（叶子节点都在最底下两层，
     * 最后一层的叶子节点都靠左排列，并且除了最后一层，其他层的节点个数都要达到最大）
     */
    public TreeNode initBTree(){
        //t1为根节点
        TreeNode t1 = new TreeNode(1);
        TreeNode t2= new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);

        t1.setLeft(t2);
        t1.setRight(t3);

        t2.setLeft(t4);
        t2.setRight(t5);

        t3.setLeft(t6);
        t3.setRight(t7);
        return t1;
    }
}
