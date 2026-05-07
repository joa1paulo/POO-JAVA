public class Banco {
    public static void main(String[] args){

        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.cliente = "joao";
        c1.especial = false;
        c1.saldo = 1000;

        c2.cliente = "paulo";
        c2.especial = true;
        c2.saldo = 500;

        c1.depositar(500);
        c2.depositar(10.5);

        c1.retirarSaldo(100);
        c2.retirarSaldo(600);

        c1.transferirPara(1000, c2);

    }
}
