public class Text1 {
	public static void main (String[] args){
		int i = 1;
		int sum = 0;
		while(i <= 100){
				if(i % 90 == 0 || i % 10 % 9 == 0){
					sum++;
				}
			i++;
		}
		System.out.println(sum);
	}
}