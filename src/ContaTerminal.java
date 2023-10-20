import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // atributos

        // TODO:Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela scanner os valores digitados no terminal

        // exibir a mensagem conta criada

        int numConta;
        String numAgencia = " ";
        Double saldo = 237.48;
        boolean status = true;
        String nomeCliente = "Mario Andrade";

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência ");

        numAgencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta ");
        numConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o seu nome ");
        nomeCliente = sc.nextLine();
        
         System.out.println("Por favor, digite o seu saldo ");
         saldo = sc.nextDouble();

         System.out.println("Olá ," + nomeCliente + " obrigado por criar uma conta em nosso banco sua agência é " + numAgencia + " conta: " + numConta +" e seu saldo " + saldo + " já está disponível para saque ");

         sc.close();

          


        

    }
}
