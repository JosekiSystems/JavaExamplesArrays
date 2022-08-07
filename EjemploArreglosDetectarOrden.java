import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {

        int[] a = new int[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros con un espacio entre cada uno");
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }
        boolean ascendente = false;
        boolean descendente = false;
        for(int i = 0; i< a.length-1;i++){

          if(a[i] > a[i+1]) {
           descendente = true;
          }
          if (a[i] < a[i+1]){
              ascendente = true;
          }
        }
        if(ascendente == true && descendente == true){
            System.out.println("El arreglo no tiene buen orden");
        }
        if(ascendente == false && descendente == false){
            System.out.println("El arreglo es constante");
        }
        if (ascendente== true && descendente == false) {
            System.out.println("El arreglo es ascendente");
        }
        if( ascendente == false && descendente == true){
            System.out.println("El arreglo s descendente");
        }
    }
}

