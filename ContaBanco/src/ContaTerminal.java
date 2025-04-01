
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String numAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numConta = scanner.nextInt(); 

        System.out.println("Por favor, digite o valor de depósito inicial: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " +  nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + 
            ", conta " + numConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
