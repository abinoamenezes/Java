
import java.util.Arrays;

public class manipulacaoStrings {
    public static void main(String[] args) {
      String nome="Abinoa";
      System.out.println(nome.toUpperCase());
      System.out.println(nome.toLowerCase());
      System.out.println(nome.length());


      String outroNome= "abinoa Menezes de Paula";
      System.out.println(nome.equals(outroNome));
      System.out.println(nome.equalsIgnoreCase(outroNome));

      System.out.println(nome.charAt(0));

      System.out.println(nome.substring(0, 3));

      String[] NovoName = nome.split(" ");
      System.out.println(Arrays.toString(NovoName));

      
    }
}
