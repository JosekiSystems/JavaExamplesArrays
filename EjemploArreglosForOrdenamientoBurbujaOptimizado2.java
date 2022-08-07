public class EjemploArreglosForOrdenamientoBurbujaOptimizado2 {
    public static void arregloInverso(String[] nombres2) {
        int count2 = nombres2.length;

        for (int i = 0; i < count2; i++) {
            String actual = nombres2[i];
            String inverso = nombres2[count2 - 1 - i];
            nombres2[i] = inverso;
            nombres2[count2 - 1 - i] = actual;
            count2--;
        }
    }

    public static void main(String[] args) {
        String[] nombres = {"roro", "bibi", "laik", "cat", "dog", "nina"};
        
        int count = nombres.length;
        int contador = 0;
        int[] numeros = new int[4];

        numeros[0] = 5;
        numeros[1] = Integer.valueOf("-6");
        numeros[2] = (int) 7L;
        numeros[3] = 8;

        System.out.println("----Usando el algoritmo Burbuja Optimizado para numeros------");
        // Empieza Algoritmo Burbuja 2
        for(int i =0; i< numeros.length; i++){
            for(int j =0; j < numeros.length-1-i; j++){
                if(((Comparable)numeros[j+1]).compareTo(numeros[j]) < 0 ){ // Al no difinir el entero con la como objeto, podemos hacer cast/auto boxing con Ingteger y Comparable<Integer>
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
                contador++;
            }

        } // Termina Algoritmo Burbuja 2
        for (int i = 0; i < numeros.length; i++){
            System.out.println("numeros = " + numeros[i]);
        }
        System.out.println("contador = " + contador);


        /*Arrays.sort(nombres);
        System.out.println("----Usando for para un cojunto inverso con Arrays------");
        for (int i = 0; i < count; i++) {
            System.out.println("nombre  " + i + ":" + nombres[i]);

        }
        */

        /* arregloInverso(nombres);
        System.out.println("----Usando for para un cojunto inverso con un metodo------");
        for (int i = 0; i < count; i++) {
            System.out.println("nombre  " + i + ":" + nombres[i]);
        }
        */
        //Collections.reverse(Arrays.asList(nombres));




        /*for (int i = 0; i < count; i++) {
            System.out.println("nombre  " + i + ":" + nombres[i]);
        }*/
    }
}

// En coment Arreglo inverso,tions.reverse, Collec Arrays sort y objeto Arreglo inverso contraido, nombres//

