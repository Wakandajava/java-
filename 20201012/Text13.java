import java.util.Scanner;

public class Text13{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.print(n + "的每一位是: " );
		while(n != 0){
			if(n / 10 > 1){

			System.out.print(n % 10 + " , ");
			} else {
				System.out.print(n % 10);
			}
			n /= 10;
		}
	}
}