import java.util.Scanner;

public class Text9 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int num2 = sc2.nextInt();
		int min = 0; //输入的两个数之间的最小值
		int num = 0; //最大公约数
		if(num1 < num2){
			min = num1;
		} else {
			min = num2;
		}
		for(int i = 1; i <= min; i++){
			if(num1 % i == 0 && num2 % i == 0){
				num = i;
			}
		}
		System.out.println(num);
	}
}