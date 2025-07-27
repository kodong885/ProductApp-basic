package kodong.study.BackEndTmp.application;


import kodong.study.BackEndTmp.domain.Product;
import kodong.study.BackEndTmp.infrastructure.ListProductRepository;
import kodong.study.BackEndTmp.presentation.ProductDTO;

public class ProductService {

    ListProductRepository listProductRepository = new ListProductRepository();

    public ProductDTO add(ProductDTO productDTO) {

        Product savedProduct;
        Long id;
        String name;
        Integer price;
        Integer amount;

        id = productDTO.getId();
        name = productDTO.getName();
        price = productDTO.getPrice();
        amount = productDTO.getAmount();

        // 1. productDTO → product
        Product product = new Product(
                id,
                name,
                price,
                amount
        );
        // 2. productDTO를 products에 저장
        savedProduct = listProductRepository.add(product);

        id = savedProduct.getId();
        name = savedProduct.getName();
        price = savedProduct.getPrice();
        amount = savedProduct.getAmount();
        // 3. product → productDTO
        ProductDTO savedProductDTO = new ProductDTO(
                id,
                name,
                price,
                amount
        );
        // productDTO 반환;
        return savedProductDTO;

    }
}
