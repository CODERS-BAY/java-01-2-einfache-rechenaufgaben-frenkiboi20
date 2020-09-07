public class EinfacherRechenAufgabe {

    public static void main(String[] args) {

        int num1 = 130;
        int num2 = 520;

        // Integers
        // Addition
        System.out.format("%d", num1);
        System.out.print(" + ");
        System.out.format("%d", num2);
        System.out.print(" = ");
        System.out.format("%d", (num1 + num2));
        System.out.println();

        // Subtraktion
        System.out.format("%d", num1);
        System.out.print(" - ");
        System.out.format("%d", num2);
        System.out.print(" = ");
        System.out.format("%d", (num1 - num2));
        System.out.println();

        // Multiplikation
        System.out.format("%,d", num1);
        System.out.print(" * ");
        System.out.format("%,d", num2);
        System.out.print(" = ");
        System.out.format("%,d", (num1 * num2));
        System.out.println();

        // Division
        System.out.format("%d", num2);
        System.out.print(" / ");
        System.out.format("%d", num1);
        System.out.print(" = ");
        System.out.format("%d", (num2 / num1));
        System.out.println("\n");

        // Floats
        // Addition
        float num3 = num1;
        float num4 = num2;
        System.out.format("%.1f", num3);
        System.out.print(" + ");
        System.out.format("%.1f", num4);
        System.out.print(" = ");
        System.out.format("%.1f", (num3 + num4));
        System.out.println();

        // Subtraktion
        System.out.format("%.1f", num3);
        System.out.print(" - ");
        System.out.format("%.1f", num4);
        System.out.print(" = ");
        System.out.format("%.1f", (num3 - num4));
        System.out.println();

        // Multiplikation
        System.out.format("%,.1f", num3);
        System.out.print(" * ");
        System.out.format("%,.1f", num4);
        System.out.print(" = ");
        System.out.format("%,.1f", (num3 * num4));
        System.out.println();

        // Division
        System.out.format("%.1f", num3);
        System.out.print(" / ");
        System.out.format("%.1f", num4);
        System.out.print(" = ");
        System.out.format("%.1f", (num3 / num4));

    }

}
