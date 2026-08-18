import java.util.Scanner;
class dep {
    public String dept = "CSE";
    public void display() {
        System.out.println("DEPARTMENT NAME : " + dept);
    }
}
class student extends dep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        student st = new student();
        System.out.print("Enter name of the student: ");
        String name = s.nextLine();
        System.out.println("STUDENT NAME : " + name);
        st.display();
    }
}
