import Conicas1.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            System.out.println("Ingresar opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1: {
                    // Código para la opción 1 (Circunferencia)
                    break;
                }
                case 2: {
                    // Código para la opción 2 (Elipse)
                    break;
                }
                case 3: {
                    // Código para la opción 3 (Hiperbola)
                    break;
                }
                case 4: {
                    // Código para la opción 4 (Parábola)
                    break;
                }
            }
        } while (op != 5);
    }

    private static void menu() {
        System.out.println("\n\t\t ===== MENU PRINCIPAL =====\n");
        System.out.println("1. Circunferencia");
        System.out.println("2. Elipse");
        System.out.println("3. Hiperbole");
        System.out.println("4. Parábola");
        System.out.println("5. SALIR");
    }
}
