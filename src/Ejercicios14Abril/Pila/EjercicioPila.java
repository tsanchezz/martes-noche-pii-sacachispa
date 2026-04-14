package Ejercicios14Abril.Pila;

public class EjercicioPila {
    public static void main(String[] args) {
        // El botón "Atrás" del Chrome. Si visitás fi.uba.ar, después campus.utn.edu.ar y por último stackoverflow.com.
        // Consigna: Identificá qué se apila en cada paso y qué sucede (qué se desapila) cuando el usuario aprieta la flechita de "Atrás"

        PilaTDA pila = new PilaDinamica();

        // Navegar hasta la ultima pagina.
        pila.Apilar("fi.uba.ar");
        pila.Apilar("campus.utn.edu.ar");
        pila.Apilar("stackoverflow.com");

        System.out.println("Pagina actual = " + pila.Tope()); // Stack
        System.out.println("Presionar atras <-");
        pila.Desapilar();

        System.out.println("----------------------------");

        System.out.println("Pagina actual = " + pila.Tope()); // Utn
        System.out.println("Presionar atras <-");
        pila.Desapilar();

        System.out.println("----------------------------");

        System.out.println("Pagina actual = " + pila.Tope()); // Uba
    }
}
