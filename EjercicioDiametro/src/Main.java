import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        /*
        EJERCICIO I: Radio.
        Calcular el radio de un circulo de diametro N, donde el diametro sera determinada
        por el usuario. Nota: no es necesario el ingreso por teclado, puede ser un valor elegido por uds.
        Formula -> R = D/2, siendo R = radio y D = diametro
         */
        imprimirBannerEjercicio(1);

        int diametro = 10;
        int radio = diametro / 2;

        System.out.println("El radio del circulo es igual a " + radio);

        /*
        EJERCICIO II: Area.
        Calcular el area de un cuadrado de ancho N y largo M, donde N y M seran definidos a eleccion.
        Formula -> A = N * M , siendo A = Area, N ancho y M largo.
        */
        imprimirBannerEjercicio(2);

        int anchoCuadrado = 12;
        int largoCuadrado = 20;
        int areaCuadrado = anchoCuadrado * largoCuadrado;

        System.out.println("El area del cuadrado es: " + areaCuadrado);

        /*
        EJERICIO III: Conversor cripto (Ars -> BTC)
        Sabiendo que el precio del bitcoin hoy 13/2/2023 es de 4.184.238,12, hacer un conversor
        que me permita determinar la cantidad de bitcoins que puedo comprar con X cantidad de pesos Arg.
        Siendo X un valor elegido por el usuario.
         */
        imprimirBannerEjercicio(3);

        BigDecimal importePesos = new BigDecimal("1500.35");
        BigDecimal importeBitcoin = new BigDecimal("4184238.12");
        BigDecimal importeConvertido = importePesos.divide(importeBitcoin, 6, RoundingMode.HALF_UP);
        System.out.println("Se pueden comprar " + importeConvertido + " Bitcoins.");

        /*
        EJERCICIO IV: Mayoria de Edad.
        Realizar un programa donde se determine una persona es mayor de edad o no.
        Se debe tener en cuenta que se considera mayor de edad si la edad es mayor o igual a 18 años.
        la edad debe ser elegida por el usuario, y debera mostrar un mensaje indicado “Es mayor de edad”
        o caso contrario, “Es menor de edad”
        */
        imprimirBannerEjercicio(4);

        int edadUsuario = 11;
        calcularMayorDeEdad(edadUsuario);
        edadUsuario = 18;
        calcularMayorDeEdad(edadUsuario);

       /*
       EJERCICIO V: Etapas.
       Modificar el ejercicio 4 para que ahora, podamos determinar en que etapa esta una persona en base a la edad suministrada.
       Etapas :
       bebe <= 2 años
       niño > 2 y <=8
       pre adolescente >9 y <=13
       adolescente > 13 y <18\ \ adulto >= 18 y <60\ \ vejez >= 60 años.
       realizarlo con una estructura IF, y considerar valores negativos.
       En cada caso se debera mostrar el mensaje indicando a que etapa pertenece
       */
        imprimirBannerEjercicio(5);

        int edadPersona;
        edadPersona = 11;
        calcularEdad(edadPersona);

        /*
        EJERCICIO VI:  divisor
        Realizar un programa que dado 2 numeros permita realizar la division, muestre el resultado y el resto.
        El programa debera realizar un verificacion de los numeros ingresados, donde si nro1 es menor a nro2,
        se deberan intercambiar sus valores, además se debe tener en cuenta que no se permite el valor 0, por lo tanto,
        se debera controlar sin hacer uso de excepciones.
        si se ingresa el valor 0 en cualquiera de los 2 numeros, se debera mostrar un mensaje indicando que el valor
        de nro1 o nro2 no es valido.
         */
        imprimirBannerEjercicio(6);

        int nro1 = 2;
        int nro2 = 10;

        try {
           //Para empezar, tomamos el caso mas general y lo pasamos como condicion en un metodo if.
            if (nro1 == 0 || nro2 == 0) {
                System.out.println("El valor ingresado no es valido. No se admiten ceros.");

            //Luego tenemos este caso particular, en el que si le
            } else if (nro1<nro2) {
                int temp = nro1;
                nro1 = nro2;
                nro2 = temp;
                System.out.println("Se han intercambiado los valores.");
            }
            int resultadoDivision = (nro1 / nro2);
            int restoDivision = (nro1 % nro2);
            System.out.println("El resultado de la division es: " + resultadoDivision);
            System.out.println("El resto de la division es de: " + restoDivision);
        } catch (ArithmeticException e) {
            System.out.println("Ocurrió un error inesperado durante el cálculo.");
        }
    }


    //METODOS DEL EJERCICIO IV
    private static void calcularMayorDeEdad(int edadUsuario) {

        if (edadUsuario < 18) {
            System.out.println(
                    "Es menor de edad"
            );
        } else {
            System.out.println(
                    "Es mayor de edad"
            );
        }
    }

    //METODOS DEL EJERCICIO 5
    private static void calcularEdad(int edadPersona) {
        if (edadPersona <= 2) {
            System.out.println("La persona es un bebe.");
        } else if ( edadPersona <= 8) {
            System.out.println("La persona es un/a ninio/a");
        } else if ( edadPersona > 9 && edadPersona <= 13) {
            System.out.println("La persona es un/a pre adolescente.");
        } else if ( edadPersona > 13 && edadPersona < 18){
            System.out.println("La persona es un/a adolescente.");
        } else if ( edadPersona >= 18 && edadPersona < 60){
            System.out.println("La persona es un adulto/a.");
        } else if ( edadPersona >= 60 ) {
            System.out.println("La persona es un anciano/a.");
        } else {
            System.out.println("Los datos ingresados son incorrectos.");
        }
    }

    private static void imprimirBannerEjercicio(int numeroDeEjercicio) {
        System.out.println("");
        System.out.println("-------------- EJERCICIO " + numeroDeEjercicio + " --------------" );
    }


}





