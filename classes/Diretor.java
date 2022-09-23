package classes;

public class Diretor extends FuncionarioAutenticavel{

    public double getBonificacao(){
        System.out.println("Bonificação do Diretor");
        return super.getSalario() + 200;
    }
}
