package Model;

public class User {

    private Account account;
    private static User user = new User();

    private User(){
        account = new Account();
    }

    public static User getUser(){
        return user;
    }

    public Account getAccount() {
        return account;
    }
}
