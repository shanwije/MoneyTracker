package Model.category;

import javax.json.bind.annotation.JsonbProperty;

public enum CategoryType {
    @JsonbProperty("EXPENSE")
    EXPENSE,
    @JsonbProperty("INCOME")
    INCOME


}
