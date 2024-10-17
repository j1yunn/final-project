package moum.project;

import moum.project.service.ProductService;

public class main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        productService.execute();
    }
}
