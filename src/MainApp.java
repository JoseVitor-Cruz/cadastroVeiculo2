import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        List<Veiculo> listaDeVeiculosCadastrados = new ArrayList<>();
        while (opcao != 9) {
            System.out.println("[1] - Cadastrar veículos\n[2] - Exibir veículos\n[9] - Sair");
            opcao = teclado.nextInt();
            teclado.nextLine();
            switch (opcao) {
                case 1:
                    Veiculo novoVeiculo = cadastrarVeiculos(teclado);
                    listaDeVeiculosCadastrados.add(novoVeiculo);
                    break;
                case 2:
                    boolean ans = listaDeVeiculosCadastrados.isEmpty();
                    if (ans == false) {
                        Veiculo.listarVeiculos(listaDeVeiculosCadastrados);
                    }
                    else {
                        System.out.println("Nenhum veículo cadastrado !");
                    }
            }
        }
    }
    private static Veiculo cadastrarVeiculos(Scanner teclado) {
        System.out.println("Digíte o modelo do seu veículo: ");
        String modelo = teclado.nextLine();

        System.out.println("Digíte a marca do seu veículo: ");
        String marca = teclado.nextLine();

        System.out.println("Digíte a placa do seu veículo: ");
        String placa = teclado.nextLine();

        System.out.println("Digíte o valor do seu veículo: ");
        double valor = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Digíte o ano de Fabricação do seu veículo(Formato 'aaaa'): ");
        String ano = teclado.nextLine();
        boolean validacaoAnoRegex = Uteis.isValidAnoRegex(ano);
        while (validacaoAnoRegex == false) {
            System.out.println("Ano digitado no formato incorreto. Digíte o ano de Fabricação do seu veículo(Formato 'aaaa')");
            ano = teclado.nextLine();
            validacaoAnoRegex = Uteis.isValidAnoRegex(ano);
        }

        System.out.println("Digíte o seu telefone de contato (Ex: (41) 11111-1111): ");
        String telefone = teclado.nextLine();
        boolean validacaoTelefoneRegex = Uteis.isValidTelephoneRegex(telefone);
        while (validacaoTelefoneRegex == false) {
            System.out.println("Telefone digitado no formato inválido. Digíte o seu telefone de contato (Ex: (41) 11111-1111): ");
            telefone = teclado.nextLine();
            validacaoTelefoneRegex = Uteis.isValidTelephoneRegex(telefone);
        }

        System.out.println("Digíte o seu endereço: ");
        String endereco = teclado.nextLine();

        System.out.println("Digíte a sua cidade: ");
        String cidade = teclado.nextLine();

        System.out.println("UF: ");
        String uf = teclado.nextLine();


        System.out.println("Insíra uma imagem: ");
        JFileChooser jFileChooser = new JFileChooser();
        int respostaDoFileChooser = jFileChooser.showOpenDialog(null);
        String caminhoArquivo = null;
        if (respostaDoFileChooser == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado;
            arquivoSelecionado = jFileChooser.getSelectedFile();
            System.out.println("Caminho do arq" + arquivoSelecionado.getAbsolutePath());
            caminhoArquivo = arquivoSelecionado.getAbsolutePath();
            System.out.println("Imagem Salva");
        } else {
            System.out.println("nenhum arq selecionado");
        }
        return new Veiculo(modelo, marca, placa, ano, telefone, endereco, cidade, uf, valor, caminhoArquivo);
    }
}
