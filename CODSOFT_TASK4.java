import java.util.HashMap;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        HashMap<String, Double> currencyvalues = new HashMap<>();
        currencyvalues.put("USD", 1.0);
        currencyvalues.put("INR", 83.2);
        currencyvalues.put("EUR", 0.92);
        currencyvalues.put("GBP", 0.78);
        currencyvalues.put("JPY", 157.1);
        try(Scanner sc= new Scanner(System.in)){
        System.out.println("Available currencies: " + currencyvalues.keySet());
        System.out.print("Enter Your Base Currency: ");
        String basecurrency = sc.next().toUpperCase();
        System.out.print("Enter Your Target Currency: ");
        String targetcurrency = sc.next().toUpperCase();
        if (currencyvalues.containsKey(basecurrency) && currencyvalues.containsKey(targetcurrency)) {
        System.out.print("Enter the amount to be convert: ");
        double currency = sc.nextDouble();
            double basevalues = currencyvalues.get(basecurrency);
            double targetvalues =currencyvalues.get(targetcurrency);
            double convertedvalue = (currency / basevalues) * targetvalues;
            System.out.printf("Your Base Currency %s is converted to %s : %.2f\n", basecurrency, targetcurrency, convertedvalue);
            System.out.println("Thank You !!");
        } else {
            System.out.println("The Currency is currently available");
        }
        sc.close();
    }
    }
}
