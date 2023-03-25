
public class Main {
    /*
    Ejercicio 8 : numeros pares e impares.
    Realizar un programa que dado un determinado nro elegido al azar, permita saber si el mismo es par o impar.
    se debera mostrar un mensaje por pantalla indicando el resultado.
     */
    public static void main(String[] args) {

        Double numeroAleatorio = Math.random() * ( 10 - 1 );

        System.out.println("El numero aleatorio generado es: " + numeroAleatorio.intValue());

        if (numeroAleatorio.intValue() % 2 == 0){
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }
}