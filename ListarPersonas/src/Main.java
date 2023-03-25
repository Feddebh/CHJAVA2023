import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        // Creamos una lista de personas:

        List<Persona> listarPersonas = new ArrayList<>();


        //Creamos 5 objetos persona pasándoles como condicion nombre y apellido:

        Persona persona1 = new Persona("Lionel", "Messi");

        Persona persona2 = new Persona("Paulo", "Dybala");

        Persona persona3 = new Persona("Alexis", "Mac Allister");

        Persona persona4 = new Persona("Julian", "Alvarez");

        Persona persona5 = new Persona("Enzo", "Fernandez");


        // Utilizando el método .add de Java, le pasamos como parametro los objetos creados previamente para añadirlos a
        // la lista (sin tener en cuenta su ordenamiento). Este método nos permite agregar un elemento al final de la
        // ArrayList en caso de que no le especifiquemos un índice.

        listarPersonas.add(persona1);
        listarPersonas.add(persona2);
        listarPersonas.add(persona3);
        listarPersonas.add(persona4);
        listarPersonas.add(persona5);

        imprimirBannerLista(1); // Separador


        // ORDENAR POR NOMBRE:

        // Utilizamos el método .sort() para ordenar la lista, el cual en este caso recibe como argumento
        // el método .comparing() de la interfaz Comparator para crear un comparador basado en el atributo nombre
        // de cada objeto Persona.

        listarPersonas.sort(Comparator.comparing(Persona::getNombre));

        // Luego de ordenar la lista alfabéticamente por nombre, hacemos uso del metodo
        // .forEach() en conjunto con una expresion lambda para iterar sobre cada objeto persona en la lista e imprimir
        // sus nombres y apellidos por consola (accediendo a dichos atributos mediante sus respectivos getters).

        System.out.println("LISTA ORDENADA ALFABÉTICAMENTE POR NOMBRES:");
        listarPersonas.forEach(persona -> System.out.println(persona.getNombre() + " " + persona.getApellido()));

        imprimirBannerLista(2); // Separador


        // ORDENAR POR APELLIDO:

        // Utilizamos nuevamente el método .sort() para ordenar la lista, el cual recibe como argumento el método
        // .comparing() de la interfaz Comparator para crear un comparador, esta vez, basado en el atributo apellido
        // de cada objeto Persona dentro de la lista.

        listarPersonas.sort(Comparator.comparing(Persona::getApellido));

        //Luego de ordenar la lista alfabéticamente por apellido, hacemos uso del metodo .forEach() en conjunto con una
        // expresion lambda para iterar sobre cada objeto persona en la lista e imprimir sus nombres y apellidos
        // ordenados esta vez alfabéticamente por apellido.

        System.out.println("LISTA ORDENADA ALFABÉTICAMENTE POR APELLIDOS:");
        listarPersonas.forEach(persona -> System.out.println(persona.getNombre() + " " + persona.getApellido()));

        imprimirBannerLista(3); //Separador


        // ORDENAR POR APELLIDO INVERSO:

        // Utilizamos la misma logica anterior, pero esta vez haciendo uso del metodo .reversed() de la
        // interfaz comparator, el cual nos ordenara la lista por apellidos en sentido alfabéticamente inverso.

        listarPersonas.sort(Comparator.comparing(Persona::getApellido).reversed());

        // Luego de ordenar la lista, hacemos uso del metodo .forEach() en conjunto con una expresion lambda para iterar
        // sobre cada objeto persona en la lista e imprimir sus apellidos y nombres, ordenados en este caso en sentido
        // alfabéticamente inverso.

        System.out.println("LISTA ORDENADA POR APELLIDOS ALFABÉTICAMENTE INVERSOS:");
        listarPersonas.forEach(persona -> System.out.println(persona.getApellido() + ", " + persona.getNombre()));
    }

    // Creamos un metodo para separar cada lista con banners.
    private static void imprimirBannerLista(int numeroDeLista) {
        System.out.println(" ");
        System.out.println("-------------- LISTA NRO: " + numeroDeLista + " --------------" );
    }

}