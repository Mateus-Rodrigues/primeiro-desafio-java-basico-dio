import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta !");
        int Numero = scanner.nextInt();

        System.out.println("Por favor, digite seu Nome !");
        String ClienteNome = scanner.next();

         System.out.println("Por favor, digite seu Sobrenome !");
        String ClienteSobrenome = scanner.next();

        System.out.println("por favor, digite seu Saldo !");
        Double Saldo = scanner.nextDouble();

        System.out.println(" Olá " + ClienteNome + ClienteSobrenome + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + " Conta " + Numero + " e seu saldo no valor de  " + Saldo + " ja esta disponivél para saque");
    }
}
