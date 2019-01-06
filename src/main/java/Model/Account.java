package Model;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
public class Account {

    private List<TransactionModel> transactions;

    Account() {
        transactions = new ArrayList<>();
    }


    public List<TransactionModel> getTransactions() {
        return transactions;
    }

    public boolean addNewTransaction(TransactionModel transactionModel) {

        if (transactionModel.getID() == null) {
            String id = transactionModel.setID();
            System.out.println(transactionModel.toString());
            return transactions.add(transactionModel);
        } else {
            return false;
        }

    }

    public boolean removeTransaction(String id) {
        boolean returnval = false;
        for (int i = 0; i < transactions.size(); i++) {
            if (id.equals(transactions.get(i).getID())) {
                transactions.remove(i);
                returnval = true;
            }
        }
        return returnval;
    }

    @Override
    public String toString() {
        return "Account" + this.transactions.toString();
    }
}
