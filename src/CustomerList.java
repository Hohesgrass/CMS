import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerList {
    ArrayList<Customer> cl = new ArrayList<Customer>();


    public CustomerList(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        scanner.nextLine();

        int i = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(",");
            cl.add(new Customer(
                            Integer.parseInt(values[0]),
                            values[1],
                            Double.parseDouble(values[2]),
                            Integer.parseInt(values[3]),
                            Boolean.parseBoolean(values[4]),
                            values[5],
                            Double.parseDouble(values[6])));
        }
        scanner.close();

    }

    public ArrayList<Customer> sortBySex(String sex){


    }
    public ArrayList<Customer> sortByRegion(String Region){


    }

    public Customer searchById(String id){


    }

    public ArrayList<Customer> DeleteCustomerById(String id){


    }

    public ArrayList<Customer> AddCustomerAtIndex(String Index, Customer customer){


    }
}
