package controller;

import Model.User;
import Model.category.CategoryModel;
import Model.category.CategoryServiceResponseModel;
import Model.transaction.TransactionModel;
import Model.transaction.TransactionServiceResponseModel;

public class UpdateAccount {

    public static TransactionServiceResponseModel addTransaction(TransactionModel transactionModel) {
        boolean isSuccess = User.getUser().getAccount().addNewTransaction(transactionModel);
        if (isSuccess) {
            return new TransactionServiceResponseModel(true, User.getUser().getAccount().getLastUpdatedTransaction());
        } else {
            return new TransactionServiceResponseModel(false, User.getUser().getAccount(), "can't add account");
        }

    }

    public static TransactionServiceResponseModel removeTransaction(String ID) {
        boolean isSuccess = User.getUser().getAccount().removeTransaction(ID);
        if (isSuccess) {
            return new TransactionServiceResponseModel(true, User.getUser().getAccount());
        } else {
            return new TransactionServiceResponseModel(false, User.getUser().getAccount(), "can't delete account");
        }
    }

    public static TransactionServiceResponseModel getAllTransaction() {
        return new TransactionServiceResponseModel(true, User.getUser().getAccount(), "");
    }

    // for categories

    public static CategoryServiceResponseModel addCategory(CategoryModel categoryModel) {
        boolean isSuccess = User.getUser().getAccount().addNewCategory(categoryModel);
        if (isSuccess) {
            return new CategoryServiceResponseModel(true, User.getUser().getAccount().getCategories(), User.getUser().getAccount().getLastUpdatedCategory());
        } else {
            return new CategoryServiceResponseModel(false, "can't add category");
        }

    }

    public static CategoryServiceResponseModel removeCategory(String ID) {
        boolean isSuccess = User.getUser().getAccount().removeCategory(ID);
        if (isSuccess) {
            return new CategoryServiceResponseModel(true, User.getUser().getAccount().getCategories());
        } else {
            return new CategoryServiceResponseModel(false, "can't delete category");
        }
    }

    public static CategoryServiceResponseModel getAllCategories() {
        return new CategoryServiceResponseModel(true, User.getUser().getAccount().getCategories());
    }
}
