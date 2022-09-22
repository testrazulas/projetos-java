package classes;

public abstract class Funcionario {
    private String nome;

    private String cpf;

    private double salario;

    public Funcionario(){

    }

    public abstract double getBonificacao();

    public String getNome(){

        return this.nome;
    }

    public void setNome(String nome){

        this.nome = nome;
    }

    public String getCPF(){
        return this.cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

}
