import java.util.Scanner;

public class parte1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o primeiro número: ");
        int valor1 = scanner.nextInt();
        System.out.println("informe o segundo número: ");
        int valor2 = scanner.nextInt();
        int resultado = valor1 - valor2;
        System.out.println(valor1 + "  +  " + valor2 + " = " + resultado);
        // System.out.println(valor1 + "  +  " + valor2 + " = " + (valor1 + valor 2));
        //desse jeito não precisa declarar a variavel " int resultado = valor1 + valor2";




    }
}

