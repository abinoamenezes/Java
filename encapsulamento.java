import seres.Pessoa;

public interface encapsulamento {
    public static void main(String[] args) {
      Pessoa aluno= new Pessoa();
      aluno.setIdade(20);
      aluno.setNome("Abinoa");

      System.out.println("Nome: " + aluno.getNome());
      System.out.println("idade: " + aluno.getIdade());




      
    }
}
