package problem_27;

import sun.reflect.generics.tree.Tree;

public class Main {
   static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
    }
    public static TreeNode convert(TreeNode tree){
        TreeNode head=tree;
        if (tree.left!=null) {
            TreeNode leftTree = convert(tree.left);
            TreeNode p=leftTree;
            while (p.right!=null){
                p=p.right;
            }
            p.right=tree;
            tree.left=p;
            head=leftTree ;
        }
        if (tree.right!=null){
            TreeNode rightTree=convert(tree.right);
            rightTree.left=tree;
            tree.right=rightTree;
        }
        return head;
    }

    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode();
        treeNode1.value=10;
        TreeNode treeNode2=new TreeNode();
        treeNode2.value=6;
        TreeNode treeNode3=new TreeNode();
        treeNode3.value=14;
        TreeNode treeNode4=new TreeNode();
        treeNode4.value=4;
        TreeNode treeNode5=new TreeNode();
        treeNode5.value=8;
        treeNode1.left=treeNode2;
        treeNode1.right=treeNode3;
        treeNode2.left=treeNode4;
        treeNode2.right=treeNode5;
        TreeNode head=convert(treeNode1);
        while (head!=null){
            System.out.println(head.value);
            head=head.right;
        }
    }
}
