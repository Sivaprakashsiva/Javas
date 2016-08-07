public class MaxDel {

	public static void main(String[] args) {
		
		
		int n=16452;
		String r="";
		int len=Integer.toString(n).length();
		int arr[]=new int[len];
		int i=0;
		while(n>0){
			arr[i]=n%10;
			n=n/10;
			i++;
		}
		Arrays.sort(arr);
		for(int j=0;j<=1;j++){
			r=""+arr[0]+arr[1];
			
		}
System.out.println(r);
	}

}
