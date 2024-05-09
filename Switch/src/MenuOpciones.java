import java.util.Scanner;

public class MenuOpciones {
public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Imgrese una opicon");
                System.out.println("1 Iniciar");
                        System.out.println("2 Configuracion");
                        System.out.println("3 Salir");
                        int opcion = scanner.nextInt();

                        switch (opcion) {
                                case 1:
                                        System.out.println("Iniciando el juegazo");
                                        break;
                                case 2:
                                        System.out.println("Abriendo configuracion");
                                        break;
                                case 3:
                                        System.out.print("Saliendo");
                                        break;
                                default:
                                        System.out.println("No valida");



        }

        }
    }
