import java.util.Scanner;
import java.util.Random;

public class Text6{
	public static void main(String[] args){
		Random random = new Random();
		int guessNum = random.nextInt(100);
		Scanner sc = new Scanner(System.in);
		while(true){
		int num = sc.nextInt();
		if(num > guessNum){
			System.out.println("猜大了");
		}
		if(num < guessNum){
			System.out.println("猜小了");
		}
		if(num == guessNum){
			System.out.println("猜对了");
			break;
			}
		}
	}
}