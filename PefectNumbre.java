import java.util.Scanner;
public class PerfectNumber{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
long n,sum =0;
System.out.println("Enter your number");
n = input.nextLong();
int i = 1;
while(i <= n/2)
{
if(n % i == 0)
{
sum = sum +i;
}
i++;
}
if(sum == n)
{
System.out.println(n+ "is a perfect Number");
}
else
System.out.println(n+ "is not a perfect number");
}
}
