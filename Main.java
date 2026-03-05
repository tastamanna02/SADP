import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Notun Customer Add Korun ---");

        System.out.print("Customer ID din: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Customer er Nam din: ");
        String name = scanner.nextLine();

        System.out.print("Customer er Email din: ");
        String email = scanner.nextLine();

     
        System.out.print("Customer er Phone Number din: ");
        String phone = scanner.nextLine();

       
        System.out.print("Customer er Address din: ");
        String address = scanner.nextLine();

        Customer newCustomer = new Customer(id, name, email, phone, address);

        System.out.println("\n--- Customer Registration Shofol Hoyeche ---");
        System.out.println("ID: " + newCustomer.getCustomerId());
        System.out.println("Name: " + newCustomer.getName());
        System.out.println("Email: " + newCustomer.getEmail());
        System.out.println("Phone: " + newCustomer.getPhone());
        System.out.println("Address: " + newCustomer.getAddress());

        scanner.close();
    }
}
