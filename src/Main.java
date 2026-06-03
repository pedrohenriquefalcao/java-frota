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

            }
        } while (opcaoUsuario != 5);

//        Simular Envio de Mercadoria: >     * O usuário digita a placa do veículo que deseja usar.
//
//        O sistema busca o veículo na lista de frota.
//
//                Se encontrar, o sistema pede o peso da carga (kg) e a distância da entrega (km).
//
//                O sistema processa as validações e exibe na tela o custo total do frete calculado com base nas regras daquele veículo específico.
//
//                Listar Frota Cadastrada: Exibir na tela todos os veículos cadastrados, mostrando a placa, modelo, capacidade e o tipo do veículo (usando o instanceof para detalhar se é Moto ou Caminhão).
//
//                Encerrar Programa.
    }
}