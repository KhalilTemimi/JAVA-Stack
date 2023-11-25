import java.util.ArrayList;

public class coffeeKiosk {
    
    ArrayList<Item> menu;
    ArrayList<Order> orders;

    public coffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price){
        Item item = new Item(name, price);
        menu.add(item);
        item.setIndex(menu.indexOf(item));
    }

    public void addMenuItemManually(){
        System.out.println("please enter the Item name or q to quit:");
        String itemName = System.console().readLine();
        while(!itemName.equals("q")){
            System.out.println("please enter the Item price:");
            String itemPrice = System.console().readLine();
            Item item = new Item (itemName,Double.parseDouble(itemPrice));
            menu.add(item);
            item.setIndex(menu.indexOf(item));
            System.out.println("please enter the Item name or q to quit:");
            itemName = System.console().readLine();
        }
    }

    public void displayMenu(){
        for(Item item : menu){
            System.out.println(item.getIndex() +" "+ item.getName()+" -- $"+ item.getPrice()+"\n");
        }
    }

    public void newOrder(){
        System.out.println("please enter customer name for new order:");
        String name = System.console().readLine();
        Order order = new Order(name);
        displayMenu();
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        while(!itemNumber.equals("q")){
            int choice = Integer.parseInt(itemNumber);
            for(Item item : menu){
                if (item.getIndex() == choice){
                    order.addItem(item);
                }
            }
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        order.display();
    }
}
