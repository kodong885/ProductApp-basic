package kodong.study.BackEndTmp;

import kodong.study.BackEndTmp.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BackEndTmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndTmpApplication.class, args);
	}

	public static List<Product> products = new ArrayList<>();
	public static Long productID = 0L;
}

