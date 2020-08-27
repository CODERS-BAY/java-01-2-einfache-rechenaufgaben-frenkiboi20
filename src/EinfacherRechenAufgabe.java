public class EinfacherRechenAufgabe {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 1;
        System.out.format("%d", num1);
        System.out.print(" + ");
        System.out.format("%d", num2);
        System.out.print(" = ");
        System.out.format("%d", num1+num2);
        System.out.println();
        float num3 = 1.0f;
        float num4 = 3.0f;
        System.out.format("%.1f", num3);
        System.out.print(" + ");
        System.out.format("%.1f", num4);
        System.out.print(" = ");
        System.out.format("%.1f", (num3+num4));

    }


}
