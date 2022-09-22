package classes;

public class Gerente extends FuncionarioAutenticavel {

    public Gerente(){

    }
@Override
    public double getBonificacao(){
        System.out.println("Bonificação do Gerente: ");
        return super.getSalario();
    }
}
