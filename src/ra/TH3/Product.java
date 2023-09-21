package ra.TH3;

public class Product {
    int productId;
    String productName;
    float productPrice;
    Category category;
    public Product(){}
    public Product(int productId, String productName, float productPrice, Category category){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }
    public void display(){
        System.out.println("Mã sản phẩm: " + productId + "\n"
                + "Tên sản phẩm: " + productName + "\n"
                + "Giá: " + productPrice + "\n"
                + "Danh mục: " + category.categoryName);
    }
}
