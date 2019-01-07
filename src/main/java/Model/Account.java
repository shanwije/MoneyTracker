package Model;

import Model.category.CategoryModel;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
public class Account {

    private List<TransactionModel> transactions;
    private List<CategoryModel> categories;

    private TransactionModel lastUpdatedTransaction;
    private CategoryModel lastUpdatedCategory;

    Account() {
        transactions = new ArrayList<>();
        categories = new ArrayList<>();
    }

    public TransactionModel getLastUpdatedTransaction() {
        return lastUpdatedTransaction;
    }

    public void setLastUpdatedTransaction(TransactionModel lastUpdatedTransaction) {
        this.lastUpdatedTransaction = lastUpdatedTransaction;
    }

    public CategoryModel getLastUpdatedCategory() {
        return lastUpdatedCategory;
    }

    public void setLastUpdatedCategory(CategoryModel lastUpdatedCategory) {
        this.lastUpdatedCategory = lastUpdatedCategory;
    }

    public List<TransactionModel> getTransactions() {
        return transactions;
    }

    public List<CategoryModel> getCategories() {
        return categories;
    }

    public boolean addNewCategory(CategoryModel categoryModel) {
        if (categoryModel.getCatID() == null) {
            String catID = categoryModel.setCatID();
            this.lastUpdatedCategory = categoryModel;
            categories.add(categoryModel);
            return true;
        } else {
            // update needs to implement hee
            return false;
        }
    }

    public boolean removeCategory(String catID) {
        boolean returnVal = false;
        for (int i = 0; i < categories.size(); i++) {
            if (catID.equals(categories.get(i).getCatID())) {
                categories.remove(i);
                returnVal = true;
            }
        }
        return returnVal;
    }

    public boolean addNewTransaction(TransactionModel transactionModel) {

        if (transactionModel.getID() == null) {
            String id = transactionModel.setID();
            setLastUpdatedTransaction(transactionModel);
            System.out.println(transactionModel.toString());
            return transactions.add(transactionModel);
        } else {
            // update needs to implement hee
            return false;
        }

    }

    public boolean removeTransaction(String id) {
        boolean returnVal = false;
        for (int i = 0; i < transactions.size(); i++) {
            if (id.equals(transactions.get(i).getID())) {
                transactions.remove(i);
                returnVal = true;
            }
        }
        return returnVal;
    }

    @Override
    public String toString() {
        return "Account" + this.transactions.toString();
    }
}
