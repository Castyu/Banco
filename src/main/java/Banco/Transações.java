package Banco;

import java.sql.SQLOutput;
import java.util.Scanner;
//achar uma maneira de separar cada operação sem gerar muitas classes.
public class Transações {
    public static void main(String[] args) {
        Scanner userimput = new Scanner(System.in);
        Integer Saldo = 0;

        int Deposito = userimput.nextInt();
        Saldo = Saldo += Deposito;


        int saque = userimput.nextInt();
        if (saque > Saldo)
            System.out.println("Saldo insuficiente");
        else
        Saldo = Saldo -= saque;

        Void extrato;{
            System.out.println(Saldo);
        }


















    }
}
