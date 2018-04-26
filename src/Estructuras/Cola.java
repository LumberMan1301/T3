package Estructuras;

public class Cola<T> {
    private Nodo<T> first;
    private int capacidad;

    public Cola(){
        this.first = null;
        this.capacidad = 0;
    }

    public void enqueue(T dato){
        Nodo<T> nodo = new Nodo<T>(dato);
        if (capacidad == 0){
            this.first = nodo;
            first.setNext(null);
            capacidad++;
        }else{
            Nodo<T> current = first;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(nodo);
            current.getNext().setNext(null);
            capacidad++;
        }
    }

    public Nodo<T> peek() {
        return first;
    }

    public void dequeue(){
        this.first = this.first.getNext();
        capacidad--;
    }



    public int size(){
        return capacidad;
    }
}

