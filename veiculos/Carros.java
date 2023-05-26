package veiculos;

public class Carros {
    private String marca;
    private String modelo;
    private int ano;

    public Carros(String marca, String modelo, int ano) {
        this.marca= marca;
        this.modelo= modelo;
        this.ano=ano;
    }

    public  void acelerar () {
        System.out.println("O carro acelerando" );
    }

    public void frear () {
        System.out.println("freando...");
    }



}
