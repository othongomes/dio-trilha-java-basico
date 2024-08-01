import java.util.Scanner;

import javax.swing.JOptionPane;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //OPÇÃO 1: Utilizando JOptionPane

        //TODO: Conhecer e importar a classe Scanner
        
        //TODO: Exibir as mensagens para o usuário
       /*int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, digite o número da Agência: "));

        String agencia = JOptionPane.showInputDialog(null, "Digite sua Agência: ");

        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");

        
        Double saldo = (Math.random() * 1001); 

        //TODO: Obter pela classe escanner os valores digitados no terminal

        //TODO: Exibir a mensagem da conta criada
        JOptionPane.showMessageDialog(null, "Olá " + nome + ", obrigado  por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+numero+" e seu saldo "+ String.format("%.2f", saldo)+" já está disponível para saque");
  */ 
        //----------------------------------------------------------------------------------

        //OPÇÃO 2: Utilizando SCANNER

        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        
        //TODO: Exibir as mensagens para o usuário
        //TODO: Obter pela classe escanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência !");
        int numero2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite sua Agência: ");
        String agencia2 = sc.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome2 = sc.nextLine();
        
        Double saldo2 = (Math.random() * 1001);

        //TODO: Exibir a mensagem da conta criada
        System.out.println("Olá " + nome2 + ", obrigado  por criar uma conta em nosso banco, sua agência é "+ agencia2 +", conta "+numero2+" e seu saldo "+ String.format("%.2f", saldo2)+" já está disponível para saque");
        

    }
}
