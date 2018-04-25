package Pruebas;

import BinarySearchTree.BinarySearchTree;

public class Pruebas {
    public static void main(String[] args) {

        BinarySearchTree<Integer> bt = new BinarySearchTree<Integer>();
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);
        bt.insert(5);
        bt.print();
        System.out.println("x");
        bt.remove(2);
        bt.print();
        System.out.println(bt.findMin());
        System.out.println(bt.findMax());

    }
}
