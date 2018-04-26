package BinarySearchTree;


import Estructuras.Cola;
import Estructuras.Lista;

/**
 * Clase del Arbol Binario de Busqueda
 * @param <T>
 */
public class BinarySearchTree<T extends Comparable<T>> {
    private TreeNode<T> root;

    //----------------------------------------------------//

    /**
     * Constructor de la clase Arbol Binario
     * Se crea vacio, puesto que despues se le van a agregar nodos
     */
    public BinarySearchTree() {
        this.root = null;
    }

    //----------------------------------------------------//

    /**
     * metodo que retorna la raiz del arbol
     * @return raiz
     */
    public TreeNode<T> getRoot() {
        return this.root;
    }


    //----------------------------------------------------//

    /**
     * metodo para verificar que el dato existe
     * @param data
     * @return
     */
    public boolean contains(T data) {
        return contains(data, this.root);
    }

    /**
     * metodo recursivo para recorrer el arbol
     * @param element
     * @param node
     * @return
     */
    private boolean contains(T element, TreeNode<T> node) {
        if (node == null) {
            return false;
        }
        if (node.getData().compareTo(element) == 0) {
            return true;
        }
        if (node.getData().compareTo(element) > 0) {
            return contains(element, node.getLeft());
        }
        if (node.getData().compareTo(element) < 0) {
            return contains(element, node.getRight());
        }
        return false;
    }

//----------------------------------------------------//

    /**
     * metodo para Insertar un Nodo al arbol
     * @param data
     */
    public void insert(T data) {
        TreeNode<T> nodeAux = new TreeNode(data);
        if (this.root == null) {
            this.root = nodeAux;
        } else {
            this.root = insert(nodeAux, this.root);
        }
    }

    private TreeNode<T> insert(TreeNode<T> NodeAux, TreeNode<T> aux) {
        TreeNode<T> nodeAUX = aux;
        if (NodeAux.getData().compareTo(aux.getData()) < 0) {
            if (aux.getLeft() == null) {
                aux.setLeft(NodeAux);
            } else {
                aux.setLeft(insert(NodeAux, aux.getLeft()));
            }
        } else if (NodeAux.getData().compareTo(aux.getData()) > 0) {
            if (aux.getRight() == null) {
                aux.setRight(NodeAux);
            } else {
                aux.setRight(insert(NodeAux, aux.getRight()));
            }
        } else {
            System.out.println("Nodo duplicado");
        }
        return nodeAUX;
    }

    //----------------------------------------------------//

    /**
     * metodo para remover un nodo de un arbol
      * @param element
     */
    public void remove(T element) {
        this.root = remove(element, this.root);
    }

    private TreeNode<T> remove(T element, TreeNode<T> node) {
        if (node == null) {
            return null;
        }
        if (node.getData().compareTo(element) < 0) {
            node.setRight(remove(element, node.getRight()));
        } else if (node.getData().compareTo(element) > 0) {
            node.setLeft(remove(element, node.getLeft()));
        } else if (node.getLeft() == null) {
            node = node.getRight();
        } else if (node.getRight() == null) {
            node = node.getLeft();
        }
        return node;
    }

    //----------------------------------------------------//

    /**
     * metodo para retornar el valor minino de un arbol
     * @return Nodo menor
     */
    public TreeNode findMin() {
        if (this.getRoot() == null)
            return null;
        else
            return findMin(this.root);

    }

    /**
     * metodo recursivo para recorrer el arbol
     * @param node
     * @return
     */
    private TreeNode findMin(TreeNode node) {
        if (node.getLeft() != null) {
            return findMin(node.getLeft());
        } else {
            return node;

        }
    }

    //----------------------------------------------------//
    /**
     * metodo para retornar el valor minino de un arbol
     * @return Nodo Mayor
     */
    public TreeNode findMax() {
        if (this.getRoot() == null)
            return null;
        else
            return findMax(this.root);

    }

    /**
     * metodo recursivo para recorrer el arbol
     * @param node
     * @return
     */
    private TreeNode<T> findMax(TreeNode<T> node) {
        if (node.getRight() != null) {
            return findMax(node.getRight());
        } else {
            return node;

        }
    }
    public void diferencia() {
        int x = (int)this.findMax().getData();
        int y = (int)this.findMin().getData();
        System.out.println("La diferencia entre el nodo mayor "+ x + " y el nodo menor "+ y + " es: " + (x-y));
    }
//####################################################################
    //----------------------------------------------------//
    public void printPostorder(){
        printPostorder(this.root);
    }
    public void printInorder(){
        printInorder(this.root);
    }
    public void printPreorder()   {     printPreorder(root);  }
//#####################################################################

    private void printPostorder(TreeNode node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.getLeft());

        // then recur on right subtree
        printPostorder(node.getRight());

        // now deal with the node
        System.out.print(node.getData() + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    private void printInorder(TreeNode node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.getLeft());

        /* then print the data of node */
        System.out.print(node.getData() + " ");

        /* now recur on right child */
        printInorder(node.getRight());
    }

    /* Given a binary tree, print its nodes in preorder*/
    private void printPreorder(TreeNode node)
    {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.getData() + " ");

        /* then recur on left sutree */
        printPreorder(node.getLeft());

        /* now recur on right subtree */
        printPreorder(node.getRight());
    }
    //#####################################
    public void imprimirEntreConNivel(){
        imprimirEntreConNivel(this.root, 0);
    }

    private void imprimirEntreConNivel(TreeNode tmp, int nivel){

        if(tmp !=null){
            imprimirEntreConNivel(tmp.getLeft(),nivel+1);

            System.out.println(tmp.getData() + "("+nivel+") - ");
            imprimirEntreConNivel(tmp.getRight(),nivel+1);
        }
    }



}
