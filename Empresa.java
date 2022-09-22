import classes.*;

public class Empresa {

    public static void main(String[] args){

        Funcionario tiago = new Diretor();
        tiago.setNome("Tiago Severo");
        tiago.setCPF("080.441.249-93");
        tiago.setSalario(5600.00);

        System.out.println(tiago.getNome());
        System.out.println("Salário do funcionario: " + tiago.getSalario() + " R$.");
        System.out.println("Sua bonificação é de: " + tiago.getBonificacao() + " R$.");
        System.out.println();

        Gerente g1 = new Gerente();
        g1.setNome("Ticiany Alencar");
        g1.setCPF("048.759.893-85");
        g1.setSalario(5000);

        System.out.println(g1.getNome());
        System.out.println(g1.getCPF());
        System.out.println("Salário do gerente: " + g1.getSalario() + " R$.");
        System.out.println("Sua bonificação é de: " + g1.getBonificacao() + " R$.");
        boolean autenticou = g1.autentica(2222, 4444);
        System.out.println("A Senha e login foram autenticados? " + autenticou);
        System.out.println();

        Funcionario p1 = new Programador();
        p1.setNome("Tiago");
        p1.setCPF("048.759.893-85");
        p1.setSalario(3000);

        System.out.println(p1.getNome());
        System.out.println(p1.getCPF());
        System.out.println("Salário do gerente: " + p1.getSalario() + " R$.");
        System.out.println("Sua bonificação é de: " + p1.getBonificacao() + " R$.");
        System.out.println();

        bonificacaoControle();
        System.out.println();

        sistemaInterno();


    }

    public static void bonificacaoControle(){

        Gerente g1 = new Gerente();

        g1.setNome("Tiago");
        g1.setSalario(5000.0);

        EditorVideo e = new EditorVideo();
        e.setSalario(2500.0);

        Programador d = new Programador();
        d.setSalario(2000.0);

        BonificacaoControle controle = new BonificacaoControle();
        controle.registra(g1);
        controle.registra(e);
        controle.registra(d);

        System.out.println(controle.getSoma());

    }

    public static void sistemaInterno(){

        Gerente g = new Gerente();
        g.setSenha(2222);

        Diretor d = new Diretor();
        d.setSenha(3333);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(d);
    }

}
