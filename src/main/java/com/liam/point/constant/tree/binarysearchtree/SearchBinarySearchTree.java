package com.liam.point.constant.tree.binarysearchtree;

import com.liam.point.constant.tree.BaseTreeService;
import com.liam.point.constant.tree.TreeNode;
import com.liam.point.constant.tree.binarytree.LoopBinaryTree;

/**
 * @author: liangzy
 * @date: 2019/08/24 下午4:08
 * @desc: 搜索二叉查找树
 * 二叉查找树：在树中的任意一个节点，其左子树中的每个节点的值，
 * 都要小于这个节点的值，而右子树节点的值都大于这个节点的值。
 */
public class SearchBinarySearchTree {

    public static void main(String[] args) {
        TreeNode tree = new BaseTreeService().initBinarySearchTree();
        SearchBinarySearchTree sbst = new SearchBinarySearchTree();
        sbst.searchBinarySearchTree(tree, 7);

        sbst.insertBinarySearchTree(tree,8);
        new LoopBinaryTree().afterleLoopTree(tree);
    }


    /**
     * @author: liangzy
     * @date: 19-8-24 下午4:32
     * @param: [node, number]
     * @return: java.lang.Integer
     * @desc: 二叉查找树中查找数据：
     * 将number和当前节点比较，如果小于当前节点，递归左子节点；如果大于当前节点，则递归右子节点
     */
    public Integer searchBinarySearchTree(TreeNode node, Integer number) {
        if (node == null) {
            return null;
        }

        int data = node.getData();
        System.out.println(data);
        if (data == number) {
            System.out.println("number is " + data);
            return data;
        }

        if (number < data) {
            searchBinarySearchTree(node.getLeft(), number);
        }

        if (number > data) {
            searchBinarySearchTree(node.getRight(), number);
        }
        return data;
    }


    /**
     * @author: liangzy
     * @date: 19-8-24 下午4:37
     * @param: [node, number]
     * @return: void
     * @desc: 二叉查找树中插入数据：
     * 插入跟查找差不多，也是从根节点开始找，如果要插入的数据比节点的数据大，并且节点的右子树为空，
     * 就将新数据直接插到右子节点的位置；如果不为空，就再递归遍历右子树，查找插入位置。
     * 同理，如果要插入的数据比节点数值小，并且节点的左子树为空，就将新数据插入到左子节点的位置；
     * 如果不为空，就再递归遍历左子树，查找插入位置。
     */
    public void insertBinarySearchTree(TreeNode node, Integer number) {
        int data = node.getData();
        if (number > data) {
            TreeNode nodeRight = node.getRight();
            if (nodeRight == null) {
                System.out.println(number+"已插入右子节点,父节点为："+data);
                node.setRight(new TreeNode(number));
                return;
            }
            if (nodeRight != null) {
                insertBinarySearchTree(nodeRight,number);
            }
        }

        if (number < data) {
            TreeNode nodeLeft = node.getLeft();
            if (nodeLeft == null) {
                System.out.println(number+"已插入左子节点,父节点为："+data);
                node.setLeft(new TreeNode(number));
                return;
            }
            if (nodeLeft != null) {
                insertBinarySearchTree(nodeLeft,number);
            }
        }
    }
}
