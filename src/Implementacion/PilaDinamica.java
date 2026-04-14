package Implementacion;

import Interfaces.PilaTDA;

public class PilaDinamica implements PilaTDA {

    private NodePila tope; // apunta al nodo que está en el tope de la pila

    @Override
    public void InicializarPila() {
        tope = null;
    }

    @Override
    public void Apilar(int x) {
        // El nuevo nodo apunta al tope actual, y pasa a ser el nuevo tope.
        // Esto respeta LIFO: el último en entrar es el primero en salir.
        NodePila NodePila = new NodePila(x, tope);
        tope = NodePila;
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            // Avanzamos tope al siguiente nodo, descartando el nodo actual.
            tope = tope.getNext();
        }
    }

    @Override
    public int Tope() {
        return tope.getData();
    }

    @Override
    public boolean PilaVacia() {
        return tope == null;
    }
}