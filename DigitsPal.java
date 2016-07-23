import java.util.Scanner;

public class DigitsPal {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int x;
	int re=0;
	int sum=0;
	int temp=num;
	while(temp>0){
		x=temp%10;
		temp/=10;
		sum+=x;	
	}
	System.out.print(sum+" ");
	int s1=sum;
	while(s1>0){
		int x1=s1%10;
		s1/=10;
		re+=x1;
	}
    if(sum==re){
    	System.out.println("The sum of num is palindrom");
    }
    else
    	System.out.println("Not Palindrom");
  }

}
