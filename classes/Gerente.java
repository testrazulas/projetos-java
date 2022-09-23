package classes;

public class Gerente extends Autenticavel {

    public Gerente(){

    }
@Override
    public double getBonificacao(){
        System.out.println("Bonificação do Gerente: ");
        return super.getSalario();
    }
}
