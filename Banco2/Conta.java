import java.time.*;
import java.time.format.DateTimeFormatter;

public class Conta {
    Cliente cliente;
    Clock tempo;

    String dataHora() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
    void checarSaldo(){
    System.out.println("A conta corrente de " + cliente.nome + ",atualmente, tem: R$" + cliente.saldo);
        cliente.operacoes.add(dataHora() + ": Saldo verificado: R$" + cliente.saldo);
    }
    void depositarSaldo(double valor){
        cliente.saldo += valor;
        checarSaldo();
        cliente.operacoes.add(dataHora() + ": Saldo depositado: R$" + valor + ". Novo saldo: R$" + cliente.saldo);
    }
    boolean retirarSaldo(double valor){
        if(cliente.especial || valor < cliente.saldo){
            cliente.saldo = cliente.saldo - valor;
            checarSaldo();
            cliente.operacoes.add(dataHora() + ": Saldo retirado: R$" + valor + ". Novo saldo: R$" + cliente.saldo);
            return true;
        }else {
            System.out.println("A conta não tem saldo o suficiente nem é conta especial.");
            return false;
        }
    }
    void transferirSaldoPara(double valor,Conta destinatario){
        if(retirarSaldo(valor)){
            destinatario.depositarSaldo(valor);
            cliente.operacoes.add(dataHora() + ": Saldo transferido: R$" + valor + " para " + destinatario.cliente.nome);
            destinatario.cliente.operacoes.add(dataHora() + ": Saldo recebido: R$" + valor + " de " + cliente.nome);
        }
    }
}
