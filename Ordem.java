import java.util.Scanner;
public class Ordem {

   public static void main(String[] args) {
    int vetInicial[]={5,8,9,2,0,1,4,7,3};

    Algoritmos sistema = new Algoritmos();
    
    System.out.println("\n Esse é o vetor desordenado:");

    for(int i=0 ; i<vetInicial.length; i++){
        System.out.print(vetInicial[i] +", ");
    }

    Scanner teclado = new Scanner(System.in);
    int escolha;
   do{ 
    
    System.out.println(" \nEscolha o algoritmo de ordenação: \n1-Bubble sort \n2-Selection sort \n3-Sair \n");
    escolha = teclado.nextInt();

    switch (escolha) {
      
    case 1:
        sistema.bolha(vetInicial);
        
break;
    case 2:
        sistema.selection(vetInicial);
   break;
   
}

    }while(escolha!=3);

}

   
}