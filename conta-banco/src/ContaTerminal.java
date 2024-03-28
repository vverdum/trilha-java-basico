import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        
       
            Scanner sanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite sua agência: ");
        int agencia = scanner.next();

        System.out.println("Por favor, digite o número de sua conta: ");
        int numero = scanner.next();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.next();
        
        System.out.println("Olá " + nomeCliente+", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia+"conta "+numero);
        System.out.println("e seu saldo "+saldo+" já está disponível para saque");
         


        
    }
}
