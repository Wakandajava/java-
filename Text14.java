import java.util.Scanner;

public class Text14{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++){

			for(int j = 1; j <= i; j++){
				sum = i * j;
				System.out.print( j + " * " + i + " = " + sum + "  ");
			}
			System.out.println();
		}
	}
}