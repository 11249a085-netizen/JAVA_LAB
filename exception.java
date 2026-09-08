class AgeException extends Exception {
AgeException(String msg) { super(msg); }
}
public class exception {
static void verify(int age) throws AgeException {
if (age < 18)
throw new AgeException("Age " + age + " is below 18");
System.out.println("Age " + age + " accepted");
}
public static void main(String[] args) {
try {
verify(19);
verify(17);
} catch (AgeException e) {
System.out.println("Rejected : " + e.getMessage());
}
}
}