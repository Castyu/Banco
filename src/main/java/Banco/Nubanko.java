package Banco;

public class Nubanko extends Contacorrente {
    public static void main(String[] args) {

    }

    private Contacorrente Conta1;
    private Contacorrente Conta2;

    public Nubanko(String nome, Integer numerodaconta, Integer validade) {
        super(nome, numerodaconta, validade);
        Conta1 = new Contacorrente("Caio Souza",1212312,1624);





    }
}
