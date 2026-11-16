package modelo;
public class Array {
    private Produto[] lista= new Produto[4];
    private int controle=0;// controle a quantidade produto do array list

    public void inserir(Produto produto){ // o primeiro e tipo e outro acho que é o parametro
        if (controle==lista.length) { //toda vez que ficar cheio ele faz o metodo dentro do if
            //aumenta o tamanho do array
            lista=alocarNovoArray();

              //ou assim  tambem no controle++
        }
        lista[controle++]=produto;
        
        //controle++; //voce pode fazer no final assim 
    }

    private Produto[] alocarNovoArray(){
        Produto [] novo =new Produto[lista.length+4];
        System.arraycopy(lista, 0, novo, 0, lista.length);
        return novo; 
    }

    public void exibir(){
        for(int i=0;i<controle;i++){
            /*System.out.println("Nome: "+lista[i].getNome());//esse print lista[i] de um print do objeto
            System.out.println("Marca: "+lista[i].getMarca());
            System.out.println("Preco: "+lista[i].getPreco());
            System.out.println("ID: "+lista[i].getId());
            System.out.println("..................");*///esse é um jeto usando o get  mas que fica muito complicado pu cheio
            System.out.println(lista[i].toString()); // o toString ja definido faz essa modificação automaticamente, mas para uso para estudo pode colocar .toString 
            System.out.println("...................................................");
            
        }
    }

    public Produto pesquisarId(int id){
        for(int i=0; i < controle; i++){
            if(id == lista[i].getId()){
                return lista[i];
            }
        }
        return null;
    }

    public void atualizarPorId(int id, String nome, String marca, double preco){
        for(int i=0; i < controle; i++){
            if(id == lista[i].getId()){
                lista[i].setNome(nome);
                lista[i].setMarca(marca);
                lista[i].setPreco(preco);
            }
        }
    }

    public void removerPorId(int id){
        for(int i=0; i <controle; i++){
            if(id == lista[i].getId()){
                for(int j=i;j<controle-1;j++){
                    lista[j]=lista[j+1];
                }
                controle--;
                lista[controle]=null;
                return ;

            }
        }
    }

    public static void mergeSort(int inicio, int tamanho, Produto[] v) {
        if (inicio < tamanho - 1) {
            int meio = (inicio + tamanho) / 2;
            mergeSort(inicio, meio, v);
            mergeSort(meio, tamanho, v);
            intercalar(inicio, meio, tamanho, v);
        }
    }

    private static void intercalar(int inicio, int meio, int tamanho, Produto[] v) {
        int i, j, k;
        Produto[] auxiliar = new Produto[tamanho - inicio];
        i = inicio;
        j = meio;
        k = 0;

        while (i < meio && j < tamanho) {
            if (v[i].getId() <= v[j].getId()) {
                auxiliar[k++] = v[i++];
            } else {
                auxiliar[k++] = v[j++];
            }
        }

        while (i < meio) {
            auxiliar[k++] = v[i++];
        }

        while (j < tamanho) {
            auxiliar[k++] = v[j++];
        }

        for (i = inicio; i < tamanho; i++) {
            v[i] = auxiliar[i - inicio];
        }
    }

    public int getControle() {
        return controle;
    }

    public Produto[] getLista() {
    return lista;
    }
}
