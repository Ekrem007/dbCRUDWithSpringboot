package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.business.request.CreateProductRequest;
import kodlamaio.northwind.business.request.SearchProductRequeset;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {
    private  ProductDao productDao;
    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }


    public ProductManager() {

    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }

    @Override
    public Product add(CreateProductRequest product) {
        Product product1 = new Product();
        product1.setProductName(product.getProductName());
        product1.setUnitPrice(product.getUnitPrice());
        product1.setUnitsInStock(product.getUnitsInStock());
        product1.setUnitPrice(product.getUnitPrice());
        product1.setDiscontinued(1);
        product1.setId((short)(42));
        product1.setCategoryId((short)(2));


        return this.productDao.save(product1);
    }

    @Override
    public Product update(CreateProductRequest product) {
        Product product2 = new Product();
        product2.setProductName(product.getProductName());
        product2.setUnitPrice(product.getUnitPrice());
        product2.setUnitsInStock(product.getUnitsInStock());
        product2.setUnitPrice(product.getUnitPrice());
        product2.setDiscontinued(1);
        product2.setId((short)(43));
        product2.setCategoryId((short)(2));

        return this.productDao.save(product2);
    }

    @Override
    public void deleteById(int id) {

        this.productDao.deleteById(id);
    }


    @Override
    public List<Product> searchProducts(SearchProductRequeset searchRequest) {

        return this.productDao.findByProductNameContaining(searchRequest.getProductName());

    }


}
