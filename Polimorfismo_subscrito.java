import seres.Cachorro;
import seres.Gato;

public class Polimorfismo_subscrito {
    public static void main(String[] args) {
        Cachorro cachorro= new Cachorro("CALEU");
        Gato gato= new Gato("nozinha");

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
