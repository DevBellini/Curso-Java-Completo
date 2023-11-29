import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de minutos utilizados: ");
        int entMinutos = sc.nextInt();

        double valorConta = 50.00;

        if (entMinutos > 0 && entMinutos <= 100) {
            System.out.printf("Valor a pagar: R$ %.2f", valorConta);
        } else if (entMinutos > 100) {
            valorConta += (entMinutos - 100) * 2;
            System.out.printf("Valor a pagar: R$ %.2f", valorConta);
        } else {
            System.out.println("Valores invalidos");
        }

    }
}