import java.util.Scanner;

public class A988_Diverse_Team {
	
	public static int team[] = new int[200];
	public static int students[] = new int[200];

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
		
		int[] position = new int[200];
		int tempValue = 0, index = 0;;
		
		for(int i = 0; i < n; i++){
			tempValue = input.nextInt();
			
			if(!isThere(tempValue, k)){
				team[index] = tempValue;
				position[index] = i+1;
				index++;
			}
		}
		
		input.close();
		
		if(index < k){
			System.out.println("NO");
		}
		else{
			System.out.println("YES");
			for(int i = 0; i < k; i++)
				System.out.print(position[i] + " ");
		}

	}
	
	public static boolean isThere(int value, int length){
		
		boolean result = false;
		
		for(int i = 0; i < length; i++){
			if(team[i] == value){
				result = true;
				break;
			}
		}
		
		return result;
	}
}
