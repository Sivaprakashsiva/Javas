
public class SumDigit {
	public  static void sum(int input1)
	{   int sum=0;
	int sum1=0;
	String a=String.valueOf(input1);
	
	
		for(int i=0;i<a.length();i++)
		{    
			for(int j=0;j<=i;j++)
			{
				
				sum+=Integer.parseInt(a.charAt(j)+"");
			
			}
			
		
		}
		System.out.println("SUM "+ sum);
		}
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
         sum(n);		
	}
}
