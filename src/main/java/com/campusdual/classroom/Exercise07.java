package com.campusdual.classroom;


public class Exercise07 {

    public static void main(String[] args) {

        System.out.println("La suma de los n primeros numeros es igual a:" + sumFirstNaturalNumbers(num));
        System.out.println("Los n primeros numeros son: " + showFirstNaturalNumbers(num));
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {

    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int i;
        int suma;
        for (i = 1; i < num; i++){
            suma += i;
        }
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        int i;
        int suma;
        for (i = 1; i < num; i++){
            System.out.println(i);
        }
    }

}
