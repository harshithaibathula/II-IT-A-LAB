class Throw
{
public static void main(String args[])
{
int age=20;
 if(age<18)
{
throw new ArithmeticException("Not valid");
}  
else
{  
System.out.println("Can vote");
}
}
} 