package modelo;
public class Array {
    private Produto[] lista= new Produto[4];
    private int controle=0;// controle a quantidade produto do array list

    public void inserir(Produto produto){ // o primeiro e tipo e outro acho que é o parametro
        lista[controle++]= produto; //ou assim  tambem no controle++
        //controle++; //voce pode fazer no final assim 
    }
    public void exibir(){
        for(int i=0;i<controle;i++){
            System.out.println("Nome: "+lista[i].getNome());//esse print lista[i] de um print do objeto
            System.out.println("Marca>: "+lista[i].getMarca());
            System.out.println("Preco: "+lista[i].getPreco());
            System.out.println("ID: "+lista[i].getId());
            System.out.println("..................");
        }
    }

}
