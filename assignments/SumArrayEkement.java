

public class SumArrayEkement
{
public static void main(String arg[])
{
int arr= {10,20,30,40,50};
int sum=0,n;

n=arr.length;

for(int i=0; i<n; i++)
{
sum=sum+arr[i];
}

System.out.println("Sum array elements"+sum);
}
}