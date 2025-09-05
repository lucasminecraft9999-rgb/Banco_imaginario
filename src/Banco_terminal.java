public class Banco_terminal {
    public static void main(String[] args){
         double saldo;
         double valor_solicitado;

         saldo = 25;
         valor_solicitado = 18;

        System.out.println("valor do seu saldo: " + saldo);
        System.out.println("valor solicitado: " + valor_solicitado);

         if (valor_solicitado > saldo){
             System.out.println("saldo insuficiente");
         }
         else {
             saldo -= valor_solicitado;
             System.out.println("Seu saldo atual ficou: " + saldo);
         }

        System.out.println("======================================================================");


        saldo = 15;
        valor_solicitado = 22;

        System.out.println("valor do seu saldo: " + saldo);
        System.out.println("valor solicitado: " + valor_solicitado);

        if (valor_solicitado > saldo){
            System.out.println("saldo insuficiente");
        }
        else {
            saldo -= valor_solicitado;
            System.out.println("Seu saldo atual ficou: " + saldo);
        }


    }
}
