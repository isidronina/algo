
import java.util.Scanner;

public class usaFila {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Fila fila = new Fila(3);

        while (true) {
            System.out.println("\n------ MENU ------");
            System.out.println("[1] ENQUEUE");
            System.out.println("[2] DEQUEUE");
            System.out.println("[3] FRONT");
            System.out.println("[4] SIZE");
            System.out.println("[5] EMPTY");
            System.out.println("[6] MOSTRAR");
            System.out.println("[7] SAIR");

            System.out.print("<< ");
            int opcao = teclado.nextInt();

            int valor;

            switch (opcao) {

                case 1:
                    System.out.println("Digite o valor:");
                    valor = teclado.nextInt();

                    fila.enqueue(valor);
                    break;

                case 2:
                    if (!fila.empty()) {
                        valor = fila.dequeue();
                        System.out.println("Valor retirado: " + valor);
                    } else {
                        System.out.println("Fila vazia!");
                    }
                    break;

                case 3:
                    if (!fila.empty()) {
                        valor = fila.front();
                        System.out.println("Valor do FRONT: " + valor);
                    } else {
                        System.out.println("Fila vazia!");
                    }
                    break;

                case 4:
                    valor = fila.size();
                    System.out.println("Total de elementos: " + valor);
                    break;

                case 5:
                    if (fila.empty()) {
                        System.out.println("Não tem valores na fila.");
                    } else {
                        System.out.println("Tem valores na fila.");
                    }
                    break;

                case 6:
                    fila.mostrarFila();
                    break;

                case 7:
                    teclado.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            // Mostra o vetor depois de cada operação
            fila.mostrarVetor();
        }
    }
}
