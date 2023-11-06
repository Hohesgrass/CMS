public class CalculatingHelper {
    public CalculatingHelper() {

    }
    public String calculateQuadraticRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "Die Lösungen sind: x1 = " + root1 + " und x2 = " + root2;
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return "Die Lösung ist: x = " + root;
        } else {
            return "Die Gleichung hat keine reellen Lösungen.";
        }
    }

    public int getBiggestNumber(int number1, int number2, int number3) {
        int biggestNumber = Math.max(number1, number2);

        if (number3 > biggestNumber) {

            biggestNumber = number3;

        }
        return biggestNumber;
    }
    public static void calculate(int k, int o) {

        System.out.println("Summe: " + (k + o));

        System.out.println("Subtraktion: " + (k - o));

        System.out.println("Mutiplikation: " + (k * o));

        System.out.println("Division: " + (k / o));
    }

     public String greet(String name) {

        return "Hi " + name;

    }

    private static void greeting(String name) {



        System.out.println("Hi " + name);



    }
    public String positivNullNegativ(int i) {

        if (i > 0) {

            return "positiv";

        } else if (i == 0) {

            return "null";

        } else {

            return "negativ";

        }
    }


}
