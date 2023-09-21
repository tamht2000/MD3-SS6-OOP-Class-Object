package ra.TH3;

public class Category {
    int categoryId;
    String categoryName;
    public Category() {}
    public Category(int categoryId, String categoryName){
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    public void display(){
        System.out.println("Mã danh mục: " + categoryId + "\n"
                + "Tên danh mục: " + categoryName);
    }
}
