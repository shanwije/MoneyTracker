package controller;

import Model.TransactionModel;
import Model.TransactionServiceResponseModel;
import Model.User;

public class UpdateAccount {

    public static TransactionServiceResponseModel addTransaction(TransactionModel transactionModel) {
        boolean isSuccess = User.getUser().getAccount().addNewTransaction(transactionModel);
        if (isSuccess) {
            return new TransactionServiceResponseModel(true, User.getUser().getAccount(), "");
        } else {
            return new TransactionServiceResponseModel(false, User.getUser().getAccount(), "can't add account");
        }

    }

    public static TransactionServiceResponseModel removeTransaction(String ID) {
        boolean isSuccess = User.getUser().getAccount().removeTransaction(ID);
        if (isSuccess) {
            return new TransactionServiceResponseModel(true, User.getUser().getAccount(), "");
        } else {
            return new TransactionServiceResponseModel(false, User.getUser().getAccount(), "can't delete account");
        }
    }

    public static TransactionServiceResponseModel getAllTransaction() {
        return new TransactionServiceResponseModel(true, User.getUser().getAccount(), "");
    }
}
