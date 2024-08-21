import java.util.Scanner;

public class ControleBanco {

    private Scanner scanner = new Scanner(System.in);

    public void registrarNome() {
        System.out.print("Digite o nome:");
        String nome = scanner.nextLine(); // Corrigido: chamada correta ao método nextLine()
        System.out.println("Nome registrado: " + nome);
    }
}