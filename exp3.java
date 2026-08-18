public class exp3 {
    String[] one_piece={"LUFFY","ZORO","NAMI","USOPP","SANJI","CHOPPER","ROBIN","BROOK","JIMBEI"};
    int sum =0;
    public void display(){
        for(int i = 0;i<one_piece.length;i++){
            System.out.println("straw hat pirates "+(i+1)+":"+one_piece[i]);
    }
    }
    public static void main(String[] args) {
        exp3 n= new exp3();
        n.display();
    }
}
