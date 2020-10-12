public class SumJc {
	public static void main(String[] args){
		int sum = 0;
		int fac = 1; //阶乘
		int i = 1;
		// for (int i = 1; i <= 5; i++){
		// 	n *= i;
		// 	sum += n;
		// }
		

		
		while(i <= 5){
			fac *= i;
			sum += fac;
			i++;
		}
		System.out.println(sum);
	}
}