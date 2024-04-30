import java.util.Scanner;

public class VerificacionDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        if (edad <=18){
            System.out.println("Ingreso completo");}
        else if (edad >=17){
            System.out.println("Ingreso denegado");}
        }
    }

