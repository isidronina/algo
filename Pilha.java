public class Pilha {
    private int[] vetor; ////
    private int controle = 0; //ele vai controlar a quantidade de elementos na pilha//

    public Pilha(int tamanho){ //contrutor: elecria um objeto que vai ter uma caracteriscica que eu colocar//
        vetor=new int[tamanho];

    }
    /**
     * verifica se a pilha está vazia
     * @return boolean
     */

    public boolean empty(){
        return controle == 0;
    }
    /***
     * verifica se a pilha ta cheia
     * @return
     */

    public boolean  full(){
        return controle==vetor.length;
    }
    /**
     * Insere um valor denrto da pilha, obdecendo o criterio
     * LIFO
     * @param n int
     */
    public void push(int n){
        if(!full()){//!full=nao Cheio//
            vetor[controle]=n; //esse if indica que quando o vetor nao estiver cheio vai dar para colocar mais numeros//
            controle++;

        }else{
            System.out.println("Pilha cheia!");//para questoes referente aula foi feito desse jeito mas o correto era fazer de outra forma//
        }
    }
    /***
     * faz a contagem de elemento na pilha 
     * @return
     */

    public int size(){//esse faz devolver a quantidade de elemento da pilha //
        return controle;
    }

    /***
     * pré-condição:Pilha não vazia.
     * @return int 
     */

    public int pop(){
        int valor = vetor[controle-1];
        controle--;
        return valor;
    }


    public int top(){ //vai me mostrar o valor encima da pipla //
        return vetor[controle-1];
    }
}
