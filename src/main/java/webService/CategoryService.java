package webService;


import Model.DeleteTransactionModel;
import Model.TransactionModel;
import Model.TransactionServiceResponseModel;
import Model.category.CategoryModel;
import Model.category.CategoryServiceResponseModel;
import Model.category.DeleteCategoryModel;
import controller.UpdateAccount;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("cats")
public class CategoryService {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("addCategory")
    public Response addCategory(CategoryModel categoryModel) {
        CategoryServiceResponseModel categoryServiceResponseModel = UpdateAccount.addCategory(categoryModel);
        return Response.ok(categoryServiceResponseModel)
                .header("Access-Control-Allow-Origin", "*")
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("removeCategory")
    public Response removeCategory(DeleteCategoryModel deleteCategoryModel) {
        System.out.println("Deleting row for the category id " + deleteCategoryModel.getCatID());
        CategoryServiceResponseModel categoryServiceResponseModel = UpdateAccount.removeCategory(deleteCategoryModel.getCatID());
        return Response.ok(categoryServiceResponseModel)
                .header("Access-Control-Allow-Origin", "*")
                .build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("getAllCategories")
    public Response getAllCategories() {
        CategoryServiceResponseModel categoryServiceResponseModel = UpdateAccount.getAllCategories();
        return Response.ok(categoryServiceResponseModel)
                .header("Access-Control-Allow-Origin", "*")
                .build();
    }
}
