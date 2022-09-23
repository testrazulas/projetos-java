package classes;

public abstract class Autenticavel extends Funcionario {

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
            }
            return true;
        } else {
            return false;
        }
    }
}
