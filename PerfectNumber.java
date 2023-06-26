import java.util.Scanner;
public class PerfectNumber{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int num = input.nextInt();
int sum = 0;
for(int i = 0; i<=num; i++){
if(num % i == 0)
{
sum = sum + i;
}
}
if(num == sum){
System.out.println("The number is a perfect number");
}
}
}