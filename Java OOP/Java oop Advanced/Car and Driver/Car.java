public class Car {

    private int gas = 10;

    public void displayGas(){
        System.out.println("Gas remaining: "+ gas +"/10");
    }

    public int getGas(){
        return gas;
    }
    public void setGas(int gas){
        this.gas = gas;
    }
}