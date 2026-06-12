import java.util.ArrayList;
import java.util.Scanner;

class Bill {
    private ArrayList<Item> items;
    private static final double GST_RATE = 0.05; // 5% GST

    public Bill() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateSubtotal() {
        double subtotal = 0;

        for (Item item : items) {
            subtotal += item.getTotalPrice();
        }

        return subtotal;
    }

    public double calculateGST() {
        return calculateSubtotal() * GST_RATE;
    }

    public double calculateTotal() {
        return calculateSubtotal() + calculateGST();
    }

    public String generateReceipt() {
        StringBuilder receipt = new StringBuilder();

        receipt.append("\n====================================\n");
        receipt.append("       GROCERY BILL RECEIPT\n");
        receipt.append("====================================\n");
        receipt.append(String.format("%-15s %-8s %-8s %-10s\n",
                "Item", "Price", "Qty", "Total"));

        for (Item item : items) {
            receipt.append(String.format("%-15s %-8.2f %-8d %-10.2f\n",
                    item.getName(),
                    item.getPrice(),
                    item.getQuantity(),
                    item.getTotalPrice()));
        }

        receipt.append("------------------------------------\n");
        receipt.append(String.format("Subtotal : ₹%.2f\n", calculateSubtotal()));
        receipt.append(String.format("GST (5%%) : ₹%.2f\n", calculateGST()));
        receipt.append(String.format("Total    : ₹%.2f\n", calculateTotal()));
        receipt.append("====================================\n");
        receipt.append("   Thank You For Shopping With Us!\n");
        receipt.append("====================================\n");

        return receipt.toString();
    }
}
class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}
public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bill bill = new Bill();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter details for Item " + i);

            System.out.print("Item Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Item item = new Item(name, price, quantity);
            bill.addItem(item);
        }

        System.out.println(bill.generateReceipt());

    }    
}
