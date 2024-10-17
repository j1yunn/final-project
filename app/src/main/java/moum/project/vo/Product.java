package moum.project.vo;

public class Product {
    private String category;
    private String name;
    private String price;

    // 생성자
    public Product(String category, String name, String price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    // Getter, Setter
    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
