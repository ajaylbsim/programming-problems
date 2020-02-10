package com.tree;

public class ISBST {

    public static void main(String[] args) {
        System.out.println("Hellow is BST");
        TreeUtil.disPlayTree(TreeUtil.getTree2());


        System.out.println("Is BST -> "+isBST(TreeUtil.getTree()));
    }

    private static Boolean isBST(Node  node)
    {
        if (node == null)
            return true;

        /* false if left is > than node */
        if (node.getLeft() != null && node.getLeft().getData() > node.getData())
            return false;

        /* false if right is < than node */
        if (node.getRight() != null && node.getRight().getData() < node.getData())
            return false;

        /* false if, recursively, the left or right is not a BST */
        if (!isBST(node.getLeft()) || !isBST(node.getRight()))
            return false;

        /* passing all that, it's a BST */
        return true;
    }


}
