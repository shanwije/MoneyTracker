package Model;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;
import java.util.UUID;

@Produces(MediaType.APPLICATION_JSON)
public class TransactionModel {

    private String ID;
    private double amount;
    private AccountType type;
    private String icon;
    private boolean recurrent;
    private int term;
    private String note;
    private AccountCategory category;

    public TransactionModel(){
        System.out.println("Transaction object is creating");
    }

    String getID() {
        return ID;
    }

    String setID() {
        UUID id = UUID.randomUUID();
        this.ID = String.valueOf(id);
        return this.ID;
    }

    @Override
    public String toString(){
        return ID+", "+ amount + ", " + type+ ", " +icon+ ", " +recurrent
                + ", " +term+ ", " +note+ ", " +category;
    }

    public AccountCategory getCategory() {
        return category;
    }

    public void setCategory(AccountCategory category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isRecurrent() {
        return recurrent;
    }

    public void setRecurrent(boolean recurrent) {
        this.recurrent = recurrent;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    private String id;
    private Date dateModified;


}
