package asia.fourtitude.java.sboot.Phuocphan.product;

import java.util.Optional;

import org.hibernate.type.TrueFalseType;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRespository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT p.* FROM product p WHERE p.name = ?1", nativeQuery = true)
    Optional<Product> findProductByName(String name);

    @Query(value = "SELECT p.* FROM product p WHERE p.code = ?1", nativeQuery = true)
    Optional<Product> findProductByCode(String code);
}
