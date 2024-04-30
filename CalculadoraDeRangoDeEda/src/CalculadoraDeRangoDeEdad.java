import java.util.Scanner;

public class CalculadoraDeRangoDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa su edad");
        int edad = scanner.nextInt();


        if (edad >= 0 && edad <= 12) {
            System.out.println("NiñO");}
        else if (edad >= 13 && edad <= 19){
            System.out.println("Adolecente");}
        else if (edad >=20 ){
            System.out.println("Adulto");}
    }
}

