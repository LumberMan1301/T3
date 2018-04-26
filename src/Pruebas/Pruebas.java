package Pruebas;

import BinarySearchTree.BinarySearchTree;
import Estructuras.Lista;

public class Pruebas {
    public static void main(String[] args) {

        BinarySearchTree<Integer> bt = new BinarySearchTree<Integer>();
        bt.insert(4);
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(5);



        System.out.println(bt.findMin());
        System.out.println(bt.findMax());

        bt.printInorder();
        System.out.println(" ");
        bt.printPostorder();
        System.out.println(" ");
        bt.printPreorder();
        System.out.println(" ");


    }
    public void mezclaArboles(BinarySearchTree tree1, BinarySearchTree tree2){
        Lista l1 = new Lista();
        Lista l2 = new Lista();

    }
}
