package ra.TH2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nguyễn Văn A", true, "JV-01", 19, "Hà Nội");
        Student student2 = new Student(2, "Nguyễn Thị B", false, "JV-02", 21, "Bắc Giang");
        Student student3 = new Student(3, "Nguyễn Văn C", true, "JV-01", 23, "Sơn La");

        System.out.println("-------------------Thông tin của student1-------------------");
        student1.display();
        System.out.println("-------------------Thông tin của student2-------------------");
        student2.display();
        System.out.println("-------------------Thông tin của student3-------------------");
        student3.display();
    }
}
