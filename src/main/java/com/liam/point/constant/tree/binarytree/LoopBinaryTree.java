package com.liam.point.constant.tree.binarytree;

import com.liam.point.constant.tree.BaseTreeService;
import com.liam.point.constant.tree.TreeNode;

/**
 * @author: liangzy
 * @date: 2019/08/24 下午3:09
 * @desc: 遍历二叉树
 * 遍历二叉树有三种方式:前序遍历、中序遍历、后续遍历
 */
public class LoopBinaryTree {

    public static void main(String[] args) {
        LoopBinaryTree lbt = new LoopBinaryTree();
        TreeNode tree = new BaseTreeService().initBinaryTree();

        System.out.println("前序遍历");
        lbt.preLoopTree(tree);

        System.out.println("中序遍历");
        lbt.middleLoopTree(tree);

        System.out.println("后序遍历");
        lbt.afterleLoopTree(tree);

    }


    /**
     * @author: liangzy
     * @date: 19-8-24 下午3:21
     * @param: [treeNode]
     * @return: void
     * @desc: 先序遍历: 递归实现 先打印本身，再打印左节点，在打印右节点
     */
    public void preLoopTree(TreeNode treeNode){
        if (treeNode == null) {
            return;
        }
        System.out.println(treeNode.getData());
        preLoopTree(treeNode.getLeft());
        preLoopTree(treeNode.getRight());
    }


    /**
     * @author: liangzy
     * @date: 19-8-24 下午3:23
     * @param: [treeNode]
     * @return: void
     * @desc: 中序遍历 先输出左节点，再输出本身，最后输出右节点
     */
    public void middleLoopTree(TreeNode treeNode){
        if (treeNode == null) {
            return;
        }
        middleLoopTree(treeNode.getLeft());
        System.out.println(treeNode.getData());
        middleLoopTree(treeNode.getRight());
    }



    /**
     * @author: liangzy
     * @date: 19-8-24 下午3:30
     * @param: [treeNode]
     * @return: void
     * @desc: 后序遍历 先输出左节点，再输出右节点，最后输出本身
     */
    public void afterleLoopTree(TreeNode treeNode){
        if (treeNode == null) {
            return;
        }
        afterleLoopTree(treeNode.getLeft());
        afterleLoopTree(treeNode.getRight());
        System.out.println(treeNode.getData());
    }

}
