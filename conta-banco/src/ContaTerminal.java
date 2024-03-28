import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
    
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite sua agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número de sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        Locale brasil = new Locale("pt", "BR");
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(brasil);

        String valorFormatado = formatadorMoeda.format(saldo);
        

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", e o número de sua conta é " + numero);
        System.out.println("e seu saldo " + valorFormatado + " já está disponível para saque.");
        
        scanner.close();
    }
        
    }
