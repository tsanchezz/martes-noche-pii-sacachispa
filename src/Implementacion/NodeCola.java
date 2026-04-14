
package Implementacion;

public class NodeCola {

    private int data;
    private NodeCola next;

    public NodeCola(int data, NodeCola next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeCola getNext() {
        return next;
    }

    public void setNext(NodeCola next) {
        this.next = next;
    }
}