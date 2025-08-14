import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantos anos voce tem? ");
        int age = scanner.nextInt();
        System.out.println("você é emancipado? ");
        boolean eEmancipado = scanner.nextBoolean();
        boolean podeDirigir = age <= 17 || (eEmancipado && age >=16) ;
        System.out.printf("você pode dirigir? (%s) \n", !podeDirigir);





    }
}







//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("quanto é 2 + 2? ");
//        var resultado = scanner.nextInt();
//        var acertou = resultado == 4;
//        System.out.printf("o resultado é 4, você acertou? (%s)", acertou);
//
//
//
//    }