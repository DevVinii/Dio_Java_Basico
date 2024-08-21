public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        ControleBanco controleBanco = new ControleBanco();

        controleBanco.registrarDados();

        controleBanco.mensagemFinal();
    
    }
}
