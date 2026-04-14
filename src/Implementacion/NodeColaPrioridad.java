package Implementacion;

public class NodeColaPrioridad {

    private int dato;
    private int prioridad;
    private NodeColaPrioridad next;

    public NodeColaPrioridad(int dato, int prioridad, NodeColaPrioridad next) {
        this.dato = dato;
        this.prioridad = prioridad;
        this.next = next;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public NodeColaPrioridad getNext() {
        return next;
    }

    public void setNext(NodeColaPrioridad next) {
        this.next = next;
    }
}
