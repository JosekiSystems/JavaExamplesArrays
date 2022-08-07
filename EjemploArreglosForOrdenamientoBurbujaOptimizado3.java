public class EjemploArreglosForOrdenamientoBurbujaOptimizado3 {
    public static void sortBurbuja(Object[] arreglo) {
        int contador = 0;

        // Empieza Algoritmo Burbuja 3
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) { // Al no difinir el entero con la como objeto, podemos hacer cast/auto boxing con Ingteger y Comparable<Integer>
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                contador++;
            }

        } // Termina Algoritmo Burbuja 3
        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {

            Integer[] numeros = new Integer[4];

            numeros[0] = 5;
            numeros[1] = Integer.valueOf("-6");
            numeros[2] = (int) 7L;
            numeros[3] = 8;

            System.out.println("----Usando el algoritmo Burbuja3------");
            sortBurbuja(numeros);
            for (int k = 0; k < numeros.length; k++) {
                System.out.println("numeros = " + numeros[k]);
            }


        }
    }

// En coment Arreglo inverso,tions.reverse, Collec Arrays sort y objeto Arreglo inverso contraido, nombres//

