public class exp1b {
    public static void main(String[] args) {
        int num[]={85,99,117,122,109};
        int i;
        int sum=0;
        for(i=0;i<num.length;i++){
            sum+=num[i];
        }
        System.out.println("Elements in array:");
        for(int n : num){
            System.out.print(n+" ");
        }
        System.out.println("\nsum:"+sum);
        if(sum>500){
            System.out.println("sum of the num is greater than 500 ");
        }
        else{
            System.out.println("sum of the num is less than 500 or equal to 500");
        }
    }
}
