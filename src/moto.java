import java.util.Scanner;

public class moto extends veiculo {

    public moto() {
    }

    public moto(String placa, String modelo, double capacidadeMaximaKG) {
        super(placa, modelo, capacidadeMaximaKG);
    }


    public moto(Scanner placa, Scanner modelo, Scanner capacidadeMaximaKG) {
    }

    @Override
    public void calcularFrete(double distancia, double pesoCarga) {
        if (pesoCarga = this.capacidadeMaximaKG) {
            System.out.println("Erro! Envio cancelado!");
            System.out.println("O peso da carga (" + pesoCarga + "kg) ultrapassou a capacidade da moto (" + this.capacidadeMaximaKG + "kg)");
            return;
        }

        double totalFrete = distancia * 2.0;
        System.out.println("= Resumo do Frete (Moto) =");
        System.out.println("Distância: " + distancia + " km | Peso: " + pesoCarga + " kg");
        System.out.println("Valor Total do Frete: R$ " + totalFrete);
    }

}
