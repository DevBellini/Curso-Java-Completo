import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Exercicios estrutura for

//        1-Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//        X, se for o caso.

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

//        System.out.println("Digite um numero: ");
//        int num = sc.nextInt();
//
//        for (int i = 0; i < num; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

//        2-Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

//        System.out.println("Digite uma quantidade para entrada: ");
//        int N = sc.nextInt();
//        int in = 0;
//        int out = 0;
//
//        for (int i = 0; i < N; i++) {
//            System.out.println("Digite o " + (i+1) + " numero");
//            int x = sc.nextInt();
//            if (x >= 10 && x <= 20) {
//                in = in + 1;
//            } else {
//                out = out + 1;
//            }
//        }
//        System.out.println(in + " in");
//        System.out.println(out + " out");

//        3-Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//        de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//        conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//        peso 5.

//        System.out.println("Numero de testes a seguir: ");
//        int N = sc.nextInt();
//        double somaNota = 0;
//
//        for(int i=0; i<N; i++){
//            System.out.println("Nota 1: ");
//            double nota1 = sc.nextDouble();
//            System.out.println("Nota 2: ");
//            double nota2 = sc.nextDouble();
//            System.out.println("Nota 3: ");
//            double nota3 = sc.nextDouble();
//
//            somaNota = ((nota1*2) + (nota2*3) + (nota3*5))/10;
//            System.out.printf("Media: %.1f%n", somaNota);
//        }


//        4-Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

//        System.out.printf("Digite quantidade de repetições: ");
//        int N = sc.nextInt();
//
//        for(int i=0; i<N; i++){
//            System.out.println();
//            System.out.println("Digite o primeiro numero: ");
//            double a = sc.nextDouble();
//            System.out.println();
//            System.out.println("Digite o segundo numero: ");
//            double b = sc.nextDouble();
//
//            if(b == 0){
//                System.out.println();
//                System.out.println("Divisão impossivel");
//            }else{
//                double numDiv = a/b;
//                System.out.println();
//                System.out.println(numDiv);
//            }
//        }

//        5-Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//        Lembrando que, por definição, fatorial de 0 é 1.

//        System.out.println("Digite numero para saber seu fatorial: ");
//        int N = sc.nextInt();
//
//        int fat = 1;
//        for (int i=1; i<=N; i++) {
//            fat = fat * i;
//        }
//
//        System.out.println(fat);

//        6-Ler um número inteiro N e calcular todos os seus divisores.
//        int N = sc.nextInt();
//
//        for(int i=1; i<=N; i++){
//            if(N % i == 0){
//                System.out.println(i);
//            }
//        }

//        7-Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//                começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//        exemplo.


        System.out.println("Digite um valor de entrada: ");
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            int num = i;
            int quad = i*i;
            int cubo = i*i*i;

            System.out.println(num + " " + quad + " " + cubo);
        }


        sc.close();
    }
}