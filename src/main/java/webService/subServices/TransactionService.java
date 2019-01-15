package webService.subServices;

import Model.transaction.DeleteTransactionModel;
import Model.transaction.TransactionModel;
import Model.transaction.TransactionServiceResponseModel;
import controller.UpdateAccount;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("transactions")
public class TransactionService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getTransactions() {
        return "Working";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("addTransaction")
    public Response addTransaction(TransactionModel transactionModel) {
        TransactionServiceResponseModel transactionServiceResponseModel = UpdateAccount.addTransaction(transactionModel);
        return Response.ok(transactionServiceResponseModel)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("removeTransaction")
    public Response removeTransaction(DeleteTransactionModel deleteTransactionModel) {
        System.out.println("Deleting row for the id " + deleteTransactionModel.getID());
        TransactionServiceResponseModel transactionServiceResponseModel = UpdateAccount.removeTransaction(deleteTransactionModel.getID());
        return Response.ok(transactionServiceResponseModel)
                .build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("getAllTransaction")
    public Response getAllTransaction() {
        TransactionServiceResponseModel transactionServiceResponseModel = UpdateAccount.getAllTransaction();
        return Response.ok(transactionServiceResponseModel)
                .build();
    }
}
