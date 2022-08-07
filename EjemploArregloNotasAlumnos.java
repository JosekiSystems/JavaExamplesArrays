import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] cM, cH, cL;
        cM = new double[7];
        cH = new double[7];
        cL = new double[7];

        double scM=0, scH=0, scL=0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 notas para Matemáticas = ");
        for (int i = 0; i< cM.length;i++) {
            cM[i] = s.nextDouble();
        }
        System.out.println("Ingrese 7 notas para Historia = ");
        for (int i = 0; i< cH.length;i++) {
            cH[i] = s.nextDouble();
        }
        System.out.println("Ingrese 7 notas para Lengua = ");
        for (int i = 0; i< cL.length;i++) {
            cL[i] = s.nextDouble();
        }
        for(int i = 0; i<7; i++){
            scM +=cM[i];
            scH +=cH[i];
            scL +=cL[i];
        }
        double pM = (scM/cM.length);
        double pH = (scH/cH.length);
        double pL = (scL/cL.length);

        System.out.println("Media para Matemáticas = " + pM);
        System.out.println("Media para Historia = " +pH);
        System.out.println("Media para Lengua = " + pL);

        System.out.println("Moda = " + (pM+pH+pL)/3);

        System.out.println("Ingrese el identificador del young padawan (0 - 6)");
        int id = s.nextInt();
        double promedioAlumno = (cM[id]+cH[id]+cL[id])/3;
        System.out.println("promedio del padawan con resgistro : " + id +" = " + promedioAlumno);
    }

}
