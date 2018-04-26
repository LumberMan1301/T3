package Estructuras;

public class Cola<T> {
    private node<T> first;
    private int capacidad;

    public Cola(){
        this.first = null;
        this.capacidad = 0;
    }

    public void add(T dato){
        node<T> nodo = new node<T>(dato);
        if (capacidad == 0){
            this.first = nodo;
            first.setNext(null);
            capacidad++;
        }else{
            node<T> current = first;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(nodo);
            current.getNext().setNext(null);
            capacidad++;
        }
    }

    public node<T> getFirst() {
        return first;
    }

    public node<T> obtener(){
        node<T> current = first;
        if (capacidad == 0){
            return null;
        } else if(capacidad == 1){
            first = null;
            capacidad --;
            return current;
        } else{
            this.first = first.getNext();
            capacidad --;
            return current;
        }
    }
    public void clear(){
        this.first = null;
        capacidad = 0;
    }

    public boolean isEmpty(){
        if (capacidad==0){
            return true;
        }else{
            return false;
        }
    }


    public int size(){
        return capacidad;
    }
}

