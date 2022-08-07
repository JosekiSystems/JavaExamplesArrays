public class EjemploArreglosCombinados {
    public static void main(String[] args) {

        int[] a, b, c, d;
        a = new int[10*3];
        b = new int[10*3];
        c = new int[20*3];

        d = new int[20*3];


        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }
        int aux = 0;
        for (int i = 0; i < b.length; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("En el conjunto c en la casilla " + i + " contenine a  " + c[i]);
        }
        System.out.println("+++++++++++++++++++++++++++++");
        int aux1 = 0;
        for (int i = 0; i < b.length; i += 2) {
            for (int j = 0; j < 2; j++) {
                d[aux1++] = a[i + j];
            }
            for (int j = 0; j < 2; j++) {
                d[aux1++] = b[i + j];
            }
        }
        for (int i = 0; i < d.length; i++) {
            System.out.println("En el conjunto d en la casilla " + i + " contenine a  " + d[i]);
        }
        System.out.println("+++++++++++++++++++++++++++++");
        int aux2 = 0;
        for (int i = 0; i < b.length; i += 3) {
            for (int j = 0; j < 3; j++) {
                d[aux2++] = a[i + j];
            }
            for (int j = 0; j < 3; j++) {
                d[aux2++] = b[i + j];
            }
        }
        for (int i = 0; i < d.length; i++) {
            System.out.println("En el conjunto d1 en la casilla " + i + " contenine a  " + d[i]);
        }
    }
}



