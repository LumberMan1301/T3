package Estructuras;

public class Nodo <T>{
    private Nodo<T> next;
    private T data;
    private Nodo<T> prev;

    public Nodo (T dato){
        this.data = dato;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }

    public Nodo<T> getPrev() {
        return prev;
    }

    public void setPrev(Nodo<T> prev) {
        this.prev = prev;
    }

}
