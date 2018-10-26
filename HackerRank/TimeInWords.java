package HackerRank;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeInWords {
	// Complete the timeInWords function below.
	static String timeInWords(int h, int m) {
	
		String[] timeWord={"one", "two",  "three", "four","five",  "six", 
				"seven", "eight", "nine","ten", "eleven", "twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

		switch(m){
		case 0:return timeWord[h-1]+" o' clock";
		case 1:return timeWord[m-1]+" minute past "+timeWord[h-1];
		case 59:if(h==12){
			return "one minute to "+timeWord[0];
		}else{
			return "one minute to "+timeWord[h];
		}
		case 15:return "quarter past "+timeWord[h-1];
		case 30:return "half past "+timeWord[h-1];
		case 45:if(h==12){
			return "quarter to "+timeWord[0];
		}else{
			return "quarter to "+timeWord[h];
		}
		default:;
		}
		
		
		if(2<=m&&m<15){
			return m+" minutes past "+timeWord[h-1];
		}
		if(16<=m&&m<20){
			return m+" minutes past "+timeWord[h-1];
		}
		if(m==20){
			return "twenty minutes past "+ timeWord[h-1];
		}
		if(21<=m&&m<30){
			return "twenty "+ timeWord[(m%10)-1]+" minutes past "+ timeWord[h-1];
		}
		if(31<=m&&m<45){
			return "twenty "+ timeWord[((60-m)%10)-1]+" minutes to "+ timeWord[h];
		}
		if(46<=m&&m<59){
			return timeWord[(60-m)-1]+" minutes to "+ timeWord[h];
		}



		return "";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int h = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int m = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String result = timeInWords(h, m);
 System.out.println(result);

		scanner.close();
	}
}
