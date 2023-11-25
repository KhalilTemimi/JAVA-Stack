import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(){
        int sum = 0;
        int numWeeks = 10;
        for (int i = 0 ; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices){
        double total = 0;
        for( double price : prices){
            total += price;
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuItem){
        for (String item : menuItem){
            System.out.println(menuItem.indexOf(item)+" "+ item);
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s \n",userName);
        System.out.printf("There are %s people in front of you \n",customers.size());
        customers.add(userName);
        System.out.println(customers);
    }
    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        int count = 0;
        int order = 1;
        double discount = 0;
        while (count < maxQuantity){
            System.out.printf(order + " - $ " + ((price*order)-discount) +"\n");
            discount += 0.5;
            order ++;
            count ++;
        }
    }
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if (menuItems.size() != prices.size()){
            System.out.println("both Array must have same the same size.");
            return false;
        }else{
           for (int i=0,j=0; i< menuItems.size() && j< prices.size(); i++,j++ ){
                System.out.println(menuItems.indexOf(menuItems.get(i))+" "+ menuItems.get(i)+" -- $ "+prices.get(j));
            }
            return true;
        }
    }
     /* Sensei bonus:
    Make a method addCustomers where a barista can enter multiple customers. 
    Hint: You can use a while loop and ask the user to type q when they are finished entering names.
    */

    public void addCustomers(ArrayList<String> customerList) {
        boolean finished = false;
        String input;
        while (!finished) {
            System.out.println("Please enter a customer name or press Q to quit:");
            input = System.console().readLine();
            if (input.equals("Q")) {
                finished = true;
                return;
            }
            customerList.add(input);
            System.out.printf("%s was added to the list.", input);
            System.out.println(customerList);
        }
    }

}
