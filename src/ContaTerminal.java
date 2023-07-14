import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;
        
        System.out.println("Por favor, digite o número da conta !");
        numero = scan.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scan.next();
        
        System.out.println("Por favor, digite o nome do cliente !");
        scan.nextLine();
        nomeCliente = scan.nextLine();
    
        System.out.println("Por favor, digite o saldo !");
        saldo = scan.nextBigDecimal();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        scan.close();
    }
}