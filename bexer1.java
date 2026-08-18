public class bexer1{
    int num=10;
    public void display(){
       String a ="hello";
       int localnum=5;
       System.out.println("INSTANCE VARIABLE: "+num);
       System.out.println("STATIC VARIABLE: "+a);
       System.out.println("LOCAL VARIABLE:"+localnum);
    }
public static void main(String[] args){
    bexer1 o =new bexer1();
    o.display();
}
}