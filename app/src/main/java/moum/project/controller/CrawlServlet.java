package moum.project.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CrawlServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            // LEGO 웹사이트 크롤링
            Document doc = Jsoup.connect("https://www.lego.com/ko-kr/themes").get();

            // 카테고리, 제품명, 가격 추출
            Elements categories = doc.select(".theme-container"); // 카테고리 선택자
            out.println("<html><body>");
            out.println("<h1>LEGO 제품 목록</h1>");

            for (Element category : categories) {
                String categoryName = category.select(".theme-title").text(); // 카테고리 제목
                out.println("<h2>" + categoryName + "</h2>");

                Elements products = category.select(".product-card"); // 제품 카드 선택자
                for (Element product : products) {
                    String productName = product.select(".product-title").text(); // 제품명
                    String price = product.select(".product-price").text(); // 가격

                    out.println("<p>제품명: " + productName + ", 가격: " + price + "</p>");
                }
            }

            out.println("</body></html>");
        } catch (Exception e) {
            out.println("<p>크롤링 중 오류 발생: " + e.getMessage() + "</p>");
        } finally {
            out.close();
        }
    }
}
