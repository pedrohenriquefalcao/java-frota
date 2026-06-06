import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcaoUsuario = 0;
        ArrayList<veiculo> listaDeVeiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            menuOpcoes.exibirMenu();
            opcaoUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUsuario) {

                case 1:
                    menuOpcoes.cadastrarVeiculo(scanner, listaDeVeiculos);
                    break;
                case 2:
                    menuOpcoes.enviarMercadoria(scanner, listaDeVeiculos);
                    break;
                case 3:
                    menuOpcoes.listarFrota(listaDeVeiculos);
                    break;
            }

        } while (opcaoUsuario != 4);

    }
}