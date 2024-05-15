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
/**
 * Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
Programa: "Por favor, digite o número da Agência !"
Usuário: 1021 (depois ENTER para o próximo campo)
Revise sobre concatenação e classe String com método concat
Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.
 * 
 */
