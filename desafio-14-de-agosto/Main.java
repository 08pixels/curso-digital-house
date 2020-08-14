import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    Gerente rodrigo = new Gerente("nome", "cpf", "setor", "dataDeAdmissao", "dataDeDemissao", 900.00, "nit");
    Supervisor luiz = new Supervisor("nome", "cpf", "setor", "dataDeAdmissao", "dataDeDemissao", 900.00, "nit");

    funcionarios.add(luiz);
    funcionarios.add(rodrigo);

    for(Funcionario func: funcionarios) {
      func.getContraCheque();
      System.out.println();
    }

  }
}