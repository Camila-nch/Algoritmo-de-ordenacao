

public class Algoritmos {
   
    int auxiliar; 

    void bolha(int vetInicial[]){

    // realizando a ordenação com o algoritmo de bolha 

    for(int v=0; v<vetInicial.length; v++){

        for( int j=0; j<vetInicial.length-v-1; j++){
        
            if (vetInicial[j]>vetInicial[j+1]){
            auxiliar = vetInicial[j];
            vetInicial[j]= vetInicial[j+1];
            vetInicial[j+1] = auxiliar;

        }

    }
    }
 
    System.out.println("\nEsse é o vetor ordenado pela bolha:");
        for(int i=0 ; i<vetInicial.length; i++){
            System.out.print(vetInicial[i] +" ");
    }
}




void selection (int vetInicial[]){

    for(int i = 0;i< vetInicial.length -1; i++){
        
        int index=i;

        for (int j =i+1;j<vetInicial.length; j++ ){

            if (vetInicial[j]<vetInicial[index]){

                index = j;
            }
        }
        int auxiliar = vetInicial[index];
        vetInicial[index]= vetInicial[i];
        vetInicial[i]=auxiliar;
        
  
    
}
    System.out.println("\nEsse é o vetor ordenado pelo selection:");
    for(int l=0 ; l<vetInicial.length; l++){
    System.out.print(vetInicial[l] +" ");
}
}

}