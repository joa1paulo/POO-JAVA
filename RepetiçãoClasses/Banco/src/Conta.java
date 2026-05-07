public class Conta {
    String cliente;
    double saldo;
    boolean especial;

    void consultaSaldo(){
        System.out.println("o saldo da conta de "+ cliente +" é " + saldo);
    }

    void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            consultaSaldo();
        }else {
            System.out.println("não é possível depositar tal valor");
        }
    }

    void retirarSaldo(double valor){
        if(valor > saldo && especial == true){
            saldo = saldo - valor;
            consultaSaldo();
        }else if (valor > saldo && especial == false){
            System.out.println("a conta não possui saldo suficiente para a retirada");
            return;
        }else {
            saldo = saldo - valor;
       }
    }

    void transferirPara(double valor,Conta c){
        retirarSaldo(valor);
        if(valor > saldo && especial == false){
            c.depositar(valor);
        }
        consultaSaldo();
        c.consultaSaldo();

    }

}