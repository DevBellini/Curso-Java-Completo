import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final double PI = 3.14159;
    // COM FINAL VIRA CONSTANTE, N PODE MUDAR MAIS..CONSTANTES SEMPRE MAISCULO

    public static void main(String[] args) {
//        versao1: metodos na propria classe do programa
//        versao2: classe calculator com membros de instancia
//        versao3: classe calculator com metodo estatico

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);
        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

        sc.close();
    }
    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius /3.0;
    }
}