import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        estrutura repetitiva "for"
//        for(inicio; condição; incremento){
//            comando1
//                    comando2
//        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros deseja entrar: ");
        int N = sc.nextInt();
        int soma = 0;

        for(int i=0; i<N; i++){
            System.out.println("Digite o " + (i+1) +" numero: ");
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println("Valor total: " + soma);
        sc.close();
    }
}