import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int agencia;
        String conta;
        String nome;
        double saldo;

        System.out.print("Por favor insira o seu nome:\n");
        nome = scanner.next();
        System.out.print("Por favor insira o número da agência:\n");
        agencia = scanner.nextInt();
        System.out.print("Por favor insira a sua conta:\n");
        conta = scanner.next();
        System.out.println("Por favor insira o seu saldo:\n");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+" obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");
    }

}
