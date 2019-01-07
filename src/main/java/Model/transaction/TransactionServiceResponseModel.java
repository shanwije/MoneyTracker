package Model.transaction;

import Model.Account;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
public class TransactionServiceResponseModel {
    private boolean success;
    private Account account;
    private String error;
    private TransactionModel lastUpdatedTransaction;


    public TransactionServiceResponseModel(boolean success, Account account) {
        this.success = success;
        this.account = account;
    }

    public TransactionServiceResponseModel(boolean success, Account account, String error) {
        this.success = success;
        this.account = account;
        this.error = error;
    }

    public TransactionServiceResponseModel(boolean success, TransactionModel model) {
        this.success = success;
        this.lastUpdatedTransaction = model;
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

    public TransactionModel getLastUpdatedTransaction() {
        return lastUpdatedTransaction;
    }

    public void setLastUpdatedTransaction(TransactionModel lastUpdatedTransaction) {
        this.lastUpdatedTransaction = lastUpdatedTransaction;
    }
}
