package conversorDeBases;

public class TablaNumeracion {
    public static void main(String[] args) {
        String[] bases = new String[15]; // de base 2 a base 16
        for (int i = 0; i < bases.length; i++) {
            bases[i] = "Base " + (i + 2);
        }

        // Encabezado
        System.out.printf("%-6s", "Dec");
        for (String base : bases) {
            System.out.printf("%-8s", base);
        }
        System.out.println();

        // Datos
        for (int num = 1; num <= 16; num++) {
            System.out.printf("%-6d", num);
            for (int base = 2; base <= 16; base++) {
                System.out.printf("%-8s", Integer.toString(num, base).toUpperCase());
            }
            System.out.println();
        }
    }
}