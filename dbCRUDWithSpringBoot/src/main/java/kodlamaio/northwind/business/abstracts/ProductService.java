package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.business.request.CreateProductRequest;
import kodlamaio.northwind.business.request.SearchProductRequeset;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    List<Product> getAll();

    Product add( CreateProductRequest product);
    Product update(CreateProductRequest product);
    void deleteById(int id);
    List<Product> searchProducts(SearchProductRequeset searchRequest);


}
