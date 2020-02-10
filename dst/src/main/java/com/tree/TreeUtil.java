package com.tree;

public class TreeUtil {

    public static Node  getTree() {
        Node start = new Node();
        start.setData(5);
        start.setLeft(new Node());
        start.setRight(new Node());
        start.getLeft().setData(4);
        start.getRight().setData(6);


        start.getLeft().setLeft(new Node());
        start.getRight().setRight(new Node());
        start.getLeft().getLeft().setData(3);
        start.getRight().getRight().setData(9);
        return start;
    }



    public static Node  getTree2() {
        Node start = new Node();
        start.setData(1);
        start.setLeft(new Node());
        start.setRight(new Node());
        start.getLeft().setData(2);
        start.getRight().setData(3);


        start.getLeft().setLeft(new Node());
        start.getLeft().setRight(new Node());
        start.getLeft().getLeft().setData(4);
        start.getLeft().getRight().setData(5);
        return start;
    }


    public static void   disPlayTree( Node start) {
        Node temp = start;
        print(temp);
    }


    public static void print(Node t){
        if(t==null) return;

        print(t.getLeft());
        System.out.print(t.getData() +" ");
        print(t.getRight());

    }
}
