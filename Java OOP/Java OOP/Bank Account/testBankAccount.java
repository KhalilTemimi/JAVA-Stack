public class testBankAccount {
    public static void main(String[] args) {
        bankAccount account1 = new bankAccount();
        System.out.println(bankAccount.getAccountNbr());
        System.out.println(bankAccount.getAccountId());
        bankAccount account2 = new bankAccount();
        System.out.println(bankAccount.getAccountNbr());
        System.out.println(bankAccount.getAccountId());

        account1.depositMoney(100, "checking");
        account1.depositMoney(150, "savings");
        account2.depositMoney(350,"checking");
        account2.depositMoney(50, "savings");

        System.out.println(bankAccount.getTotalAmount());

        account1.withdrawMoney(25,"checking");
        account2.withdrawMoney(100,"savings");

        System.out.println(bankAccount.getTotalAmount());
        
    }
    
}
