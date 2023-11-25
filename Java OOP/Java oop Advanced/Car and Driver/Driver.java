public class Driver extends Car {

    public void drive(){
        int amountOfGas = getGas();
        if (amountOfGas>0) {
            System.out.println("You drive the car");
            amountOfGas -=1;
            setGas(amountOfGas);
            displayGas();
        }else{
            System.out.println("Game over! Your out of gas!");
        }
    }
    
    public void Boost(){
        int amountOfGas = getGas();
        if (amountOfGas>0) {
            if(amountOfGas>3){
                System.out.println("You just activated the sports mode");
                amountOfGas -=3;
                setGas(amountOfGas);
                displayGas();
            }else{
                System.out.println("You don't have enough fuel to activate the sports mode");
            }
        }else{
            System.out.println("Game over! Your out of gas!");
        }
    }

    public void refuel(){
        int amountOfGas = getGas();
        if(amountOfGas <= 8){
            System.out.println("You refueled the car");
            amountOfGas +=2;
            setGas(amountOfGas);
            displayGas();
        }else{
            System.out.println("You have enough fuel!");
        }
    }
}
