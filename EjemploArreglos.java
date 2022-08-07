import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        
        int[] numeros = new int[4];
        String[] productos = new String[7];



       numeros[0] = 5;
       numeros[1] = Integer.valueOf("-6");
       numeros[2] = (int) 7L;
       numeros[3] = 8;

       productos[0] = "cigarros";
       productos[1] = "walkman";
       productos[2] = "encendedor";
       productos[3] = "pintura";
       productos[4] = "mesa";
       productos[5] = "lapiz";
       productos[6] = "automovil";

        Arrays.sort(numeros);
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length -1];

        //String prod1 = productos[0];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        Arrays.sort(productos);

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);


        
        
    }
}
