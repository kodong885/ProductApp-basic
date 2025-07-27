package kodong.study.BackEndTmp.presentation;


public class ProductDTO {

    private Long id;
    private String name;
    private Integer price;
    private Integer amount;

    public ProductDTO(
            Long id,
            String name,
            Integer price,
            Integer amount
    ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    // getter
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getPrice() {
        return price;
    }
    public Integer getAmount() {
        return amount;
    }

}
