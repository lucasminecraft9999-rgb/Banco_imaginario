import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BancoTerminal {

    public double saldo;
    public double valor_solicitado;


    public BancoTerminal(double saldo , double valor_solicitado){
        this.saldo = saldo;
        this.valor_solicitado = valor_solicitado;
    }

    public double depositar() {
        if (valor_solicitado > saldo){
            System.out.println("Saldo insuficiente");
        }
        else {
            saldo = saldo - valor_solicitado;

        }
        return saldo;
    }
    }
