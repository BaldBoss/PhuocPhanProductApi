package asia.fourtitude.java.sboot.Phuocphan.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping(path = "api")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // @GetMapping
    // public Page<Product> getProducts() {
    // return productService.getProducts();
    // }

    @GetMapping(path = "products")
    public Page<Product> getProductsPagination(@RequestParam("page") int page,
            @RequestParam("size") int size) {
        System.out.println("voday");
        return productService.getProductsPagination(page, size);
    }

    @GetMapping(path = "products/{code}")
    public Product getProductsById(@PathVariable("code") String code) {
        return productService.getProductsByCode(code);
    }

    @PostMapping(path = "products")
    public void registerNewProduct(@RequestBody Product product) {
        productService.addNewProduct(product);
    }

    @DeleteMapping(path = "products/{code}")
    public void deleteStudent(@PathVariable("code") String code) {
        productService.deleteProduct(code);
    }

    @PutMapping(path = "products/{code}")
    public void updateProduct(@PathVariable("code") String code, @RequestBody Product productUpdate) {
        productService.updateProduct(code, productUpdate);
    }

}
