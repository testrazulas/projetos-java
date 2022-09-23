package classes;

public class Diretor extends Autenticavel {

    public double getBonificacao(){
        System.out.println("Bonificação do Diretor");
        return super.getSalario() + 200;
    }
}
