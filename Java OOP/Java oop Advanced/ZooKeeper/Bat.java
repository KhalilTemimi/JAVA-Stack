public class Bat extends Mammal {

    public Bat(){
        energyLevel = 300;
    }

    public void fly(){
        System.out.println("woovv...woovv..woovv...");
        energyLevel -= 50;
    }
    public void eatHuman(){
        System.out.println("aaahhh....jwkdfsqjdfhkjshgkj");
        energyLevel =+ 25;
    }
    public void attackTown(){
        System.out.println("town on fire... just imagine the sound :p");
        energyLevel -= 100;
    }
}
