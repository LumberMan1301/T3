package Estructuras;

public class Lista<T> {
    private Nodo<T> head;
    private int capacidad;

    public Lista() {
        this.head = null;
        this.capacidad = 0;
    }

    public void add(T data) {
        if (capacidad == 0) {
            Nodo<T> aux = new Nodo<T>(data);
            this.head = aux;
            head.setNext(null);
            capacidad++;
        } else {
            Nodo<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            Nodo<T> aux = new Nodo<T>(data);
            aux.setNext(null);
            current.setNext(aux);
            capacidad++;
        }
    }


    public void remove(int posicion) {
        int pos_aux = posicion;
        Nodo<T> current = head;
        if (pos_aux == 0) {
            this.head = current.getNext();
            capacidad--;
        } else if (pos_aux == capacidad) {
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            current.setNext(null);
            capacidad--;
        } else {
            int b=0;
            while (pos_aux-1 != b) {
                current = current.getNext();
                b++;
            }
            current.setNext(current.getNext().getNext());
            capacidad--;
        }
    }

    public void delete(T dato) {
        int pos_aux = 0;
        Nodo<T> current = head;
        if (current.getData() == dato) {
            remove(pos_aux);
        } else {
            current = current.getNext();
            pos_aux++;
            while (current.getData() != dato) {
                current = current.getNext();
                pos_aux++;
            }
            remove(pos_aux);
        }
    }

    public T get(int i){
        Nodo<T> aux = this.getHead();
        int x = 0;
        while(x != i){
            aux = aux.getNext();
            x++;
        }
        return aux.getData();
    }
    public Nodo<T> getHead() {
        return head;
    }

    public void setHead(Nodo<T> head) {
        this.head = head;
    }

    public void clear(){
        this.head=head;
        capacidad=0;
    }


    public int size() {
        return capacidad;
    }

    public T find(T dato) {
        Nodo<T> aux = head;
        int contador = 0;
        while (dato != aux.getData()) {
            aux = aux.getNext();
        }
        return aux.getData();
    }


    public boolean isEmpty() {
        if (capacidad==0){
            return true;
        }else{
            return false;
        }
    }


}

