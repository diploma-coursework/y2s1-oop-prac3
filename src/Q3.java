import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockItem[] stockItems = {
                new StockItem("Apples", 2.00),
                new StockItem("Bananas", 2.00),
                new StockItem("Oranges", 2.50),
                new StockItem("Grapes", 5.00),
                new StockItem("Mangoes", 5.00)
        };
        System.out.println("Item       Quantity");

        // get quantity input
        for (StockItem item : stockItems) {
            System.out.printf("%-10s ", item.itemName);
            item.quantity = scanner.nextInt();
        }

        // print values
        System.out.println("\nItem       Quantity   Value (MYR)");
        for (StockItem item : stockItems) {
            item.printValue();
        }
    }

    private static class StockItem {
        public String itemName;
        public int quantity;
        private final double unitCost;

        StockItem(String itemName, double unitCost) {
            this.itemName = itemName;
            this.unitCost = unitCost;
        }

        public void printValue() {
            if (this.quantity == 0) return;

            System.out.printf("%-10s %-10d %.2f\n",
                    this.itemName,
                    this.quantity,
                    this.unitCost * (double) this.quantity
            );
        }
    }
}


