
public class Square {

	public static void main(String[] args) {
		System.out.println(sumBalloons2(4));
	}

	static int sumBaloons(int n) {
		int sum;
		if(n==0) {
			sum=0;
		}else if(n % 2 == 0) {
			sum = 5;
		}else {
			sum =2;
		}
		for(int i=3; i <=n; i+=2) {
			sum += 5;
		}

		return sum;
	}

	static int sumBalloons2(int n) {
		if (n == 1) {
			return 2;
		} else if (n == 2) {
			return 5;
		}
		return sumBalloons2(n - 2) + 5;
	}
}
