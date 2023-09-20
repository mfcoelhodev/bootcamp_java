import java.util.Scanner;
    
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = input.next();

        System.out.println("Digite o número da sua agência: (Ex: 123-4)");
        String agency = input.next();

        System.out.println("Digite o número da sua conta: ");
        int number = input.nextInt();

        System.out.println("Digite o seu saldo: ");
        double credit = input.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + credit + " já está disponível para saque.");

        input.close();

    

    }
}
