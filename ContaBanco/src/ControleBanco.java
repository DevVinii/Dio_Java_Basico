import java.util.Scanner;

public class ControleBanco {

     Scanner scanner = new Scanner(System.in);
     String nome;
     int numero;
     String agencia;
     float saldo;

    public void registrarDados() {
        System.out.print("Digite o nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consome o caractere de nova linha restante

        System.out.print("Digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Digite o saldo: ");
        saldo = scanner.nextFloat();
        scanner.nextLine(); // Consome o caractere de nova linha restante
    }

    public void mensagemFinal() {
        System.out.println("Olá, " + nome + "! Muito obrigado por criar uma conta em nosso banco.");
        System.out.println("O número da sua conta é: " + numero);
        System.out.println("Seu saldo é: " + saldo);
        System.out.println("Sua Agência é: " + agencia);
    }

}
