public class Gerente extends PessoaFisica {
  double taxaDeBonificacao;

  Gerente(String nome, String cpf, String setor, String dataDeAdmissao, String dataDeDemissao, double salario, String nit) {
    super(nome, cpf, setor, dataDeAdmissao, dataDeDemissao, salario, nit);
    this.taxaDeBonificacao = 0.08;
  }

  void getContraCheque() {
    System.out.printf("salário %.2f\n", this.salario);
    System.out.printf("bonificação %.2f\n", this.salario * this.taxaDeBonificacao);
    System.out.printf("salário total %.2f\n", this.salario + this.salario * this.taxaDeBonificacao);
  }
}