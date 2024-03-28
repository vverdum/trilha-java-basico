import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     */
    public static void main(String[] args)  {
    
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome e sobrenome: ");
        String nomeCompleto = scanner.nextLine();

        // Dividir o nome completo em nome e sobrenome
        String[] partesNome = nomeCompleto.split(" ");
        String nome = partesNome[0]; // Primeira parte é o nome
        String sobrenome = partesNome[partesNome.length - 1]; // Última parte é o sobrenome

          

        System.out.println("Por favor, digite sua agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número de sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        Locale brasil = new Locale("pt", "BR");
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(brasil);

        String valorFormatado = formatadorMoeda.format(saldo);
        

        System.out.println("Olá " + nome+ sobrenome + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", e o número de sua conta é " + numero);
        System.out.println("e seu saldo de " + valorFormatado + " já está disponível para saque.");
        
        scanner.close();
    }
        
    }
