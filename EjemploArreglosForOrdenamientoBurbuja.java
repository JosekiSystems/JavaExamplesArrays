import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {
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

        // Empieza Algoritmo Burbuja
        for(int i =0; i< count; i++){
            for(int j =0; j<count; j++){
                if(nombres[i].compareTo(nombres[j]) < 0 ){
                    String auxiliar = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = auxiliar;
                }
                contador++;
            }
        }
        // Termina Algoritmo Burbuja

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

        System.out.println("----Usando el algoritmo Burbuja ------");
        System.out.println("contador = " + contador);
        for (int i = 0; i < count; i++) {
            System.out.println("nombre  " + i + ":" + nombres[i]);
        }
    }
}

// En coment Arreglo inverso,tions.reverse, Collec Arrays sort y objeto Arreglo inverso contraido//

