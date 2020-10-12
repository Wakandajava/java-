public class Text3 {
	public static void main (String[] args){
		for(int i = 2; i <= 100; i++){
			int j = 2;
			while (i % j != 0){
				j++;
			}
			if(i == j){
				System.out.println(i);
			}
		}
	}
}