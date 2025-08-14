import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ola, informe seu nome: ");
        String name = scanner.next();
        System.out.println("informe sua idade: ");
        int age = scanner.nextInt();
        System.out.println("olá " + name + " sua idade é " + age);

    }
}


//    //jeito 2
//    private final static String WELCOME_MESSAGE = "olá , informe seu nome";
//
//
//    public static void main(String[] args) {
//
//        var  scanner = new Scanner(System.in);
//        System.out.println(WELCOME_MESSAGE);
//        var name = scanner.next();
//        System.out.println("informe sua idade ");
//        var age = scanner.nextInt();
//        System.out.println("olá " + name + " sua idade é