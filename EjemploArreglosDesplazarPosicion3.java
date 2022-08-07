import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {

        int[] a = new int[7];
        int numero, posicion;

        Scanner s = new Scanner(System.in);

        for(int i = 0; i<a.length-1; i++){
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.println(" Ingrese un numero para insertar en el arreglo");
        numero = s.nextInt();

        posicion = 0;
        while (posicion < 6 && numero > a[posicion]){
            posicion++;
        }

        for(int i = a.length-2; i >=posicion; i--){
            a[i+1] = a[i];
        }
        a[posicion]= numero;
        System.out.println("El nuevo arreglo ordenado es: ");
        for(int i = 0; i < a.length; i++){
            System.out.println(i + " => " + a[i]);
        }
    }
}
// El arreglo tiene un espacio libre del en el cual se inserta el valor agregado por el usuario conservado el buen orden.