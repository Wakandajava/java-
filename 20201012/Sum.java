public class Sum {
	public static void main(String[] args){
		int sum = 0;
		int a = 1;
		int sumOdd = 0;
		int sumEve = 0;
		while (a <= 100) {
			sum += a;
			if(a % 2 == 0){
				sumEve += a;
			} else {
				sumOdd += a;
			}
			a++;
		}
		System.out.println("总和为："+sum);
		System.out.println("奇数和为："+sumOdd);
		System.out.println("偶数和为："+sumEve);
	}
}