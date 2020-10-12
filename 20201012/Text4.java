import java.util.Scanner;

public class Text4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
			int j = 2;
			while(num % j != 0){
				j++;
			}
			if(num == j){
				System.out.println(num+"是素数");
			} else {
				System.out.println(num+"不是素数");
		}
	}
}