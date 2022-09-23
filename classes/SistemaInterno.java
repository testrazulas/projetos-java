package classes;

public class SistemaInterno {

    private int senha = 2222;

    public boolean autentica(Autenticavel fa){
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou){
            System.out.println("Pode entrar no sistema");
            return true;
        } else {
            System.out.println("Não pode entrar no sistema");
            return false;
        }
    }
}
