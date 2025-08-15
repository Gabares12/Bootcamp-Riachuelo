import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe seu nome");
        String name = scanner.next();
        System.out.println("Informe sua idade");
        int age = scanner.nextInt();
        System.out.println("você é emancipado? (s/n)");
        boolean eEmanciapado = scanner.next().equalsIgnoreCase("s");




        if (age >= 18) {

            System.out.println(name + " você tem " + age + " anos " + " você pode dirigir");

        }else if (age >=16 && eEmanciapado){
            System.out.println(name + " apesar de você ter " + age + " você é emancipado e pode dirigir");
        }

        else  {
            System.out.println(name + " você tem " + age + " anos e não pode dirigir");
        }

        System.out.println("fim");

     }
    }



//    }   if (age >= 18) {
//
//        System.out.println(name + " você tem " + age + " anos " + " você pode dirigir");
//    } else  {
//        System.out.println(name + " você tem " + age + " você não pode dirigir");
//    }
//
//        System.out.println("fim");