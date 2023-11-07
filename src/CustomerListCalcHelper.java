import java.util.ArrayList;

public class CustomerListCalcHelper {

    public CustomerListCalcHelper(){

    }

    public double getMaximum(CustomerList cl, String sortBy){
        ArrayList<Customer> cla = cl.getCustomerList();

        double max = 0;
        double current = 0;
        for (Customer customer : cla) {
            current = switch (sortBy) {
                case "age" -> customer.getAge();
                case "children" -> customer.getChildren();
                case "bmi" -> customer.getBmi();
                case "charges" -> customer.getCharges();
                default -> current;
            };

            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    public double getMinimum(CustomerList cl, String sortBy){
        ArrayList<Customer> cla = cl.getCustomerList();

       double min = switch (sortBy) {
            case "age" -> cla.get(0).getAge();
            case "children" -> cla.get(0).getChildren();
            case "bmi" -> cla.get(0).getBmi();
            case "charges" -> cla.get(0).getCharges();

           default -> throw new IllegalStateException("Unexpected value: " + sortBy);
       };
        double current = 0;
        for (Customer customer : cla) {
            current = switch (sortBy) {
                case "age" -> customer.getAge();
                case "children" -> customer.getChildren();
                case "bmi" -> customer.getBmi();
                case "charges" -> customer.getCharges();
                default -> current;
            };

            if (current < min) {
                min = current;
            }
        }
        return min;
    }

    public double getAverage(CustomerList cl, String sortBy){
        ArrayList<Customer> cla = cl.getCustomerList();
        double sum = 0;

        for (Customer customer : cla) {
            sum += switch (sortBy) {
                case "age" -> customer.getAge();
                case "children" -> customer.getChildren();
                case "bmi" -> customer.getBmi();
                case "charges" -> customer.getCharges();
                default -> sum;
            };
        }

        return (sum / cla.size());

    }
}
