import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        1-Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
//        System.out.println("Digite algum numero: ");
//        int numeroEntrada = sc.nextInt();
//
//        if (numeroEntrada >= 0){
//            System.out.println("NÃO NEGATIVO");
//        }else{
//            System.out.println("NEGATIVO");
//        }

//        2-Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

//        System.out.println("Digite algum numero: ");
//        int numeroEntrada = sc.nextInt();
//
//        if (numeroEntrada % 2 == 0){
//            System.out.println("PAR");
//        }else{
//            System.out.println("ÍMPAR");
//        }

//        3-Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//        ordem crescente ou decrescente.

//        System.out.println("Digite o valor de A: ");
//        int a = sc.nextInt();
//        System.out.println("Digite o valor de B: ");
//        int b = sc.nextInt();
//
//        if(a % b == 0 || b % a == 0){
//            System.out.println("SÃO MULTIPLOS");
//        }else{
//            System.out.println("NÃO SÃO MULTIPLOS");
//        }

//        4-Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

//        System.out.println("Digite a hora inicial do jogo: ");
//        int horaInicial = sc.nextInt();
//        System.out.println("Digite a hora final do jogo: ");
//        int horaFinal = sc.nextInt();
//        int horaTotal;
//
//        if (horaFinal > horaInicial) {
//            horaTotal = horaFinal - horaInicial;
//            System.out.println("O JOGO DUROU " + horaTotal + " HORA(S)");
//
//        } else {
//            horaTotal = (24 - horaInicial) + horaFinal;
//            System.out.println("O JOGO DUROU " + horaTotal + " HORA(S)");
//        }

//5-Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//        seguir, calcule e mostre o valor da conta a pagar.

//        CODIGO          ESPECIFICAÇÃO           PREÇO
//        1               CACHORRO QUENTE         R$ 4.00
//        2               XSALADA                 R$ 4.50
//        3               XBACON                  R$ 5.00
//        4               TORRADA SIMPLES         R$ 2.00
//        5               REFRIGERANTE            R$ 1.50

//        System.out.println("Digite o código do produto: ");
//        int codigo = sc.nextInt();
//        System.out.println("Digite a quantidade: ");
//        int quantidade = sc.nextInt();
//        double Total = 0.0;
//
//        if (codigo == 1) {
//            Total = quantidade * 4.00;
//            System.out.printf("Total: R$ %.2f", Total);
//        } else if (codigo == 2) {
//            Total = quantidade * 4.50;
//            System.out.printf("Total: R$ %.2f", Total);
//        } else if (codigo == 3) {
//            Total = quantidade * 5.00;
//            System.out.printf("Total: R$ %.2f", Total);
//        } else if (codigo == 4) {
//            Total = quantidade * 2.00;
//            System.out.printf("Total: R$ %.2f", Total);
//        } else if (codigo == 5) {
//            Total = quantidade * 1.50;
//            System.out.printf("Total: R$ %.2f", Total);
//        }

//        6-Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//        seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//        nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

//        Locale.setDefault(Locale.US);
//
//        System.out.println("Digite um valor entre 0 à 100 para saber em qual intervalo o número se encontra: ");
//        double valorEntrada = sc.nextDouble();
//
//        if (valorEntrada > 0 && valorEntrada <= 25) {
//            System.out.println("INTERVALO [0, 25]");
//        } else if (valorEntrada > 25 && valorEntrada <= 50) {
//            System.out.println("INTERVALO [25, 50]");
//        } else if (valorEntrada > 50 && valorEntrada <= 75) {
//            System.out.println("INTERVALO [50, 75]");
//        } else if (valorEntrada > 75 && valorEntrada <= 100) {
//            System.out.println("INTERVALO [75, 100]");
//        } else {
//            System.out.println("FORA DE INTERVALO");
//        }

//        7-Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//        de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//        ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//                Se o ponto estiver na origem, escreva a mensagem “Origem”.
//        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//        situação.

//        Locale.setDefault(Locale.US);
//        System.out.println("Digite o valor de x: ");
//        double x = sc.nextDouble();
//        System.out.println("Digite o valor de y: ");
//        double y = sc.nextDouble();
//
//        if(x == 0 && y == 0){
//            System.out.println("ORIGEM");
//        } else if (x > 0 && y > 0) {
//            System.out.println("Q1");
//        } else if (x < 0 && y > 0) {
//            System.out.println("Q2");
//        } else if (x < 0 && y < 0) {
//            System.out.println("Q3");
//        }else {
//            System.out.println("Q4");
//        }

//        8-Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//        que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//        qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//        Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//        mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//
//                -------------------------------------------
//                |RENDA                   |IMPOSTO DE RENDA|
//                |DE 0,00 a 2000,00       |ISENTO          |
//                |DE 2000.01 ATE 3000.00  |8%              |
//                |DE 3000.01 ATE 4500.00  |18%             |
//                |ACIMA DE R$ 4500.00     |28%             |
//                -------------------------------------------

        System.out.println("Digite seu salário para saber o valor do imposto: ");
        double salario = sc.nextDouble();
        double impostoSalario = 0;

                if (salario <= 2000.0) {
                    impostoSalario = 0.0;
                }
                else if (salario <= 3000.0) {
                    impostoSalario = (salario - 2000.0) * 0.08;
                }
                else if (salario <= 4500.0) {
                    impostoSalario = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
                }
                else {
                    impostoSalario = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
                }

                if (impostoSalario == 0.0) {
                    System.out.println("Isento");
                }
                else {
                    System.out.printf("R$ %.2f%n", impostoSalario);
                }


        sc.close();
    }
}