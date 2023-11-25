import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args){
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.name = "Mocha";
        item1.price = 3.5;
        item2.name = "DripCoffe";
        item2.price = 2.6;
        item3.name = "Latte";
        item3.price = 3.8;
        item4.name = "Cappucino";
        item4.price = 4.3;

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cindhuri";
        order2.name = "Sam";
        order3.name = "Jimmy";
        order4.name = "Noah";

        order2.items.add(0, item1);
        order2.total += item1.price;

        order3.items.add(0, item4);
        order3.total += item4.price;

        order4.items.add(0, item3);
        order4.total += item3.price;

        order1.ready = true;

        order2.items.add(item3);
        order2.total += item3.price;

        order3.ready = true;

        System.out.println(order1);
        System.out.println(order1.total);

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("ready: %s\n\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("ready: %s\n\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("ready: %s\n\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("ready: %s\n\n", order4.ready);
    }
}
