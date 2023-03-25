public class Main {
    /*
    Ejercicio 9 - Arreglos
Se solicita crear un programa que verifique si 2 arreglos son inversamente iguales,
para esto se debe tener en cuenta lo siguiente:
* arr1 = [0,1,2,3,4,5,6,7,8,9] y arr2 = [9,8,7,6,5,4,3,2,1,0] , estos son los 2 arreglos a modo ilustrativo.
el programa debera iterar usando un bucle for y debera comprobar que ambos arreglos sean inversamente iguales,
es decir el primer elemento de arr1 coincide con el ultimo de arr2, y asi sucesivamente por todos los elementos,
si se cumple la igualdad se debe mostrar que ambos son inversamente iguales, caso contrario, no son inversamente iguales.
     */
    public static void main(String[] args) {
        //crear dos arreglos inversos

        int[] array1 = new int[] {0,1,2,3,4,5,6,7,8,9};
        int[] array2 = new int[] {9,8,7,6,5,4,3,2,1,0};
        sonIguales(array1, array2);

        if (array1 == null || array2 == null) {
            throw new Exception("array1 & array2 are required");
       
        } else if (array1.length != array2.length) {
            return false;
        }
        int length = array1.length;
        for (int i = 0; i < length; i++) {
            if (array1[i] != array2[length - i - 1]) {
                return false;
            }
        }
        return true;
    }





    //dos for anidados,
    }
}