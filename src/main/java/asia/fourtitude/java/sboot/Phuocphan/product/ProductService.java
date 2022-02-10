package asia.fourtitude.java.sboot.Phuocphan.product;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class ProductService {

    private final ProductRespository productRespository;

    @Autowired
    public ProductService(ProductRespository productRespository) {
        this.productRespository = productRespository;
    }

    // public Page<Product> getProducts() {
    // return (Page<Product>) productRespository.findAll(PageRequest.of(0, 5));
    // }

    public Page<Product> getProductsPagination(int currentPage, int pageSize) {
        return (Page<Product>) productRespository
                .findAll(PageRequest.of(currentPage, pageSize, Sort.by("id")));
    }

    public Product getProductsByCode(String code) {
        Optional<Product> productOptional = productRespository.findProductByCode(code);
        if (!productOptional.isPresent()) {
            throw new IllegalStateException("product with code" + code + "doest not exists");
        }
        return productOptional.get();
    }

    public void addNewProduct(Product product) {
        Optional<Product> productOptional = productRespository.findProductByName(product.getName());
        if (productOptional.isPresent()) {
            throw new IllegalStateException("Product already exist");
        }
        productRespository.save(product);
    }

    public void deleteProduct(String code) {
        Optional<Product> productOptional = productRespository.findProductByCode(code);
        if (!productOptional.isPresent()) {
            throw new IllegalStateException("product with code" + code + "doest not exists");
        }
        productRespository.deleteById(productOptional.get().getId());
    }

    public void updateProduct(String code, Product productUpdate) {
        Optional<Product> productOptional = productRespository.findProductByCode(code);
        if (!productOptional.isPresent()) {
            throw new IllegalStateException("product with code" + code + "doest not exists");
        }
        Product product = productOptional.get();
        if (productUpdate.getName() != null && !productUpdate.getName().isEmpty()) {
            product.setName(productUpdate.getName());
        }
        if (productUpdate.getCategory() != null && !productUpdate.getCategory().isEmpty()) {
            product.setCategory(productUpdate.getCategory());
        }
        if (productUpdate.getBrand() != null && !productUpdate.getBrand().isEmpty()) {
            product.setBrand(productUpdate.getBrand());
        }
        if (productUpdate.getType() != null && !productUpdate.getType().isEmpty()) {
            product.setType(productUpdate.getType());
        }
        if (productUpdate.getDescription() != null && !productUpdate.getDescription().isEmpty()) {
            product.setDescription(productUpdate.getDescription());
        }
        productRespository.save(product);

    }

}
