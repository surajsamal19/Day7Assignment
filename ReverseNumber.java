public class ReverseNumber{
public static void main(String args[]){
int num = 54210, reverse = 0, rem;
while(num != 0)
{
rem = num % 10;
reverse = reverse *10 + rem;
num /= 10;
}
System.out.println("reversed number :" +reverse);
}
}