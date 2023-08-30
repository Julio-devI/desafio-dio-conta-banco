import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Porfavor digite o número da sua agência");
        agencia = scanner1.nextLine();

        System.out.println("Porfavor digite o numero da conta");
        numero = scanner1.nextInt();

        System.out.println("Porfavor digite o seu nome");
        nomeCliente = scanner1.next();

        System.out.println("Porfavor digite seu saldo");
        saldo = scanner1.nextInt();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
    }
}