import seres.Calculadora;

public class Polimofirsmo_sobrecarga {
    public static void main(String[] args) {
        Calculadora calculadora= new Calculadora();
       System.out.println(calculadora.somar(2, 3)); 
      System.out.println( calculadora.somar(2.3, 3.2)); 
    }
}
