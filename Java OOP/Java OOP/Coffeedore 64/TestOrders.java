public class TestOrders {
    public static void main(String[] args){
        
        coffeeKiosk coffeeKiosk = new coffeeKiosk();

        // coffeeKiosk.addMenuItem("Banana", 2);
        // coffeeKiosk.addMenuItem("Coffee", 1.5);
        // coffeeKiosk.addMenuItem("Latte", 4.5);
        // coffeeKiosk.addMenuItem("Cappucino", 3);
        // coffeeKiosk.addMenuItem("Muffin", 4);
        
        coffeeKiosk.addMenuItemManually();

        coffeeKiosk.newOrder();

    }
}
