package exercicios;

public class primos {
    public static void main(String[] args) {
        primos p= new primos();
        p.primo(11);
    }
    


public void primo(int numero) {
        int count=0;
        if (numero<=1){
            System.out.println("nao é primo");
        }

        if (numero==2) {
            System.out.println("é primo");
        }

        for (int i=2; i<numero; i++) {
            if (numero % i==0) {
               count+=1;
            }
            

        }
        if (count==0) {
            System.out.println("é primo");

        }
        else {
            System.out.println(" não é primo");
        }
    }
}
