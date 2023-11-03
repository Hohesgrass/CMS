import java.util.Arrays;
import java.util.Scanner;

public class UE2UI {

    Scanner scan = new Scanner(System.in);
    static boolean running = true;
    public UE2UI() {

        while (running) {
            printUI();
            int input = scan.nextInt();
            if (input > 6){
                System.out.println("wrong input");
            }
            switch (input) {
                case 1 -> printArray();
                case 2 -> searchArray();
                case 3 -> createElementInArray();
                case 4 -> deleteElementInArray();
                case 5 -> getStatisticsOfArray();
                case 6 -> exit();
            }

        }
        System.exit(0);
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
        System.out.println("1. Ausgabe des Arrays");
        System.out.println("2. Suche eines Elements im Array");
        System.out.println("3. Hinzufügen eines Elements im Array");
        System.out.println("4. Löschen eines Elements im Array");
        System.out.println("5. Ausgabe von Statistiken des Arrays");
        System.out.println("6. Exit");
    }
}
