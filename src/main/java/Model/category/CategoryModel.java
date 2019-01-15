package Model.category;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;


@Produces(MediaType.APPLICATION_JSON)
public class CategoryModel {
    private CategoryType type;
    private String icon;
    private String categoryName;
    private String catID;

    public CategoryModel(CategoryType type, String icon, String categoryName) {
        this.type = type;
        this.icon = icon;
        this.categoryName = categoryName;
    }

    public CategoryModel() {
    }

    public String getCatID() {
        return catID;
    }

    public String setCatID() {
        UUID id = UUID.randomUUID();
        this.catID = "CAT_" + String.valueOf(id);
        return this.catID;
    }

    public CategoryType getType() {
        return type;
    }

    public void setType(CategoryType type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "category : " + this.getCategoryName() + ", " + this.getType() + ", " + this.getIcon();
    }
}
