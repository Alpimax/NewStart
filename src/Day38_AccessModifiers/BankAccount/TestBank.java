package Day38_AccessModifiers.BankAccount;

public class TestBank {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(2132215515L, 12312312);

//        account1.balance = 100000;
//        account1.setBalance(100000);
        // balance is private and there is no setter method, so I can't change the values

        System.out.println(account1.getAccountNumber());

        System.out.println(account1.getBalance());
    }

}