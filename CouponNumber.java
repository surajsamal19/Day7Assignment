public class CouponNumber{
public static voiid main(String args[]){
char[] chars = "AS754891".toCharArray();
int max = 10000;
int random = (int)(Math.random()*max);
StrimgBuffer input = new StringBuffer();
while(random>0)
{
input.append(character[random % chars.length]);
random /= chars.length;
}
String couponCode = input.toString();
System.out.println("Cooupon code:" +couponCode);
}
} 