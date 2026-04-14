package Implementacion;

public class NodePila {

    private int data;
    private NodePila next;

    public NodePila(int data, NodePila next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodePila getNext() {
        return next;
    }

    public void setNext(NodePila next) {
        this.next = next;
    }
}