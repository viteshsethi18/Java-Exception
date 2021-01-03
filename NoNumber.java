public class NoNumber {
public static void main(String args[]) {
int sum=0;
int invalid=0;
for(int i=0;i<args.length;i++)
{
try
{
sum+=Integer.parseInt(args[i]);
}
catch(NumberFormatException e)
{
invalid++;
}
}
System.out.println("Total number of arguments:"+args.length);
System.out.println("Invalid numbers:"+invalid);
System.out.println("Sum:"+sum);
}
}