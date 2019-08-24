package com.liam.point.constant.tree;

import lombok.Data;

/**
 * @author: liangzy
 * @date: 2019/08/24 下午3:08
 * @desc:
 */
@Data
public class TreeNode {
    private Integer data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Integer data){
        this.data = data;
    }
}
