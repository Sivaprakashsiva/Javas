import java.util.*;
class NumberSeed
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int y=s.nextInt();
int temp=x;
int sum=1;
int rem=0;
int sum1=0;
while(temp>0)
{
rem=temp%10;
temp/=10;
sum*=rem;
}
sum1=x*sum;
if(sum1==y){
System.out.println("X is Seed of Y");
}
else{
System.out.println("X is not a Seed of Y");
}
}
}
