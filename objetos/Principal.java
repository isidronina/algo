
import modelo.Array;
import modelo.Produto;
public class Principal {
    public static void main(String[] args) {
        Array produtos =new Array();// armazenar e organizar múltiplos dados do mesmo tipo em uma única variável
        Produto p1= new  Produto("LG", "TV applelixo", 123, 200);
        Produto p2=new Produto("apple", "ariel", 10.00, 100);
        produtos.inserir(p1); //Primeiro produto em "produtos"
        produtos.inserir(p2); //Segundo prouto em "produtos"
        produtos.exibir();
    }
}
