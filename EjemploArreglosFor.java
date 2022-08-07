import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int count = productos.length;

       productos[0] = "cigarros";
       productos[1] = "walkman";
       productos[2] = "encendedor";
       productos[3] = "pintura";
       productos[4] = "mesa";
       productos[5] = "lapiz";
       productos[6] = "automovil";

       Arrays.sort(productos);
        System.out.println("----Usando for------");
        for(int i = 0; i< count; i++){
            System.out.println("para indice  " + i + ":" + productos[i]);
        }
        System.out.println("----Usando for each------");
        for(String prod: productos){
            System.out.println("prod = " + prod);
        }
        System.out.println("----Usando  while------");
        int i = 0;
        while(i < count){
            System.out.println("para indice  " + i + ":" + productos[i]);
            i++;
        }
        System.out.println("----Usando do while------");
        int k = 0;
        do{
            System.out.println("para indice  " + k + ":" + productos[k]);
            k++;
        }while(k < count);

        int[] numeros = new int[10];

        int totalnumeros = numeros.length;
        for(int l = 0; l < totalnumeros; l++){
           numeros[l] = l*3;
        }

        for(int l = 0; l < totalnumeros; l++){
            System.out.println("numeros = " + numeros[l]);
        }



    }
}
