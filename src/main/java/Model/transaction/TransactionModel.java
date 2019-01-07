package Model.transaction;

import Model.category.CategoryModel;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;
import java.util.UUID;

@Produces(MediaType.APPLICATION_JSON)
public class TransactionModel {

    private String ID;
    private double amount;
    private boolean recurrent;
    private int term;
    private String note;
    private Date date;
    private CategoryModel category;
    private String catID;

    public TransactionModel() {
        System.out.println("Transaction object is creating");
        this.date = new Date();
    }

    public String getID() {
        return ID;
    }

    public String setID() {
        UUID id = UUID.randomUUID();
        this.ID = String.valueOf(id);
        return this.ID;
    }

    @Override
    public String toString() {
        return ID + ", " + amount + ", " + category.toString() + ", " + recurrent
                + ", " + term + ", " + note + ", " + category;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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

    public CategoryModel getCategory() {
        return category;
    }

    public void setCategory(CategoryModel category) {
        this.category = category;
    }

    public String getCatID() {
        return catID;
    }

    public void setCatID(String catID) {
        this.catID = catID;
    }
}
