package HackerRank;

import static org.mockito.Matchers.anyByte;

import java.util.Arrays;
import java.util.Scanner;

public class LarrysArray {
	// Complete the larrysArray function below.
	static String larrysArray(int[] A) {
		int[] Adup=A.clone();
		Arrays.sort(Adup);
				for(int j=0;j<=A.length;j++){
		for(int i=0;i<A.length-2;i++){
			if(A[i]>A[i+1]||A[i]>A[i+2]){

				int start=A[i],count=1;
				while(A[i]>A[i+1]||A[i]>A[i+2]){
					A=rotate(i,A);count++;
					if(A[i+1]==start||count==3)
						break;

				}

			}
		}
				}
//		for(int i=0;i<A.length;i++){
//			System.out.print(" "+A[i]);
//		}
		if(Arrays.equals(A, Adup)){
			return "YES";
		}else{
			return "NO";
		}


	}

	public static int[] rotate(int pos,int[] arr){
		int temp=arr[pos],i;
		for(i=pos;i<pos+2;i++){
			arr[i]=arr[i+1];
		}
		arr[i]=temp;

		return arr;
	}
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)  {

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] A = new int[n];

			String[] AItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int AItem = Integer.parseInt(AItems[i]);
				A[i] = AItem;
			}

			String result = larrysArray(A);
			System.out.print("\n"+result);
			
		}



		scanner.close();
	}
}
