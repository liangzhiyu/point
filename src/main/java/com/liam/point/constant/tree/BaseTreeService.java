package com.liam.point.constant.tree;

/**
 * @author: liangzy
 * @date: 2019/08/24 下午4:07
 * @desc:
 */
public class BaseTreeService {

    /**
     * @author: liangzy
     * @date: 19-8-24 下午3:14
     * @param: []
     * @return: void
     * @desc: 初始化一个3层的完全二叉树
     * 完全二叉树：叶子节点都在最底下两层，最后一层的叶子节点都靠左排列，
     * 并且除了最后一层，其他层的节点个数都要达到最大
     */
    public TreeNode initBinaryTree(){
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


    /**
     * @author: liangzy
     * @date: 19-8-24 下午4:18
     * @param: []
     * @return: com.liam.point.constant.tree.TreeNode
     * @desc: 初始化一个3层的二叉查找树
     * 二叉查找树：在树中的任意一个节点，其左子树中的每个节点的值，
     *  都要小于这个节点的值，而右子树节点的值都大于这个节点的值。
     */
    public TreeNode initBinarySearchTree(){
        //t4为根节点
        TreeNode t1 = new TreeNode(1);
        TreeNode t2= new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);

        t4.setLeft(t2);
        t4.setRight(t6);

        t2.setLeft(t1);
        t2.setRight(t3);

        t6.setLeft(t5);
        t6.setRight(t7);
        return t4;
    }
}
