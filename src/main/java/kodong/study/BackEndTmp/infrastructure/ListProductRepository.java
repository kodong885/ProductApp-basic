package kodong.study.BackEndTmp.infrastructure;


import com.sun.tools.javac.Main;
import kodong.study.BackEndTmp.BackEndTmpApplication;
import kodong.study.BackEndTmp.domain.Product;

public class ListProductRepository {

    public Product add(Product product) {

        BackEndTmpApplication.productID += 1L; // main 매서드에서 정의된 상품 id
        product.setId(BackEndTmpApplication.productID);
        BackEndTmpApplication.products.add(product);
        return product;
    }
}


// List (상품 저장고)를 프로그램 실행 할떄 한번 생성하고, 프로그램이 종료될떄
// 사라지게 하고싶음. ▶ 지피티에 질문한거 읽어보기!!!
// → 매인 메서드에 전역 객체로 이용!! ( 작은 규모에서만 사용해야함! 크기가
// 커질수록 마이너스.... )
