public class PessoaFisica extends Funcionario {
  String nit;

  PessoaFisica(String nome, String cpf, String setor, String dataDeAdmissao, String dataDeDemissao, double salario, String nit) {
    super(nome, cpf, setor, dataDeAdmissao, dataDeDemissao, salario);

    this.nit = nit;
  }

  void getContraCheque() {
    System.out.println(this.salario);
  }
}