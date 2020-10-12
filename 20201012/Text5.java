import java.util.Scanner;

public class Text5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age < 18){
			System.out.println(age + "是少年");
		}
		if(age <= 28 && age >=19){
			System.out.println(age + "是青年");
		}
		if(age <= 55 && age >= 29){
			System.out.println(age + "是中年");
		}
		if(age >= 56){
			System.out.println(age + "是老年");
		}
		
	}
}