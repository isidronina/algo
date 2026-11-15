
import java.util.Scanner;
import modelo.Array;
import modelo.Produto;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Array produtos = new Array();

        // Cadastro manual dos produtos
        produtos.inserir(new Produto("Apple", "TV applelixo", 123, 200));
        produtos.inserir(new Produto("apple", "ariel", 102.00, 101));
        produtos.inserir(new Produto("samsa", "aasda", 101.00, 102));
        produtos.inserir(new Produto("nomes", "ondas", 1011.00, 103));
        produtos.inserir(new Produto("Sapasticos", "sapo", 101212.00, 104));
        produtos.inserir(new Produto("xampo", "peeds", 101231.00, 105));

        int opcao;

        do {
            System.out.println("\n===== MENU DE PRODUTOS =====");
            System.out.println("1 - Pesquisar produto por ID");
            System.out.println("2 - Atualizar produto por ID");
            System.out.println("3 - Remover produto por ID");
            System.out.println("4 - Ordenar produtos por ID");
            System.out.println("5 - Exibir produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o ID do produto: ");
                    int idPesquisa = entrada.nextInt();

                    Produto encontrado = produtos.pesquisarId(idPesquisa);

                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o ID do produto: ");
                    int idAtualizar = entrada.nextInt();

                    if (produtos.pesquisarId(idAtualizar) != null) {

                        entrada.nextLine();

                        System.out.print("Digite o novo nome: ");
                        String nome = entrada.nextLine();

                        System.out.print("Digite a nova marca: ");
                        String marca = entrada.nextLine();

                        System.out.print("Digite o novo preço: ");
                        double preco = entrada.nextDouble();

                        produtos.atualizarPorId(idAtualizar, nome, marca, preco);

                        System.out.println("Produto atualizado!");

                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID do produto: ");
                    int idRemover = entrada.nextInt();

                    if (produtos.pesquisarId(idRemover) != null) {
                        produtos.removerPorId(idRemover);
                        System.out.println("Produto removido!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 4:
                    produtos.mergeSort(0, produtos.getControle(), produtos.getLista());

                    System.out.println("Produtos ordenados por ID!");
                    produtos.exibir();
                    break;

                case 5:
                    produtos.exibir();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        entrada.close();
    }
}
