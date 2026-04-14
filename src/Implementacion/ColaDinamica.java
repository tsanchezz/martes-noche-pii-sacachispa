package Implementacion;

import Interface.ColaTDA;

public class ColaDinamica implements ColaTDA {

    private NodeCola frente; // apunta al primer nodo de la cola (el que se despacola primero)
    private NodeCola fondo;  // apunta al último nodo de la cola (donde se acola)

    @Override
    public void InicializarCola() {
        frente = null;
        fondo = null;
    }

    @Override
    public void Acolar(int x) {
        // El nuevo nodo se inserta al final (fondo).
      NodeCola NodeCola = new NodeCola(x, null);
        if (ColaVacia()) {
            frente = NodeCola;
        } else {
            fondo.setNext(NodeCola);
        }
        fondo = NodeCola;
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
            // Avanzamos frente al siguiente nodo, descartando el nodo actual.
            frente = frente.getNext();
            if (frente == null) {
                fondo = null;
            }
        }
    }

    @Override
    public int Primero() {
        return frente.getData();
    }

    @Override
    public boolean ColaVacia() {
        return frente == null;
    }
}