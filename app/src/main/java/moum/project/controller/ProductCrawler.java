package moum.project.controller;

import moum.project.vo.Product;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductCrawler {

    public List<Product> crawl() {
        List<Product> products = new ArrayList<>();
        try {
            Document doc = Jsoup.connect("https://www.lego.com/ko-kr/themes").get();
            Elements categories = doc.select(".theme-category"); // 카테고리 셀렉터
            for (Element category : categories) {
                String categoryName = category.select(".category-name").text();
                Elements items = category.select(".product-item"); // 제품 아이템 셀렉터
                for (Element item : items) {
                    String productName = item.select(".product-name").text();
                    String productPrice = item.select(".product-price").text();
                    products.add(new Product(categoryName, productName, productPrice));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
}