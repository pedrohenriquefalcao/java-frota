//TODO: Cadastrar Moto: Solicitar tipo, placa, modelo e capacidade de carga (ex: 30 kg).
//Cadastrar Caminhão: Solicitar placa, modelo e capacidade de carga (ex: 5000 kg).
//Simular Envio de Mercadoria: >     * O usuário digita a placa do veículo que deseja usar.
//O sistema busca o veículo na lista de frota.
//Se encontrar, o sistema pede o peso da carga (kg) e a distância da entrega (km).
//O sistema processa as validações e exibe na tela o custo total do frete calculado com base nas regras daquele veículo específico.
//Listar Frota Cadastrada: Exibir na tela todos os veículos cadastrados, mostrando a placa, modelo, capacidade e o tipo do veículo (usando o instanceof para detalhar se é Moto ou Caminhão).
//Encerrar Programa.

import java.util.ArrayList;
import java.util.Scanner;

public class menuOpcoes {

    static void exibirMenu() {
        System.out.println("===== Sistema LogiTech (v1.0) =====");
        System.out.println("== Digite [1] para cadastrar novo veículo");
        System.out.println("== Digite [2] para simular envio de mercadoria");
        System.out.println("== Digite [3] para listar frota cadastrada");
        System.out.println("== Digite [5] para encerrar o programa.");
        System.out.print("Escolha uma opção: ");
    }

    static void cadastrarVeiculo(Scanner scanner, ArrayList<veiculo> lista) {
        System.out.println("\n= Cadastrando Veículo =");
        System.out.println("Qual tipo do veículo que você deseja cadastrar?");
        System.out.println("[1] para moto");
        System.out.println("[2] para caminhão");

        int tipo = scanner.nextInt();
        scanner.nextLine();

        if (tipo != 1 && tipo != 2) {
            System.out.println("Erro! Por favor, insira um número válido!");
            return;
        }

        System.out.println("Insira a placa do veículo:");
        String placa = scanner.nextLine();

        System.out.println("Insira o modelo do veículo:");
        String modelo = scanner.nextLine();

        System.out.println("Insira a capacidade máxima de carga! (kg)");
        double capacidadeMaximaKG = scanner.nextDouble();
        scanner.nextLine();

        veiculo novoVeiculo = null;

        if (tipo == 1) {
            novoVeiculo = new moto(placa, modelo, capacidadeMaximaKG);
        } else if (tipo == 2) {
            novoVeiculo = new caminhao(placa, modelo, capacidadeMaximaKG);
        }

        lista.add(novoVeiculo);
        System.out.println("Veículo " + novoVeiculo.modelo + " de placa [" + novoVeiculo.placa + "] cadastrado com sucesso!\n");
    }

    static veiculo encontrarVeiculo(String placa, ArrayList<veiculo> lista) {
        for (veiculo v : lista) {
            if (v.placa.equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }

    static void enviarMercadoria(Scanner scanner, ArrayList<veiculo> lista) {
        System.out.println("\n= Inicializando Envio de Mercadoria =");
        System.out.println("Insira aqui a placa do veículo desejado: ");
        String placaEnviada = scanner.nextLine();

        veiculo veiculoEncontrado = encontrarVeiculo(placaEnviada, lista);

        if (veiculoEncontrado != null) {
            System.out.println("Veículo encontrado! Modelo: " + veiculoEncontrado.modelo);

            System.out.println("Insira a distância da entrega (em KM): ");
            double distancia = scanner.nextDouble();

            System.out.println("Insira o peso total da carga da mercadoria (em KG): ");
            double pesoCarga = scanner.nextDouble();
            scanner.nextLine();

            veiculoEncontrado.calcularFrete(distancia, pesoCarga);

        } else {
            System.out.println("Erro: Veículo de placa [" + placaEnviada + "] não foi localizado no sistema.");
        }

    }

    static void listarFrota(ArrayList<veiculo> lista) {
        System.out.println("\n= Inicializando Listagem de frota =");
        System.out.println("\n= Veículos cadastrados: =");
        for (veiculo v: lista) {
            System.out.println("[VEÍCULO] Placa: "+v.placa+" Modelo: "+v.modelo+" Capacidade máxima (KG): "+v.capacidadeMaximaKG);
            return;
        }
    }




}