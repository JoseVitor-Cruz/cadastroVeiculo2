import java.util.List;

public class Veiculo {
    private String modelo;
    private String marca;
    private String placa;
    private String anoFabricacao;
    private String telefone;

    private String endereco;
    private String cidade;
    private String uf;
    private double valorVeiculo;
    private String caminhoArquivo;

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public void setValorVeiculo(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }



    public Veiculo(String modelo, String marca, String placa, String anoFabricacao, String telefone, String endereco, String cidade, String uf, double valorVeiculo,String caminhoArquivo){
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
        this.valorVeiculo = valorVeiculo;
        this.caminhoArquivo = caminhoArquivo;
    }

    public static void listarVeiculos(List<Veiculo> listaDeVeiculosCadastrados) {
        for(Veiculo veiculoCadastrado : listaDeVeiculosCadastrados){
            System.out.println(veiculoCadastrado.toString());
        }

    }
    @Override
    public String toString() {
        return "Veiculo: " +
                "\nModelo: " + modelo + '\'' +
                "\nMarca: " + marca + '\'' +
                "\nPlaca: " + placa + '\'' +
                "\nAno de fabricação: " + anoFabricacao + '\'' +
                "\nTelefone: " + telefone + '\'' +
                "\nEndereco: " + endereco + '\'' +
                "\nCidade: " + cidade + '\'' +
                "\nUF: " + uf + '\'' +
                "\nValor do veiculo: " + valorVeiculo +
                "\nCaminho do arquivo: " + caminhoArquivo;
    }
}

