void main() {
    // Variables
    int opcion;
    Scanner sc = new Scanner(System.in);

    do {
        saltoLinea(1);
        opcion = menu(sc);
        switch(opcion) {
            case 0: {
                System.out.println("< Cerrando programa... >");
                break;
            } // Salir
            default: {
                System.out.println("! ERROR !");
                break;
            }
        }

        if(opcion != 0) {
            limpiarPantalla(sc);
        } // Limpiar pantalla
    } while (opcion != 0); // Ciclo Menu


}

// Métodos
public static int menu(Scanner sc) {
    System.out.println("[MENU SUPERMERCADO]");
    separador(15);
    opcionMenu(0, "SALIR");
    opcionMenu(1, "Opcion 1");
    separador(15);
    System.out.print("- Ingrese una opción: ");
    int opcion = sc.nextInt();
    sc.nextLine();
    return opcion;
}

// Auxiliares
public static void limpiarPantalla(Scanner sc) {
    System.out.println("< Volviendo al menu principal >");
    System.out.print("> Presione Enter para continuar...");
    sc.nextLine();
    saltoLinea(20);
}
public static void separador(int num) {
    for(int i=0; i<num; i++) {
        System.out.print("- ");
    }
    System.out.println();
}
public static void saltoLinea(int num) {
    for(int i=0; i<num; i++) {
        System.out.println();
    }
}
public static void opcionMenu(int num, String descripcion) {
    System.out.printf("[%d.] %s.", num, descripcion);
}
