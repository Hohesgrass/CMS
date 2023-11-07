import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
      String csvPath = "C:\\Users\\alexa\\Desktop\\csv\\insurance.csv";
        CustomerList cl = new CustomerList();
        cl.addFromCSVFile(csvPath);
        UE2UI ui = new UE2UI(cl);
    }
}