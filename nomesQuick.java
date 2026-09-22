import java.util.Arrays;

public class palavras {
    public static void main(String[] args) {
        String[] nomesL = {"ana", "Bruno", "carla", "Diego", "eduarda", "Felipe", "gabriela", "Henrique", "isabela", "João"};
        
        quickSort(0, nomesL.length - 1, nomesL);
        
        exibir(nomesL);
    }

    public static void quickSort(int e, int d, String[] a) {
        int i;
        if (d > e) {
            i = particao(e, d, a);
            quickSort(e, i - 1, a);
            quickSort(i + 1, d, a);
        }
    }

    private static int particao(int e, int d, String[] a) {
        String pivo, aux;
        int i, j;
        
        pivo = a[d]; 
        i = e - 1;
        j = d;

        do {
            do {
                i = i + 1;

            } while ((a[i].compareTo(pivo) < 0) && (i < d));

            do {
                j = j - 1;
            } while ((a[j].compareTo(pivo) > 0) && (j > e));

            if (i < j) {
                aux = a[i];
                a[i] = a[j];
                a[j] = aux;
            }
        } while (j > i);

        aux = a[i];
        a[i] = a[d];
        a[d] = aux;

        return i;
    }

    public static void exibir(String[] nomeL) {
        System.out.println(Arrays.toString(nomeL));
    }
}
