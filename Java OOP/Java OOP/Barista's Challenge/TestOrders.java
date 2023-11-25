import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args){
        Item item1 = new Item("Mocha", 3.5);
        Item item2 = new Item("DripCoffe", 2.6);
        Item item3 = new Item("Latte", 3.8);
        Item item4 = new Item("Cappucino", 4.3);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Sam");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Noah");

        order1.addItem(item1);
        order1.addItem(item4);
        order2.addItem(item2);
        order2.addItem(item1);
        order3.addItem(item1);
        order3.addItem(item3);
        order4.addItem(item3);
        order4.addItem(item4);
        order5.addItem(item2);
        order5.addItem(item4);

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        order2.setReady(true);
        System.out.println(order2.getStatusMessage());

        System.out.println(order1.getOrderTotal());

    }
}
