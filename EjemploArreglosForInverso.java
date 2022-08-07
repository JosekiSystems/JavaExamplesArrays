import java.util.Arrays;

public class EjemploArreglosForInverso {
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
        for (int i = 0; i < count; i++) {
            System.out.println("para indice  " + i + ":" + productos[i]);
        }
        System.out.println("----Usando for Inverso------");
        for (int i = 0; i < count; i++) {
            System.out.println("para i = " + (count - 1 - i) + " : " + productos[count - 1 - i]);

        }
        System.out.println("----Usando for Inverso2------");
        for (int i = count - 1; i >= 0; i--) {
            System.out.println("para i  = " + i + " : " + productos[i]);
        }
        String[] nombres = {"roro", "bibi", "laik"};
        int totalnom = nombres.length;
        Arrays.sort(nombres);
        System.out.println("----Usando for para un cojunto------");
        for (int i = 0; i < totalnom; i++) {
            System.out.println("nombre  " + i + ":" + nombres[i]);


        }
    }
}
