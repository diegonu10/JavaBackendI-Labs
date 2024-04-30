import java.util.Scanner;

public class SaludoCondicionado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa la hora");
        int hora = scanner.nextInt();


            if (hora >= 5 && hora <= 12) {
                System.out.println("Buenos dias");}
            else if (hora >= 13 && hora <= 19){
            System.out.println("Buenas tardes");}
            else if (hora >=20 && hora <=24){
                System.out.println("Buenas noches");}
            }
        }







