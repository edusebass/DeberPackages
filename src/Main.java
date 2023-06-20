import Conicas1.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        Circunferencia circu = new Circunferencia(23, 34, 12, 45, 34, 11);
        ELIPSEE elip = new ELIPSEE(3, 4, 5, 6, 7, 8);
        Hiperbole hiper = new Hiperbole(3, 4, 5, 7, 12, 23, 0);
        Parabola para = new Parabola(3, 4, 12, 23);

        do {
            menu();
            System.out.println("Ingresar opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1: {
                    // Código para la opción 1 (Circunferencia)
                    System.out.println("Circunferencia");
                    System.out.println("--- Resultados de la circunferencia ---");
                    circu.imprimir();
                    sc.nextLine();
                    break;
                }
                case 2: {
                    // Código para la opción 2 (Elipse)
                    System.out.println("Elipse");
                    System.out.println("--- Resultados del Elipse ---");
                    System.out.println("Distancia semiejes: " +  elip.distanciaSemiejes());
                    System.out.printf("Perimetro del elipse: " + elip.perimetroElipse() + "\n");
                    System.out.printf("Area del elipse: " + elip.getA() + "\n");
                    System.out.println("Foco: " + elip.getFoco());
                    sc.nextLine();
                    break;
                }
                case 3: {
                    // Código para la opción 3 (Hiperbola)
                    System.out.println("Hiperbole");
                    System.out.println("--- Resultados de la hiperbole ---");
                    System.out.println("Valor C de la hiperbole: " + hiper.hallar_C());
                    hiper.hallar_vertices();
                    sc.nextLine();
                    break;
                }
                case 4: {
                    // Código para la opción 4 (Parábola)
                    System.out.println("Parábola");
                    System.out.println("--- Resultados de la parabola ---");
                    para.calcularEjeHorizontal();
                    para.imprimirDatos();
                    sc.nextLine();
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
