
import java.util.Scanner;

public class usaPilha {
    public static void main(String[] args) {
        int[] v = new int[10]; 

        Scanner teclado= new Scanner(System.in);
        //Pilha pilha =  declaranda a variavel com nome pilha//
        //new Pilha();= dando uma função para variavel//
        Pilha pilha = new Pilha(3);
        while (true) { 
            System.out.println("------MENU------");
            System.out.println("[1] PUSH \n[2] POP");
            System.out.println("[3] TOP \n[4] SIZE");
            System.out.println("[5] EMPTY \n[6] MOSTRAR");
            System.out.println("[7] SAIR");
            System.out.print("<<");
            int opcao= teclado.nextInt();
            int valor;
            switch(opcao){
                
                case 1: System.out.println("Digite o valor");
                    valor=teclado.nextInt();
                    pilha.push(valor);
                    System.out.println("o valor foi adicionado");
                    break;
                case 2: 
                    if(!pilha.empty()){
                        pilha.pop();//só funciona quando é verificado se tava vazio// 
                        System.out.println("o valor foi retirado");
                    }else{
                        System.out.println("Pilha vazia");
                    }
                    break;
                case 3:
                    if(!pilha.empty()){
                        valor=pilha.top();//só funciona quando é verificado se tava vazio// 
                        System.out.println("Valor do top é "+valor);
                    }else{
                        System.out.println("Pilha vazia");
                    }
                    break;
                case 4:   //size
                    valor=pilha.size();
                    System.out.print("o valor total de elementos é"+valor);
                    break;
                case 5://empty
                    if(pilha.empty()){
                        System.out.println("não tem valores na pilha");
                    }else{
                        System.out.println("tem valor na pilha");
                    }
                    
                    break;
                case 6://mostar


                case 7://sair//
                    teclado.close();
                    System.exit(0);//ele considera ao programa que a saida foi 0 no case sem erro//
            }
        }
    }
}

//fazer algo que devolda o vetor dos elementos depois de cada chamda ex: fiz um push ele mostra o valores do vetor logo depois sem tentar usar na pilha
