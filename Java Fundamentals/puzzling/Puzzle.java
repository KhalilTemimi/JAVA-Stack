import java.util.ArrayList;
import java.util.Random;

public class Puzzle{
    Random rand = new Random();
    public ArrayList<Integer> getRandomRolls(){
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        for (int i=0; i<10; i++){
            tenRolls.add(rand.nextInt(20));
        }
        return tenRolls;
    }
    public String getRandomLetter(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] letters = new String[26];
        for (int i=0; i<26; i++){
            letters[i]= String.valueOf(alphabet.charAt(i));
        }
        return letters[rand.nextInt(26)];
    }
    public String generatePassword(){
        String psw = "";
        for(int i=0 ;i<8; i++){
           psw += getRandomLetter(); 
        }
        return psw;
    }
    public String[] getNewPasswordSet(int number){
        String[] pswArray = new String[number];
        for (int i=0; i<number; i++){
            pswArray[i]=generatePassword();
        }
        return pswArray;
    }
    public ArrayList<Integer> shuffleArray(ArrayList<Integer> array){
        for(int i=0; i<array.size(); i++){
            int n = rand.nextInt(array.size());
            int m = rand.nextInt(array.size());
            int temp = array.get(n);
            array.set(n, array.get(m));
            array.set(m, temp);
        }
        return array;
    }
}