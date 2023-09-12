package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.business.request.CreateProductRequest;
import kodlamaio.northwind.business.request.SearchProductRequeset;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsControllers {
    private ProductService productService;

    @Autowired
    public ProductsControllers(ProductService productService) {
        super();
        this.productService = productService;
    }


    @GetMapping("/getall")
    public List<Product> getAll() {


        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Product add(@RequestBody CreateProductRequest product) {
        return this.productService.add(product);
    }

    @PostMapping("/update")
    public Product update(@RequestBody CreateProductRequest product) {
        return this.productService.update(product);

    }

    @PostMapping("/delete")
    public void deleteById(@RequestBody CreateProductRequest deleteProductRequest) {
        this.productService.deleteById(deleteProductRequest.getId());
    }

    @PostMapping("/search")
    public List<Product> searchProduct(@RequestBody SearchProductRequeset searchProductRequest){

        return this.productService.searchProducts(searchProductRequest);


    }
}
