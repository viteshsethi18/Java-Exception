import java.util.*;
public class Divide {
public static void main(String[] args) {
// TODO Auto-generated method stub
int n;
System.out.println("Enter a number");
Scanner s = new Scanner(System.in);
n = s.nextInt();
try {
int a = n/0; //stmnt 1
System.out.println(a);
}
catch(ArithmeticException e) {
System.out.println(e);
}
for(int i=1;i<=9;i++) {
int z = n/i;
System.out.println(z);
}
}
}