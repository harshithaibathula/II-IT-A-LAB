class Final
{
public static void main(String args[])
{
try
{
int a= 100/0;
}
catch(ArithmeticException e)
{
System.out.println(e.getMessage());
}
finally
{
System.out.println("Final Block");
}
}
}