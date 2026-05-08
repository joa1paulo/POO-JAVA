public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Kanye West", 1000.0, false);
        Cliente c2 = new Cliente("Nelly Furtado", 500.0, true);

        Conta conta1 = new Conta();
        conta1.cliente = c1;

        Conta conta2 = new Conta();
        conta2.cliente = c2;

        conta1.depositarSaldo(250);
        conta2.depositarSaldo(300);

        conta1.retirarSaldo(100);
        conta2.retirarSaldo(1000);
        conta1.retirarSaldo(5000);

        conta1.transferirSaldoPara(300, conta2);
        conta2.transferirSaldoPara(300, conta1);

        System.out.println("\n--- EXTRATO FINAL DE: " + c1.nome + " ---");
        for (String op : c1.operacoes) {
            System.out.println(op);
        }

        System.out.println("\n--- EXTRATO FINAL DE: " + c2.nome + " ---");
        for (String op : c2.operacoes) {
            System.out.println(op);
        }
    }
}