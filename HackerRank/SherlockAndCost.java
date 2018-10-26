package HackerRank;

import java.util.Scanner;

public class SherlockAndCost {
	// Complete the cost function below.
	static int cost(int[] B) {

		int result=0;

		int temp=0;
		for(int i=1;i<=B[0];i++){
			result=calculate(B,0,i,0);	
//			System.out.print("sum: "+result+"\n");
			if(temp<result){
				 temp=result;
			 }
		}
		return result;
	}

	static int calculate(int[] B,int level,int parent,int sum){
	
//		sum=0;
		
		if(level>=B.length){

			return sum;
		}
		System.out.print("\n");
		int total=sum;
		sum=0;
		
		int temp=0;
		for(int i=1;i<=B[level];i++){
				
				sum=Math.abs(parent-i);
				 System.out.print("...  "+i+" ");
			
			 sum=calculate(B,level+1,i,sum);	
			 if(temp<sum){
				 temp=sum;
			 }
		
			
		}
		
		System.out.print("sum: "+temp+"\n");
		return total+temp;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)  {

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] B = new int[n];

			String[] BItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int BItem = Integer.parseInt(BItems[i]);
				B[i] = BItem;
			}

			int result = cost(B);
			System.out.println(result);

		}



		scanner.close();
	}
}
