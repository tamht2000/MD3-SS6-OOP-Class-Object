package ra.TH3;

public class Main {
    public static void main(String[] args) {
        Category dm1 = new Category(1, "quần");
        Category dm2 = new Category(2, "áo");

        Product product1 = new Product(1, "quần âu", 150000, dm1);
        Product product2 = new Product(2, "quần jean", 250000, dm1);
        Product product3 = new Product(3, "áo sơ mi", 125000, dm2);
        Product product4 = new Product(4, "áo phông", 175000, dm2);

        System.out.println("Tất cả các sản phẩm:");
        product1.display();
        product2.display();
        product3.display();
        product4.display();
    }
}
