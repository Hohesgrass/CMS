import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerList {
    ArrayList<Customer> cl = new ArrayList<Customer>();
    public CustomerList(){

    }

    public void addCustomerToList(Customer e){
        cl.add(e);
    }

    public void addFromCSVFile(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        scanner.nextLine();

        int i = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(",");
            addCustomerToList(new Customer(
                            Integer.parseInt(values[0]),
                            values[1],
                            Double.parseDouble(values[2]),
                            Integer.parseInt(values[3]),
                            Boolean.parseBoolean(values[4]),
                            values[5],
                            Double.parseDouble(values[6]),
                            i));
            i++;
        }
        scanner.close();
    }
    public CustomerList filterBySex(String sex){
        CustomerList clSex = new CustomerList();
        for (Customer e : cl) {
            if (e.getSex().equals(sex)){
                clSex.addCustomerToList(e);
            }
        }
        return clSex;
    }
    public CustomerList filterByRegion(String region){
        CustomerList clRegion = new CustomerList();
        for (Customer e : cl) {
            if (e.getRegion().equals(region)){
                clRegion.addCustomerToList(e);
            }
        }
        return clRegion;
    }

    public CustomerList filterByAge(int age){
        CustomerList clAge = new CustomerList();
        for (Customer e : cl) {
            if (e.getAge() == age){
                clAge.addCustomerToList(e);
            }
        }
        return clAge;
    }

    public CustomerList filterBySmoker(boolean smoker){
        CustomerList clSmoker = new CustomerList();
        for (Customer e : cl) {
            if (e.isSmoker() == smoker){
                clSmoker.addCustomerToList(e);
            }
        }
        return clSmoker;
    }
    /*public ArrayList<Customer> sortByCharges(){

    }*/

    /*public ArrayList<Customer> sortByBMI(){

    }*/

    public Customer searchById(int id){
        for (Customer e : cl) {
            if (e.getId() == id){
                return e;
            }
        }
        return null;
    }

    public void deleteCustomerById(int id){
        cl.removeIf(e -> e.getId() == id);
        /*
        for (Customer e : cl){
            if (e.getId() == id){
                cl.remove(e);
            }
        }
        */
    }

    public void addCustomer(Customer customer){
        int id = getMissingId();
        if (id > cl.size()){
            customer.setId(id-1);
            cl.add(customer);
        } else {
            customer.setId(id);
            cl.add(id-1,customer);
        }
    }
    public ArrayList<Customer> getCustomerList() {
        return cl;
    }

    private int getMissingId(){
        int counter = 1;
        for (Customer e : cl) {
            if(e.getId() != counter){
                return counter;
            }
            counter++;
        }
        return cl.size()+2;
    }
}
