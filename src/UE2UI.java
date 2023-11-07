import java.util.Scanner;

public class UE2UI {
    CustomerList cl;
    CustomerListCalcHelper clh = new CustomerListCalcHelper();
    Scanner scan = new Scanner(System.in);
    static boolean running = true;
    public UE2UI(CustomerList cl) {
        this.cl = cl;
        while (running) {
            printUI();
            int input = scan.nextInt();
            switch (input) {
                case 1 -> outputList("null", "null");
                case 11 -> outputList("null", "male");
                case 111 -> outputList("southwest", "male");
                case 112 -> outputList("southeast", "male");
                case 12 -> outputList("null", "female");
                case 121 -> outputList("southwest", "female");
                case 122 -> outputList("southeast", "female");
                case 13 -> outputList("southwest", "null");
                case 14 -> outputList("southeast", "null");

                case 21 -> outputAverage("null", "male");
                case 211 -> outputAverage("southwest", "male");
                case 212 -> outputAverage("southeast", "male");
                case 22 -> outputAverage("null", "female");
                case 221 -> outputAverage("southwest", "female");
                case 222 -> outputAverage("southeast", "female");
                case 23 -> outputAverage("southwest", "null");
                case 24 -> outputAverage("southeast", "null");

                case 3 -> searchCustomer();
                case 4 -> deleteCustomer();
                case 5 -> addCustomer();

                case 6 -> sortByAge("id");
                case 61 -> sortByAge("age");
                case 62 -> sortByAge("children");
                case 63 -> sortByAge("sex");
                case 64 -> sortByAge("region");
                case 65 -> sortByAge("bmi");
                case 66 -> sortByAge("charges");
            }

        }
        System.exit(0);
    }

    private void addCustomer() {
        System.out.println("Enter the age of the customer: ");
        int age = scan.nextInt();

        System.out.println("Enter the sex of the customer: ");
        String sex = scan.nextLine();

        System.out.println("Enter the bmi of the customer: ");
        double bmi = scan.nextInt();

        System.out.println("Enter the children of the customer: ");
        int children = scan.nextInt();

        System.out.println("Smoker? true/false");
        boolean smoker = Boolean.parseBoolean(scan.nextLine());

        System.out.println("Enter the region of the customer: ");
        String region = scan.nextLine();

        System.out.println("Enter the charges of the customer: ");
        double charges = scan.nextInt();

        cl.addCustomer(new Customer(age, sex, bmi, children, smoker, region, charges, 10));

        System.out.println("Customer added.");
    }

    private void deleteCustomer() {
        System.out.println("Enter ID of the customer you want to delete");
        int i = scan.nextInt();
        cl.deleteCustomerById(i);
        System.out.println("Customer deleted.");
    }

    private void outputAverage(String region, String sex) {
        CustomerList al;
        if(sex.equals("null")){
            if (region.equals("null")) {
                al = cl;
                printAutomatedReport(al, "null");
            } else {
                al = cl.filterByRegion(region);
                printAutomatedReport(al, "null");
            }
        } else {
            if (region.equals("null")) {
                al = cl.filterBySex(sex);
                printAutomatedReport(al, sex);
            } else {
                al = cl.filterBySex(sex).filterByRegion(region);
                printAutomatedReport(al, sex);
            }
        }
    }

    private void printAutomatedReport(CustomerList al, String sex){
        if (sex.equals("null")){
            System.out.println("There are " + al.getCustomerList().size() + " customers");
        } else {
            System.out.println("There are " + al.getCustomerList().size() + " " + sex + " customers");
        }
        System.out.println("The average age is " + clh.getAverage(al, "age") + ". The maximum age is "+ clh.getMaximum(al, "age") + ". The minimum age is " + clh.getMinimum(al, "age"));
        System.out.println("The average number of children is " + clh.getAverage(al, "children") + ". The maximum number of children is "+ clh.getMaximum(al, "children") + ". The minimum number of children is " + clh.getMinimum(al, "children"));
        System.out.println("The average bmi is " + clh.getAverage(al, "bmi") + ". The maximum bmi is "+ clh.getMaximum(al, "bmi") + ". The minimum bmi is " + clh.getMinimum(al, "bmi"));
        System.out.println("The average amount of charges is " + clh.getAverage(al, "charges") + ". The maximum amount of charges is "+ clh.getMaximum(al, "charges") + ". The minimum amount of charges is " + clh.getMinimum(al, "charges"));
    }

    private void outputList(String region, String sex) {
        if(sex.equals("null")){
            if (region.equals("null")) {
                for (Customer c : cl.getCustomerList()) {
                    System.out.println(c.toString());
                }
            } else {
                for (Customer c : cl.filterByRegion(region).getCustomerList()) {
                    System.out.println(c.toString());
                }
            }
        } else {
            if (region.equals("null")) {
                for (Customer c : cl.filterBySex(sex).getCustomerList()) {
                    System.out.println(c.toString());
                }
            } else {
                for (Customer c : cl.filterBySex(sex).filterByRegion(region).getCustomerList()) {
                    System.out.println(c.toString());
                }
            }
        }
    }

    private void searchCustomer(){
        System.out.println("Enter ID of the customer");
        int i = scan.nextInt();
        System.out.println(cl.searchById(i));
    }

    private void sortByAge(String sortBy){
        switch (sortBy) {
            case "age" -> {
                for (Customer e : cl.sortByAge()) {
                    System.out.println(e.toString());
                }
            }
            case "children" -> {
                for (Customer e : cl.sortByChildren()) {
                    System.out.println(e.toString());
                }
            }
            case "sex" -> {
                for (Customer e : cl.sortBySex("female")) {
                    System.out.println(e.toString());
                }
            }
            case "bmi" -> {
                for (Customer e : cl.sortByBmi()) {
                    System.out.println(e.toString());
                }
            }
            case "charges" -> {
                for (Customer e : cl.sortByCharges()) {
                    System.out.println(e.toString());
                }
            }
            case "id" -> {
                for (Customer e : cl.sortById()) {
                    System.out.println(e.toString());
                }
            }
            case "region" -> {
                for (Customer e : cl.sortByRegion("southwest")) {
                    System.out.println(e.toString());
                }
            }
        }

    }

    private void exit() {
        running = false;
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
        System.out.println("3 - Search customer by ID");
        System.out.println("4 - Delete customer by ID");
        System.out.println("5 - Add customer");
        System.out.println("6 - Sort by ID");
        System.out.println("    61 - By age | 62 - By number of children | 63 - By sex | 64 - By region | 65 - By bmi | 66 - By charges");
        System.out.println("Enter the number corresponding to the answer: ");
    }
}
