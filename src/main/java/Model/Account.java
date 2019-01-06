package Model;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Produces(MediaType.APPLICATION_JSON)
public class Account {

    private List<TransactionModel> transactions;
    Account(){
        transactions = new ArrayList<>();
    }


    public List<TransactionModel> getTransactions() {
        return transactions;
    }

    public boolean addNewTransaction(TransactionModel transactionModel){
            String id = transactionModel.setID();
        return transactions.add(transactionModel);
    }

    public boolean removeTransaction(String id){
        boolean returnval = false;
        for(int i =0; i < transactions.size(); i++){
            if(id.equals(transactions.get(i).getID())){
                transactions.remove(i);
                returnval = true;
            }
        }
        return returnval;
    }

    @Override
    public String toString(){
        return "Account" + this.transactions.toString();
    }
}
