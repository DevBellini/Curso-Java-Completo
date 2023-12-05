package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        1 - Fazer um programa para ler os valores da largura e altura
//        de um retangulo.Em seguida, mostrar na tela o valor de
//        sua area, perimetro e diagonal.Usar uma classe como mostrado
//        no projeto ao lado.
//
//        ex:
//        Enter rectangle width and height:
//        3.00
//        4.00
//        AREA = 12.00
//        PERIMETER = 14.00
//        DIAGONAL = 5.00

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
         rectangle.width = sc.nextDouble();
         rectangle.height = sc.nextDouble();


        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
        sc.close();
    }
}