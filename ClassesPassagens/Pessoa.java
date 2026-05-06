import java.util.Scanner;
public class Pessoa {
    Scanner leia = new Scanner(System.in);
    String nome;
    double peso, altura;

    double calculaImc() {
        return peso / (altura * altura);
    }

    double pessoaparaimc() {
        System.out.println("Insira o nome da pessoa!");
        nome = leia.nextLine();
        System.out.println("Insira o peso da pessoa!");
        peso = leia.nextDouble();
        System.out.println("Insira a altura da pessoa!");
        altura = leia.nextDouble();
        leia.nextLine();
        return calculaImc();
    }

    void respostaimc(double imc) {
        System.out.print(nome + " está: ");
        if (imc < 18.5) {
            System.out.println("Abaixo do peso!!!");
        } else if (imc >= 18.5 && imc <= 25) {
            System.out.println("Com peso normal!");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Acima do peso!!!");
        } else {
            System.out.println("Obeso");
        }
    }

}
