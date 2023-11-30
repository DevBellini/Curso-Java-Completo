import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        1-Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

//        System.out.println("Digite a senha: ");
//        int senha = 2002;
//        int entSenha = 0;
//
//        while (entSenha != senha) {
//            entSenha = sc.nextInt();
//            System.out.println("Senha invalida");
//        }
//        System.out.println("Acesso permitido");

//2-Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//        cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

//        int x=1;
//        int y=1;
//
//        while (x != 0 && y != 0){
//            System.out.println("Digite o valor de x: ");
//            x = sc.nextInt();
//            System.out.println("Digite o valor de y: ");
//            y = sc.nextInt();
//
//            if(x > 0 && y > 0){
//                System.out.println("primeiro");
//            } else if (x > 0 && y < 0) {
//                System.out.println("segundo");
//            } else if (x < 0 && y < 0) {
//                System.out.println("terceiro");
//            } else if (x < 0 && y > 0) {
//                System.out.println("quarto");
//            }
//            else {
//                System.out.println("invalido");
//            }
//        }

//        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//        exemplo.


        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
        int x = sc.nextInt();

        while (x != 4) {

            if(x==1){
                alcool++;
            }

            else if(x==2){
                gasolina++;
            }
            else if(x==3){
                diesel++;
            }
            else{
                System.out.println("Valor invalido");
            }
            System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
            x = sc.nextInt();
        }
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}