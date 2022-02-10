package asia.fourtitude.java.sboot.Phuocphan;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import asia.fourtitude.java.sboot.Phuocphan.product.Product;

@SpringBootApplication
public class PhuocPhanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhuocPhanApplication.class, args);
	}

}
