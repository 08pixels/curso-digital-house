public class Funcionario {
  String nome;
  String cpf;
  String setor;
  String dataDeAdmissao;
  String dataDeDemissao;
  double salario;

  Funcionario(String nome, String cpf, String setor, String dataDeAdmissao, String dataDeDemissao, double salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.setor = setor;
    this.dataDeAdmissao = dataDeAdmissao;
    this.dataDeDemissao = dataDeDemissao;
    this.salario = salario;
  }

  void getContraCheque() {
    
  }
}