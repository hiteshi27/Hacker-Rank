package HackerRank;

import java.util.Scanner;

public class HalloweenSale {
	static int howManyGames(int p, int d, int m, int s) {
		int games = 0;
		if(1<=m&&m<=p&&p<=100&&1<=d&&d<=100&&1<=s&&s<=10000){
			int cost=p;

			if((s-cost)>=0){
				System.out.println(cost);
				s=s-cost;
				games++;
				
				while(s-m>=0&&(s-cost+d)>=0){
					
					if(cost-d>m){
						
						cost=cost-d;
						System.out.println(cost);
						s=s-cost;
						games++;
					}else{

						System.out.println(m);
						s=s-m;
						games++;

					}

				}
				

			}
		}


		return games;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String[] pdms = scanner.nextLine().split(" ");

		int p = Integer.parseInt(pdms[0]);

		int d = Integer.parseInt(pdms[1]);

		int m = Integer.parseInt(pdms[2]);

		int s = Integer.parseInt(pdms[3]);

		int answer = howManyGames(p, d, m, s);
		System.out.print(answer);


		scanner.close();
	}
}
