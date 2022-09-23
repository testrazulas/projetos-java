package classes;

public class Diretor extends Funcionario implements Autenticavel {

    private int senha;

    private int login;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setLogin(int login){
        this.login = login;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

    public boolean autentica(int senha, int login){
        if(this.senha == senha){
            if(this.login == login){
                return true;
            } else{
                return false;
            }
        }
        return false;
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() + 200;
    }
}
