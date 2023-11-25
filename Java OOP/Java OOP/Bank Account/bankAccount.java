import java.util.Random;

public class bankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int accountsNbr;
    private static double totalAmount;
    private static String accountId;

    private String randomAccountNbr(){
        Random rand = new Random();
        String m[] = new String[10];
        for (int i=0;i<10; i++){
            int number = rand.nextInt(10);
            m[i] = Integer.toString(number);
        }
        return (""+m[0]+m[1]+m[2]+m[3]+m[4]+m[5]+m[6]+m[7]+m[8]+m[9]);
    }
    // Autre solution pour random id de 10 chiffre
    //  private static int generateId(){
    //     Random randGenerator = new Random();
    //     int randomId = randGenerator.nextInt(1000000000)+ 999999999;
    //     return randomId;
    //  }
      
    public bankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        accountsNbr += 1;
        this.accountId = randomAccountNbr();
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }

    public void depositMoney (double amount, String account){
        if (account == "checking"){
            this.checkingBalance += amount;
            totalAmount += amount;
            System.out.println("Your deposit of $"+amount+" is successfully made your checking Balance is now $"+checkingBalance);
        }else if (account == "savings"){
            this.savingsBalance += amount;
            totalAmount += amount;
            System.out.println("Your deposit of $"+amount+" is successfully made your saving Balance is now $"+savingsBalance);
        }else{
            System.out.println("Account type non valid !");
        }
    }
    public void withdrawMoney(double amount, String account){
        if (account == "checking"){
            if(amount <= checkingBalance){
                this.checkingBalance -= amount;
                totalAmount -= amount;
                System.out.println("Your withdraw of $"+amount+" is successfully made your checking Balance is now $"+checkingBalance);
            }else{
                System.out.println("Your balance is unsufficient");
            }
        }else if (account == "savings"){
            if(amount <= savingsBalance){
                this.savingsBalance -= amount;
                totalAmount -= amount;
                System.out.println("Your withdraw of $"+amount+" is successfully made your saving Balance is now $"+savingsBalance);
            }else{
                System.out.println("Your balance is unsufficient");
            }
        }else{
            System.out.println("Account type non valid !");
        }
    }
    public static double getTotalAmount(){
        return totalAmount;
    }
    public static int getAccountNbr(){
        return accountsNbr;
    }
    public static String getAccountId(){
        return accountId;
    }
    

}