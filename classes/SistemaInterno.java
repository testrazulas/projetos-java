package classes;

public class SistemaInterno {

    private int senha = 2222;

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
}
