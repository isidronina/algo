import java.util.Random;

public class quick{
    public static void main(String[] args) {
        int[] v=new int[1000];
        
        inserindoValores(v);
        exibirAmostra(v);
        quickSort(0, v.length-1, v);
        exibirAmostra(v);
    }

    public static void inserindoValores(int []v){
        Random rd= new Random();
        for (int i=0;i<v.length;i++) {
            v[i]=rd.nextInt(1,1000);            
        }

    } 
    public static void quickSort(int e, int d, int[] a){
        int i;
        if(d>e){
            i=particao(e,d,a);
            quickSort(e,i-1,a);
            quickSort(i+1,d,a);
        }
    }
    private static int particao(int e, int d, int[]a){
        int pivo,aux;
        int i,j;
        pivo=a[d];
        i=e-1;
        j=d;
        do {
            do {
                i=i+1;    
            } while ((a[i]<pivo)&&(i<d));
            do {
                j=j-1;

            } while ((a[j]>pivo)&&(j>e));
            aux=a[i];
            a[i]=a[j];
            a[j]=aux;
        } while (j>i);
        a[j]=a[i];
        a[i]=a[d];
        a[d]=aux;
        return i;
    }
    public static void exibirAmostra(int[] v) {
    System.out.println("== 20 PRIMEIROS ORDENADOS ===");
        for (int i = 0; i < 20; i++) {
            System.out.println(v[i]);
        }
    }
}
