package seres;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
        
    }

    public void latir(){
        System.out.println("O cahorro está latindo");
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU");
    }
    
}
