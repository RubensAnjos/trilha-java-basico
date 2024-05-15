import java.util.Scanner;

public class ContaTerminal {
    
     
    public static void main(String[] args) throws Exception {
        //Variaveis
        int conta;
        String agencia, nomeCliente;
        Double saldo = 10000.00;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência ! ");
         agencia = scanner.next();
        System.out.println("Por favor, digite sua conta");
        conta = scanner.nextInt();
        System.out.println("Por favor, digite seu nome");
        nomeCliente = scanner.next();
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, "
        + "sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");

        
    }

}