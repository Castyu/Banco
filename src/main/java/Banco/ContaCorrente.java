package Banco;

class Contacorrente extends Transações{

    String Nome;
    Integer numerodaconta;
    Integer validade;

    public Contacorrente (String nome, Integer numerodaconta, Integer validade) {
        Nome = nome;
        this.numerodaconta = numerodaconta;
        this.validade = validade;
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getNumerodaconta() {
        return numerodaconta;
    }

    public void setNumerodaconta(Integer numerodaconta) {
        this.numerodaconta = numerodaconta;
    }

    public Integer getValidade() {
        return validade;
    }

    public void setValidade(Integer validade) {
        this.validade = validade;
    }








}
