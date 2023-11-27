package cal;

public class calculate {
	public int calAdd(int x, int y) {
		return  x+y ;
	}
	public int calSubtract(int x, int y) {
		return x-y;
	}
	public int calMultiplicat(int x, int y) {
		return x*y;
	}
	public int calDivison(int x, int y) {
		return x/y;
	}
	public int calPow(int x, int y) {
		int ans = 1;
		for (int i = 0 ; i < y ; i++) {
			ans = ans*x;
		}
		return ans;
	}
}


