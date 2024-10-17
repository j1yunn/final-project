package moum.project.dao;

import moum.project.vo.Product;

import java.util.List;

public class ProductDAO {
    public void saveProducts(List<Product> products) {
        // 데이터베이스에 저장하는 로직 구현
        for (Product product : products) {
            System.out.println("Saving Product: " + product.getName());
            // 실제 데이터베이스 저장 로직
        }
    }
}