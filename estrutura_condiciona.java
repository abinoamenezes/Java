

public class estrutura_condiciona {
    public static void main(String[] args) {
        int nota=-1;
        int media=7;

        if (nota>media && nota<=10) {
            System.out.println("Muito bem"); 
        } else if(nota==media) {

            System.out.println("Voçe ficou na média");
        } else if (nota>10) {
            System.out.println("A nota não pode ser maior que 10");
        } else if (nota<media && nota>=0) {
            System.out.println("você foi reprovado");

        } else if (nota<0) {
            System.out.println("O valor nao pode ser negativo");
        }
        
}
}