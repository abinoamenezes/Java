package exercicios;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
       
        Scanner scanner= new Scanner(System.in );

        System.out.print("digite um numero para saber seu fatorial: ");
        int numero= scanner.nextInt();
        int valor=numero;
        
        for (int i=0; i<numero; i++) {
            valor= valor * (numero-1);
            numero=numero-1;

        }
        System.out.println(valor);
        scanner.close();

    }
}
