public abstract class veiculo {

    String placa;
    String modelo;
    double capacidadeMaximaKG;

    public veiculo() {
    }

    public veiculo(String placa, String modelo, double capacidadeMaximaKG) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadeMaximaKG = capacidadeMaximaKG;
    }

    void cadastrarVeiculo() {
    }

    abstract void calcularFrete();

}
