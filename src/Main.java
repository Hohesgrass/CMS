import java.io.FileNotFoundException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String csvPath = "C:\\Users\\alexa\\Desktop\\csv\\insurance.csv";
        CustomerList cl = new CustomerList();
        cl.addFromCSVFile(csvPath);
        //cl.deleteCustomerById(13);
        //cl.addCustomer(new Customer(23,"male", 32.11, 233, true, "husoland", 2323.223, 112));
        for (Customer e : cl.filterByRegion("southwest").filterBySex("male").filterByAge(20).getCustomerList()) {
            System.out.println(e.toString());
        }

    }
}