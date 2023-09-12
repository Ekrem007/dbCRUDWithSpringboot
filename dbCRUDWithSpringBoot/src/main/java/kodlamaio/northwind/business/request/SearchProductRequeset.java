package kodlamaio.northwind.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SearchProductRequeset {

    private int id;
    private int categoryId;
    private String productName;
    private int unitPrice;
    private short unitsInStock;
    private String quantityPerUnit;
}
