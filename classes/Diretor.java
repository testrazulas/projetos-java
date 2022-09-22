package classes;

public class Diretor extends Funcionario{

    public double getBonificacao(){
        System.out.println("Bonificação do Diretor");
        return super.getSalario() + 200;
    }
}
