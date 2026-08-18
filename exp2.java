public class exp2 {
    public static void main(String[] args) {
        String s1="BANKAI KANNO BIRAKI BERIHIME ARATAME";
        String s2="bankai kanno biraki berihime aratame";
        String s3="";       
        System.out.println("orinal string :"+s1);
        System.err.println("length of the string: "+s1.length());
        System.out.println("char at index 5:"+s1.charAt(5));
        System.out.println("substring : "+s1.substring(0, 6));
        System.out.println("concartenation: "+s1.concat("!"));
        System.out.println("equal:"+s1.equals(s2));
        System.out.println("equalignorecae:"+s1.equalsIgnoreCase(s2));
        System.out.println("compare:"+s1.compareTo(s2));
        System.out.println("comparetoignorecase:"+s1.compareToIgnoreCase(s2));
        System.out.println("contain:"+s1.contains("BANKAI"));
        System.out.println("startwith:"+s1.startsWith("BANKAI"));
        System.out.println("ends with :"+s1.endsWith("ME"));
        System.out.println("index of a :"+s1.indexOf('a'));
        System.out.println("last index of e :"+s1.lastIndexOf('e'));
        System.out.println("replace bankai with shekai:"+s1.replace("BANKAI", "SHEKAI"));
        System.out.println("replace all space with * :"+s1.replaceAll(" ", "*"));
        System.out.println("uppercase of the string :"+s1.toUpperCase());
        System.out.println("lowercase of the string :"+s1.toLowerCase());
        System.out.println("trime:"+s2.trim());
        System.out.println("empty:"+s3.isEmpty());
        String word[]=s1.split(" ");
        System.out.println("split");
        for(String w : word){
        System.out.print("w");}
        int num=85;
        String s= String.valueOf(num);
        System.out.println("\nvalue of 85:"+s);
        char c[]=s1.toCharArray();
        System.out.println("character in string");
        for(char ch : c){
        System.out.print(ch+"");
    }
        String j=s1.join(".",".","!");
        System.out.println("joined:"+j);
}
}