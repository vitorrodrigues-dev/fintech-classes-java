package br.com.fiap.fintech.view;
import br.com.fiap.fintech.model.*;


public class Main {
    public static void main(String[] args) {


        Investimento[] carteira = new Investimento[2];

        carteira[0] = new RendaFixa(123, "CDB", 1200, "11/09/2026", 2.00);
        carteira[1] = new RendaVariavel(1234, "Fundo Imobiliário", 1300, "13/10/2026", 3.00);

        for (int i = 0; i < carteira.length; i++) {
            double calculo = carteira[i].calcularRendimento();
            System.out.println("Nome: " + carteira[i].getNome() + " Valor: " + calculo);
        }

        Simulacao simulacao = new Simulacao(1, 1000.0, 12, 1.5);
        System.out.println(simulacao.exibirResultadoSimulacao());

        MetaFinanceira meta = new MetaFinanceira(1, "Viagem", 5000.0, 12);
        meta.atualizarProgresso(1500.0);
        System.out.println("Progresso: " + meta.getProgresso());
        System.out.println("Meta atingida? " + meta.verificarMetaAtingida());

        Usuario usuario = new Usuario(1, "Maria", "mariag@emial.com", "estudos12", "moderado", "01/12/2020");
        usuario.alterarSenha("joao213");

        try {
            carteira[0].resgatarInvestimento(999999);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }
    }
}
