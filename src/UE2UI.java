import java.util.Arrays;
import java.util.Scanner;

public class UE2UI {
    CustomerList cl = new CustomerList();
    CustomerListCalcHelper clh = new CustomerListCalcHelper();
    Scanner scan = new Scanner(System.in);
    static boolean running = true;
    public UE2UI(CustomerList cl) {
        this.cl = cl;
        while (running) {
            printUI();
            int input = scan.nextInt();
            switch (input) {
                case 1 -> printArray();
                case 2 -> searchArray();
                case 3 -> createElementInArray();
                case 4 -> deleteElementInArray();
                case 5 -> getStatisticsOfArray();
                case 61 -> sortByAge();
            }

        }
        System.exit(0);
    }

    private void sortByAge(){
        System.out.println(clh.getMaximumAge(cl));
        for (Customer e : cl.sortByAge()) {
            System.out.println(e.toString());
        }
    }

    private void exit() {
        running = false;
    }

    private void getStatisticsOfArray() {

    }

    private void deleteElementInArray() {

    }

    private void createElementInArray() {

    }

    private void searchArray() {


    }

    private void printArray() {

    }


    public void printUI(){
        System.out.println("1 - Output of all clients");
        System.out.println("    11 - All male clients | 111 - All male clients in the southwest | 112 - All male clients in the southeast");
        System.out.println("    12 - All female clients | 121 - All female clients in the southwest | 122 - All female clients in the southeast");
        System.out.println("    13 - All customers in the southwest");
        System.out.println("    14 - All customers in the southeast");
        System.out.println("2 - Automated Report");
        System.out.println("    21 - All male customers | 211 - All male customers in the southwest | 212 - All male customers in the southeast");
        System.out.println("    22 - All female customers | 221 - All female customers in the southwest | 222 - All female customers in the southeast");
        System.out.println("    23 - All customers in the southwest");
        System.out.println("    24 - All customers in the southeast");
        System.out.println("3 - Search customer");
        System.out.println("4 - Delete customer by ID");
        System.out.println("5 - Add customer");
        System.out.println("6 - Sort by ID");
        System.out.println("    61 - By age | 62 - By number of children | 63 - By sex | 64 - By region | 65 - By bmi | 66 - By charges");
        System.out.println("Enter the number corresponding to the answer: ");
    }
}
