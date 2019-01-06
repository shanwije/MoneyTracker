package Model;

import javax.json.bind.annotation.JsonbProperty;

public enum AccountType {
    @JsonbProperty("EXPENSE")
    EXPENSE,
    @JsonbProperty("INCOME")
    INCOME


}
