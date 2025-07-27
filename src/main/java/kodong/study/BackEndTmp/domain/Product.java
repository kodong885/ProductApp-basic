package kodong.study.BackEndTmp.domain;

public class Product {

    private Long id;
    private String name;
    private Integer price;
    private Integer amount;

    public Product(
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

    // setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
