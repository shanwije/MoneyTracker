package Model;

public class User {

    private static User user = new User();
    private Account account;

    private User() {
        account = new Account();
    }

    public static User getUser() {
        return user;
    }

    public Account getAccount() {
        return account;
    }
}
