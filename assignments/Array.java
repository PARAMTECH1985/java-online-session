public class Array
{
public static void main(String args[])
{

int a[]={1,2,3,4,5,6,7};

System.out.println(a[0]);
System.out.println(a[5]);

try
{
System.out.println(a[7]);
}
catch(Exception e)
{
System.out.println("Exeption in try block");
}
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}