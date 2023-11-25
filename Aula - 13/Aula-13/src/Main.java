import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        entrada de string
//        String x;
//        x = sc.next();

//        entrada de inteiro
//        int x;
//        x = sc.nextInt();

//        entrada de número flutuante
//        double x;
//        x = sc.nextDouble();
//        System.out.printf("Você digitou: %.2f", x);

//        Um caracter
//        char x;
//        x = sc.next().charAt(0);
//        System.out.println("Você digitou: " + x);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}