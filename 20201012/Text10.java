import java.util.Scanner;

public class Text10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while(num != 0){
			if(num % 2 == 1){
				sum++;
			}
			num /= 2;
		}
		System.out.println(sum);
	}
}