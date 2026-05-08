import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    String endereco;
    double saldo;
    boolean especial;
    List<String> operacoes = new ArrayList<>();

    public Cliente(String nome, double saldo, boolean especial) {
        this.nome = nome;
        this.saldo = saldo;
        this.especial = especial;
    }
}
