package moum.project.service;

import moum.project.controller.ProductCrawler;
import moum.project.dao.ProductDAO;
import moum.project.vo.Product;

import java.util.List;

public class ProductService {
    private final ProductDAO productDAO = new ProductDAO();
    private final ProductCrawler productCrawler = new ProductCrawler();

    public void execute() {
        List<Product> products = productCrawler.crawl();
        productDAO.saveProducts(products);
    }
}