public class Gorilla extends Mammal {
    
    public void throwSomeThing(){
        System.out.println("the Gorilla throw things");
        energyLevel -= 5;
    }
    public void eatBanans(){
        System.out.println("the Gorilla eat banans");
        energyLevel += 10;
    }
    public void climb(){
        System.out.println("the Gorilla climbed a tree");
        energyLevel -= 10;
    }
}
