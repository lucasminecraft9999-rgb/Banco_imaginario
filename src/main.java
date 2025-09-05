

public class main {
    public static void main(String[]  args){
        System.out.println("Saldo maior");

        BancoTerminal Banco = new BancoTerminal(25 , 30);

        System.out.println("Saldo: " + Banco.saldo);
        System.out.println("Depositar: " + Banco.valor_solicitado);
        System.out.println("depositando o valor: " + Banco.depositar());

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("saldo menor");

        BancoTerminal banco = new BancoTerminal(15 , 22 );

        System.out.println("Saldo: " + banco.saldo);
        System.out.println("Depositar: " + banco.valor_solicitado);
        System.out.println("depositando o valor: " + banco.depositar());

    }



}
