public class vetores {
    public static void main(String[] args) {
        //inicializar e declarar
        int[] numeros= {1,2,3,4,5};
       
        //atribuir valores e acessar elementos
        numeros[0]=10;
      int valorPosicao2= numeros[2];
    

      //interacao com o vetor
        for (int i=0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        String[] nomes= {"marcos", "Ana", "Alice", "João"};

        int j=0;
        while (j<nomes.length) {
            System.out.println(nomes[j]);
            j++;
        }
    }
}
