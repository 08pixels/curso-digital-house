public class PessoaJuridica extends Funcionario {
  String cnpj;

  PessoaJuridica(String nome, String cpf, String setor, String dataDeAdmissao, String dataDeDemissao, double salario, String cnpj) {
    super(nome, cpf, setor, dataDeAdmissao, dataDeDemissao, salario);
    this.cnpj = cnpj;
  }
}