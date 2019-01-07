package Model.category;

import java.util.List;

public class CategoryServiceResponseModel {
    private boolean success;
    private List<CategoryModel> categories;
    private CategoryModel lastUpdatedCategory;
    private String error;

    public CategoryServiceResponseModel() {
    }

    public CategoryServiceResponseModel(boolean success, List<CategoryModel> categories, CategoryModel lastUpdatedCategory) {
        this.success = success;
        this.categories = categories;
        this.lastUpdatedCategory = lastUpdatedCategory;
    }

    public CategoryServiceResponseModel(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public CategoryServiceResponseModel(boolean success, List<CategoryModel> categories) {
        this.success = success;
        this.categories = categories;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<CategoryModel> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryModel> categories) {
        this.categories = categories;
    }

    public CategoryModel getLastUpdatedCategory() {
        return lastUpdatedCategory;
    }

    public void setLastUpdatedCategory(CategoryModel lastUpdatedCategory) {
        this.lastUpdatedCategory = lastUpdatedCategory;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
