
public class Fila {
    private int[] vetor;
    private int controle = 0;

    public Fila(int tamanho) {
        vetor = new int[tamanho];
    }

    /**
     * Verifica se a fila está vazia
     */
    public boolean empty() {
        return controle == 0;
    }

    /**
     * Verifica se a fila está cheia
     */
    public boolean full() {
        return controle == vetor.length;
    }

    /**
     * Insere um elemento no final da fila
     */
    public void enqueue(int n) {
        if (!full()) {
            vetor[controle] = n;
            controle++;
        } else {
            System.out.println("Fila cheia!");
        }
    }

    /**
     * Retira o primeiro elemento da fila
     */
    public int dequeue() {
        int valor = vetor[0];

        for (int i = 0; i < controle - 1; i++) {
            vetor[i] = vetor[i + 1];
        }

        controle--;

        return valor;
    }

    /**
     * Mostra o primeiro elemento da fila
     */
    public int front() {
        return vetor[0];
    }

    /**
     * Retorna a quantidade de elementos
     */
    public int size() {
        return controle;
    }

    /**
     * Mostra todas as posições do vetor
     */
    public void mostrarVetor() {
        System.out.print("Vetor: [");

        for (int i = 0; i < vetor.length; i++) {
            if (i < controle) {
                System.out.print(vetor[i]);
            } else {
                System.out.print("_");
            }

            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    /**
     * Mostra os elementos da fila
     */
    public void mostrarFila() {
        if (empty()) {
            System.out.println("Fila vazia!");
        } else {
            System.out.println("INICIO");

            for (int i = 0; i < controle; i++) {
                System.out.print("[ " + vetor[i] + " ] ");
            }

            System.out.println("FIM");
        }
    }
}
