import java.util.ArrayList;

public class CustomerListCalcHelper {

    public CustomerListCalcHelper(){

    }

    public int getMaximumAge(CustomerList cl){
        ArrayList<Customer> cla = cl.getCustomerList();

        int max = 0;
        for (int i = 1; i < cla.size(); i++) {
            int current = cla.get(i).getAge();
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}
