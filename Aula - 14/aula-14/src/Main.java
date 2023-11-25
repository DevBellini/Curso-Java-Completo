import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        String s1, s2, s3;

//      nextline armazena todo texto inserido
//      quando voce utiliza comando de leitura diferente
//      do nextLine() e da alguma quebra de linha,
//      essa quebra de linha fica perdente.
//      SOLUÇÃO: fazer mais um nextLine()

        x = sc.nextInt();
        //solução
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}