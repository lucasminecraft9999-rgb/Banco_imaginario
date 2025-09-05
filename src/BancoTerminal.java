import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BancoTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu saldo: ");
        double  saldo = scanner.nextDouble();

        System.out.println("Digite o valor solicitado: ");
        double  valor_solicitado = scanner.nextDouble();

        System.out.println("valor do seu saldo: " + saldo + "R$");
        System.out.println("valor solicitado: " + valor_solicitado + "R$");

        if (valor_solicitado > saldo){
            System.out.println("saldo insuficiente");
        }
        else {
            saldo = saldo - valor_solicitado;
            System.out.println("Seu saldo atual ficou: " + saldo + "R$");
        }
        
    }
    }
