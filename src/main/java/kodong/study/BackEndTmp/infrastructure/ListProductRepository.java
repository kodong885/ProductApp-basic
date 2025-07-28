package kodong.study.BackEndTmp.infrastructure;


import kodong.study.BackEndTmp.domain.Product;

public class ListProductRepository {

    public Product add(Product product) {

        CountID.increaseID(); // CountID 에 increase 매서드를 이용하여 값을 +1L 하는 것이 좋음!;
        product.setId(CountID.getID());

        ProductList.getProductList().add(product);
        return product;
    }
}



// List (상품 저장고)를 프로그램 실행 할떄 한번 생성하고, 프로그램이 종료될떄
// 사라지게 하고싶음. ▶ 지피티에 질문한거 읽어보기!!!
// → 매인 메서드에 전역 객체로 이용!! ( 작은 규모에서만 사용해야함! 크기가
// 커질수록 마이너스.... )

