package asia.fourtitude.java.sboot.Phuocphan.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Product {
    @Id
    @SequenceGenerator(name = "product_sequence", sequenceName = "product_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seuqence")
    private long id;
    private String code;
    private String name;
    private String category;
    private String brand;
    private String type;
    private String description;

    public Product() {
    }

    public Product(long id, String code, String name, String category, String brand, String type, String description) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.type = type;
        this.description = description;
    }

    public Product(String code, String name, String category, String brand, String type, String description) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.type = type;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product [brand=" + brand + ", category=" + category + ", code=" + code + ", description=" + description
                + ", id=" + id + ", name=" + name + ", type=" + type + "]";
    }

}
