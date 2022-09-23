package classes;

public abstract interface Autenticavel {

    public void setSenha(int senha);

    public void setLogin(int login);

    public boolean autentica(int senha);

    public boolean autentica(int senha, int login);
}
