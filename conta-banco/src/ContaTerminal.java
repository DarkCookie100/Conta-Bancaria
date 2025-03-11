import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner (System.in);
//Declaração de variáveis
            int numero;
            String agencia;
            String nomeCliente;
            double saldo;

//Solicitar o número da agência
            System.out.println("Por favor, digite o número da Agência: ");
            agencia = scanner.nextLine(); 

//Solicitar o número da conta
            System.out.println("Por favor, digite o número da Conta: ");
            numero = scanner.nextInt();

//Limpar o buffer do scanner
            scanner.nextLine();

//Solicitar o nome do cliente
            System.out.println("Por favor, digite o nome do Cliente: ");
            nomeCliente = scanner.nextLine();

//Solicitar o saldo
            System.out.println("Por favor, digite o saldo da Conta: ");
            saldo = scanner.nextDouble();

//Exibição da mensagem
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

//Fechar o scanner
            scanner.close();

    }
}
