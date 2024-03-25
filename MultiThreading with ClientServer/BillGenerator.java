import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String name;
    int quantity;
    double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotal() {
        return quantity * price;
    }
}

class Bill {
    ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getTotal();
        }
        return total;
    }

    public void generateBill() {
        System.out.println("\n********** Bill **********");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Item", "Quantity", "Price", "Total");
        for (Item item : items) {
            System.out.printf("%-20s %-10d %-10.2f %-10.2f\n", item.name, item.quantity, item.price, item.getTotal());
        }
        System.out.println("***************************");
        System.out.printf("Total: %.2f\n", calculateTotal());
        System.out.println("***************************\n");
    }
}

public class BillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bill bill = new Bill();

        while (true) {
            System.out.print("Enter item name (or 'exit' to finish): ");
            String itemName = scanner.next();

            if (itemName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter price per unit: ");
            double price = scanner.nextDouble();

            Item item = new Item(itemName, quantity, price);
            bill.addItem(item);
        }

        bill.generateBill();
        System.out.println("Thank you for shopping with us!");
    }
}
