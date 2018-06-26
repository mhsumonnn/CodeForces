import java.util.Scanner;

public class B999_Reversing_Encryption {
	
	public static int[] divisors;
	public static int index = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int value = input.nextInt();
		divisors = new int[value + 1];
		divisorFinder(value);
		input.nextLine();
		
		String str = input.nextLine();
		char[] toChar = str.toCharArray();
		
		char temp;
		for(int i = 0; i <= index; i++){
			for(int j = 0, k = divisors[i]-1; j <= (divisors[i]-1)/2; j++, k--){
				temp = toChar[j];
				toChar[j] = toChar[k];
				toChar[k] = temp;
			}
		}
		
		System.out.println(toChar);
		
	}
	
	public static void divisorFinder(int value){
		for(int i = 1; i <= value; i++)
			if(value % i == 0)
				divisors[index++] = i;
		index--;
	}

}
