package Ejercicios14Abril.Pila;

public class NodePila {

    private String data;
    private NodePila next;

    public NodePila(String data, NodePila next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NodePila getNext() {
        return next;
    }

    public void setNext(NodePila next) {
        this.next = next;
    }
}