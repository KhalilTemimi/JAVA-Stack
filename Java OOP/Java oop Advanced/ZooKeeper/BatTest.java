public class BatTest {
    public static void main(String[] args) {
        Bat bat = new Bat();

        bat.displayEnergie();
        
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();

        bat.eatHuman();
        bat.eatHuman();

        bat.fly();
        bat.fly();

        bat.displayEnergie();
    }
    
}
