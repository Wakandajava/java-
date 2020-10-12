import java.util.Scanner;

public class Text12{
	public static void main(String[] args) {
	
		int num = 123;
		int n = 3;
		while(n > 0){
			Scanner sc = new Scanner (System.in);
			int key = sc.nextInt();
			if(key == num){
				System.out.println("登录成功");
				break;
			} else {
				if(n > 1){
				System.out.println("密码错误，可以重新输入");
				} else {
					System.out.println("密码错误");
				}
			}
			n--;
			if(n == 0){
				break;
			}
		}
	}
}