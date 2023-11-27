package cal;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		calculate cal = new calculate();
		Scanner myScanner = new Scanner(System.in);
		System.out.println("範例輸出2 ** 2");
		int x = myScanner.nextInt();
		String sign = myScanner.next();
		int y = myScanner.nextInt();
		
		if(sign.contains("**")) {
			System.out.printf("%d %s %d = %d",x , sign , y , cal.calPow(x , y));
		}else if(sign.contains("*")) {
			System.out.printf("%d %s %d = %d",x , sign , y , cal.calMultiplicat(x , y));
		}else if(sign.contains("/")) {
			System.out.printf("%d %s %d = %d",x , sign , y , cal.calDivison(x , y));
		}else if(sign.contains("+")) {
			System.out.printf("%d %s %d = %d",x , sign , y , cal.calAdd(x, y));
		}else if(sign.contains("-")) {
			System.out.printf("%d %s %d = %d",x , sign , y , cal.calSubtract(x , y));
		}
		
		myScanner.close();
		
		
		
	}

}
