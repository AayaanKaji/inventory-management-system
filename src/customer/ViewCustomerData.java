package src.customer;

import java.util.List;

public class ViewCustomerData {
    public static void printAllCustomerInfo() {
        List<String> lines = RetriveCustomerData.readCustomerInfo();
        for (String line : lines) {
            String[] customer = line.split(", ");
            System.out.println("customer_id\t" + "customer_name\t" + "balance\t" + "number_of_successful_purchases\t" + "number_of_failed_purchases\t" + "total_spending");
            System.out.println(customer[0] + "\t" + customer[1] + "\t" + 
                               customer[2] + "\t" + customer[3] + "\t" +
                               customer[4] + "\t" + customer[5]);
        }
    }

    public static void printCustomerProfile(String customerId) {
        List<String> lines = RetriveCustomerData.readCustomerInfo();
        for (String line : lines) {
            String[] customer = line.split(", ");
            if(customerId.equals(customer[0])) {
                System.out.println("Customer Id: " +  customer[0] + "\t" + 
                                   "Customer Name: " +  customer[1] + "\t" + 
                                   "Balance: " + customer[2] + "\t" + 
                                   "Successful Purchases: " + customer[3] + "\t" +
                                   "Failed Purchases: " + customer[4] + "\t" + 
                                   "Total Spending: " + customer[5]);
            }
        }
    }
}
