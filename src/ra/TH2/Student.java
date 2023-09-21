package ra.TH2;

public class Student {
    int studentId;
    String studentName;
    boolean sex;
    String className;
    int age;
    String address;

    public Student() {
    }

    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }
    public void display(){
        System.out.println("Mã HS: " + studentId + "\n"
                + "Tên HS: " + studentName + "\n"
                + "Tuổi: " + age + "\n"
                + "Giới tính: " + (sex? "Nam":"Nữ") + "\n"
                + "Lớp: " + className + "\n"
                + "Địa chỉ: " + address + "\n"
        );
    }
}
