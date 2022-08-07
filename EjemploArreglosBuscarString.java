import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {

        String[] a = new String[3];

        Scanner s = new Scanner(System.in);

        for( int i = 0; i< a.length; i++){
            System.out.println("Ingrese un nombre : ");
            a[i] = s.next();
        }

        System.out.println("\r\n Ingrese el nomnbre que quiere buscar: ");
        String nombre = s.next();

        int i = 0;
        while (i < a.length && !a[i].equalsIgnoreCase(nombre)){
            i++;
        }
        if(i== a.length){
            System.out.println("Nombre no encontrado");
        }else if(a[i].equalsIgnoreCase(nombre)){
            System.out.println("Encontrado en la casilla = " + i);
        }
    }
}
