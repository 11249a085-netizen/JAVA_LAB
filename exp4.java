import java.util.Scanner;
public class exp4 {
 final int n=100;                                                                             
 public void display(int age){
    if(age>=18 && age <=n){
        System.out.println("YOU ARE Eligible to take driving licence test ");
    }
    else if(age<18 && age>0){
        System.out.println("YOU ARE not eligible");
    }
    else if(age<0 || age>n){
        System.out.println("in valid age ");
    }
    else{
        System.out.println("PLEASE Enter a valid integer");
    }
 }  
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    exp4 e=new exp4();
    System.out.print("enter your age : ");
    int age = s.nextInt();
    e.display(age);
} 
}
