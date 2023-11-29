public class Main {
    public static void main(String[] args) {

        //Expressão condicional ternária
        //Sintaxe:
        //(condição)?valor_se_verdadeiro : valor_se_falso

//        Exemplos:
//        ( 2 > 4) ? 50 : 80 -> 80
//        (10 != 3) ? "Maria" : "Alex" -> "Maria"

        double price = 34.5;
//        double discount;
//
//        if(price < 20.0){
//            discount = price * 0.1;
//        }
//        else {
//            discount = price * 0.05;
//        }

        //Simplificação desse codigo:
        double discount = (price < 20.0) ? price*0.1 : price*0.05;
        System.out.println(discount);
    }
}