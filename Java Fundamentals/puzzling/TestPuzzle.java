import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzle {
    public static void main(String[] args) {
        Puzzle generator = new Puzzle();

        ArrayList<Integer> randomRolls = generator.getRandomRolls();
        System.out.println(randomRolls);

        String randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);

        String psw = generator.generatePassword();
        System.out.println(psw);

        String[] pswArray = generator.getNewPasswordSet(8);
        // la fonction Array.toString nous permet d'afficher le contenue d'une maniere lisible
        System.out.println(Arrays.toString(pswArray));

        ArrayList<Integer> numbers = generator.shuffleArray(randomRolls);
        System.out.println(numbers);
    }
}
