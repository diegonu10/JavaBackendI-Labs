import java.util.Scanner;

public class ClasificadorDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa un numero");
        int numero = scanner.nextInt();


        if (numero <1 && numero >-1) {
            System.out.println("cero");}
        else if (numero < 0){
            System.out.println("negativo");}
        else if (numero > 0){
            System.out.println("positivo");}
    }
}
