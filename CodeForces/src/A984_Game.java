import java.util.Arrays;
import java.util.Scanner;

public class A984_Game{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int howMany = input.nextInt();
		
		int numbers[] = new int[howMany];
		for(int i = 0; i < howMany; i++)
			numbers[i] = input.nextInt();
		input.close();
		
		Arrays.sort(numbers);
		
		if(numbers.length % 2 == 0)
			System.out.println(numbers[howMany/2 - 1]);
		else
			System.out.println(numbers[howMany/2]);
	}
}