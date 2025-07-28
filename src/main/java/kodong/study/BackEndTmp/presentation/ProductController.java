package kodong.study.BackEndTmp.presentation;


import kodong.study.BackEndTmp.application.ProductService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

    ProductService productService = new ProductService();

    @RequestMapping(path = "/product", method = RequestMethod.POST)
    public ProductDTO addProduct(@RequestBody ProductDTO productDTO) {

        return productService.add(productDTO);

    }
}

// 지금 현재 하려는 것이 products 를 싱글톤으로 만들려는 것.