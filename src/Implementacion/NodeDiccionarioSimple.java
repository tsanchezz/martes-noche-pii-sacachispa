package Implementacion;

public class NodeDiccionarioSimple {

    private int clave;
    private int valor;
    private NodeDiccionarioSimple next;

    public NodeDiccionarioSimple(int clave, int valor, NodeDiccionarioSimple next) {
        this.clave = clave;
        this.valor = valor;
        this.next = next;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodeDiccionarioSimple getNext() {
        return next;
    }

    public void setNext(NodeDiccionarioSimple next) {
        this.next = next;
    }
}
