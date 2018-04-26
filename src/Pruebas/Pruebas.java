package Pruebas;

import BinarySearchTree.BinarySearchTree;


public class Pruebas {
    public static void main(String[] args) {
System.out.println("Primer Arbol");
        BinarySearchTree<Integer> bt = new BinarySearchTree<Integer>();
        bt.insert(4);
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(5);
        bt.diferencia();
        bt.remove(5);
        bt.diferencia();

        bt.imprimirEntreConNivel();
        System.out.println(" Inorder ");
        bt.printInorder();
        System.out.println(" ");
        System.out.println(" Postorder ");
        bt.printPostorder();
        System.out.println(" ");
        System.out.println(" Preorder ");
        bt.printPreorder();
        System.out.println("\n");

        System.out.println("Segundo Arbol");

        BinarySearchTree <Integer> bt2 = new BinarySearchTree<Integer>();
        bt2.insert(8);
        bt2.insert(12);
        bt2.insert(26);
        bt2.insert(33);
        bt2.insert(15);
        bt2.diferencia();
        bt2.remove(8);
        bt2.diferencia();

        System.out.println(" Inorder ");
        bt2.printInorder();
        System.out.println(" ");
        System.out.println(" Postorder ");
        bt2.printPostorder();
        System.out.println(" ");
        System.out.println(" Preorder ");
        bt2.printPreorder();
        System.out.println("\n");







    }

}
