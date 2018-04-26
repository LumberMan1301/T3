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

        BinarySearchTree <Integer> bt2 = new BinarySearchTree<Integer>();
        bt2.insert(8);
        bt2.insert(12);
        bt2.insert(26);
        bt2.insert(33);
        bt2.insert(15);

        bt2.printPreorder();
        System.out.println(" ");

        System.out.println(bt.findMin().getData()+"\n");
        System.out.println(bt.findMax().getData()+"\n");

        bt.printInorder();
        System.out.println(" ");
        bt.printPostorder();
        System.out.println(" ");
        bt.printPreorder();
        System.out.println(" ");

        mezclaArboles(bt,bt2 );


    }
    public static void mezclaArboles(BinarySearchTree tree1, BinarySearchTree tree2){

        Lista lt = new Lista();
        BinarySearchTree<Integer> bTotal = new BinarySearchTree<Integer>();

        for(int i = 0; i<lt.size();i++){
            System.out.print(lt.get(i)+",");
            bTotal.insert((Integer) lt.get(i));
        }
        System.out.print("\n");
        bTotal.printPreorder();


    }
}
