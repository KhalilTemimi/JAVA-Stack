public class Mammal {

    public int energyLevel;

    public Mammal(){
        this.energyLevel = 100;
    }

    public int displayEnergie(){
        System.out.println("The animal energy level is: "+ energyLevel);
        return energyLevel;
    }
}