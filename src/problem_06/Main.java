package problem_06;

import sun.reflect.generics.tree.Tree;

public class Main {
    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
    }
    TreeNode root;
    public void buildTree(int[] preOrder,int[] inOrder){
        root=buildTree(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
    }
    private TreeNode buildTree(int[] preOrder, int[] inOrder, int i, int j,int m,int n){
        if (i>j)
            return null;
        TreeNode node=new TreeNode();
        node.value=preOrder[i];
        int split=-1;
        for (int p=m;p<=n;p++){
            if (inOrder[p]==preOrder[i]){
                split=p;
                break;
            }
        }
        node.left=buildTree(preOrder,inOrder,i+1,i+split-m,m,split-1);
        node.right=buildTree(preOrder,inOrder,i+split-m+1,j,split+1,n);
        return node;
    }
    public void postOrder(TreeNode root){
        if (root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }
    public void preOrder(TreeNode root){
        if (root==null)
            return;
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void main(String[] args) {
        Main m=new Main();
        m.buildTree(new int[]{1,2,4,7,3,5,6,8},new int[]{4,7,2,1,5,3,8,6});
        m.postOrder(m.root);
        m.preOrder(m.root);
    }
}
