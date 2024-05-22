import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        var menu = new MenuOpcoes();
        BuscaMoeda moeda = new BuscaMoeda();
        double taxaConversao = 0;
        double valorInicial = 0;
        int opcaoMenu = 0;

        while (opcaoMenu != 7) {
            System.out.println(menu.menu());
            opcaoMenu = leitura.nextInt();

            try {
                if (opcaoMenu == 7) {
                    break;
                }
                menu.opcao(opcaoMenu);
                taxaConversao = moeda.buscaMoeda(moeda.endereco(menu.getMoeda(), menu.getMoedaNova()));
                System.out.println("Digite o valor que deseja converter: ");
                valorInicial = leitura.nextDouble();
                System.out.println("O valor de " + valorInicial + " [" + menu.getMoeda() + "] corresponde ao valor de " + valorInicial * taxaConversao + " [" + menu.getMoedaNova() + "]");
                System.out.println("******************************");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Aplicação encerrada!");
                break;
            }
        }
    }
}
