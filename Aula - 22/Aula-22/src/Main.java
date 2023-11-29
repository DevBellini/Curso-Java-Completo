import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Estrutura repetitiva "enquanto" while

//        while (condição) {
//            comando 1
//            comando 2
//        }
//        Regra:
//        V: Executa e volta
//            F: Pulafora

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.println(soma);
        sc.close();
    }
}