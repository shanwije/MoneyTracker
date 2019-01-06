package Model;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
public class TransactionServiceResponseModel {
    private boolean success;
    private Account account;
    private String error;

    public TransactionServiceResponseModel() {

    }

    public TransactionServiceResponseModel(boolean success, Account account, String error) {
        this.success = success;
        this.account = account;
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
