package classes;

public class BonificacaoControle {

    private double soma;

    public void registra(Autenticavel fa){
        double boni = fa.getBonificacao();
        this.soma = this.soma + boni;

    }

    public double getSoma() {
        return soma;
    }

}
