public class PrimeNumber{
public static void main(String args[]){
int m = 0; flag = 0;
int n = 3;
m =n/2;
if(n  == 0 || n == 1){
System.out.println(n+ "is not a prime no" );
}
else
{
for(int i = 0; i<= m; i++){
if(n%i == 0){
System.out.println(n+ "is not prime number");
flag =1;
break;
}
}
if(flag == 0){
System.out.println(n+ "ia a prime number");
}
}
} 