
import modelo.Array;
import modelo.Produto;
public class Principal {
    public static void main(String[] args) {
        Array produtos =new Array();
        /*Produto p1= new  Produto("Apple", "TV applelixo", 123, 200);
        Produto p2=new Produto("apple", "ariel", 10.00, 100);
        Produto p3=new Produto(null, null, 0, 0)*///esse é uma forma de de fazer mas a de baixo tambem serve
        produtos.inserir(new Produto("Apple", "TV applelixo", 123, 200)); 
        produtos.inserir(new Produto("apple", "ariel", 102.00, 101));
        produtos.inserir(new Produto("samsa", "aasda", 101.00, 102));
        produtos.inserir(new Produto("nomes", "ondas", 1011.00, 103));
        produtos.inserir(new Produto("Sapasticos", "sapo", 101212.00, 104));
        produtos.inserir(new Produto("xampo", "peeds", 101231.00, 105));

        // produtos.exibir();

        //um metodo para pesquisar produto por id. 
        System.out.println(produtos.pesquisarId(103));
        
        //um metodo para atualizar preço do produto pelo id 
        produtos.atualizarPorId(103, "Fone", "Sony", 10.0);
        System.out.println(produtos.pesquisarId(103));

        //um metodo para remover um produto pelo id
        produtos.removerPorId(103);

        // produtos.exibir();
        
        //exibir o pordutos cadastrados por ordem  de id 
        produtos.mergeSort(0, produtos.getControle(), produtos.getLista());

        produtos.exibir();
    }
}


