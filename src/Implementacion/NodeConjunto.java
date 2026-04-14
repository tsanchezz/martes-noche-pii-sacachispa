package Implementacion;

public class NodeConjunto {

    private int data;
    private NodeConjunto next;

    public NodeConjunto(int data, NodeConjunto next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeConjunto getNext() {
        return next;
    }

    public void setNext(NodeConjunto next) {
        this.next = next;
    }
}
