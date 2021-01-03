import java.io.*;
import java.util.*;
class EmpEx
{
public static void main(String args[])
{
String name;
int age;
System.out.println("enter detail");
System.out.println("Enter Name and Age:");
Scanner in=new Scanner(System.in);
try
{
if(!(in.nextLine().matches("[a-zA-Z]+")))
{
throw new IOException();
}
age=in.nextInt();
if(age>50)
{
System.out.println("Age greater than 50 Exception");
throw new Exception();
}
EmpEx x=new EmpEx();
System.out.println("obj created");
}
catch(Exception e)
{
System.out.println("Exception");
}
}
}