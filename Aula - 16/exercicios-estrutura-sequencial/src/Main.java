import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        1-Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//        mensagem explicativa, conforme exemplos.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        int a, b, SOMA;
//        a = sc.nextInt();
//        b = sc.nextInt();
//        SOMA = a + b;
//        System.out.printf("SOMA = %d", SOMA);

//        2-Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//        casas decimais conforme exemplos.
//        Fórmula da área: area = π . raio2
//        Considere o valor de π = 3.14159

//        double areaCirculo, π = 3.14159, raio;
//
//        System.out.println("Digite o valor do raio: ");
//        raio = sc.nextDouble();
//
//        areaCirculo = π*raio*raio;
//
//        System.out.printf("Área do círculo: %.4f",areaCirculo);

//        3-Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

//        int A, B, C, D, DIFERENCA;
//
//        System.out.println("Digite o valor de A: ");
//        A = sc.nextInt();
//        System.out.println("Digite o valor de B: ");
//        B = sc.nextInt();
//        System.out.println("Digite o valor de C: ");
//        C = sc.nextInt();
//        System.out.println("Digite o valor de D: ");
//        D = sc.nextInt();
//
//        DIFERENCA = (A*B-C*D);
//        System.out.println("DIFERENCA = " + DIFERENCA);

//        4-Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//        decimais.

//        int numeroFunc, horasTrab;
//        double valorHora, salarioFunc;
//
//        System.out.println("Digite o número do funcionário: ");
//        numeroFunc = sc.nextInt();
//        System.out.println("Digite as horas trabalhadas: ");
//        horasTrab = sc.nextInt();
//        System.out.println("Digite o valor da hora trabalhada: ");
//        valorHora = sc.nextDouble();
//
//        salarioFunc = horasTrab * valorHora;
//        System.out.println("NUMBER = " + numeroFunc);
//        System.out.printf("SALARY = U$ %.2f%n",salarioFunc);

//        5-Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

//        int codPc1, codPc2, qtdPc1, qtdPc2;
//        double valorUniPc1, valorUniPc2, valorTotal;
//
//        System.out.println("Digite código da peça 1: ");
//        codPc1 = sc.nextInt();
//        System.out.println("Digite a quantidade de peças 1: ");
//        qtdPc1 = sc.nextInt();
//        System.out.println("Digite o valor unitário da peça 2: ");
//        valorUniPc1 = sc.nextDouble();
//        System.out.println("Digite código da peça 2: ");
//        codPc2 = sc.nextInt();
//        System.out.println("Digite a quantidade de peças 2: ");
//        qtdPc2 = sc.nextInt();
//        System.out.println("Digite o valor unitário da peça 2: ");
//        valorUniPc2 = sc.nextDouble();
//
//        valorTotal = (qtdPc1*valorUniPc1) + (qtdPc2*valorUniPc2);
//        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);

//        6-Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//        mostre:
//        a) a área do triângulo retângulo que tem A por base e C por altura.
//                b) a área do círculo de raio C. (pi = 3.14159)
//        c) a área do trapézio que tem A e B por bases e C por altura.
//        d) a área do quadrado que tem lado B.
//                e) a área do retângulo que tem lados A e B.

        float A, B, C, TRIANGULO;
        double PI = 3.14159, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;

        System.out.println("Digite 3 valores com ponto fluante: ");
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();

        TRIANGULO = (A*C)/2;
        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        CIRCULO = C*C*PI;
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        TRAPEZIO = ((A+B)*C)/2;
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        QUADRADO = B*B;
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        RETANGULO = A*B;
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);





        sc.close();
    }
}