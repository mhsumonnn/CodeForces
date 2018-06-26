import java.util.Scanner;

public class B987_High_School_Become_Human {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		input.close();
		
		if((x == 2 || y == 2) && (x == 4 || y ==4))
			System.out.println("=");
		else if(((x == 1 || y == 1) || (x == 2 && y == 3) || (x == 3 && y == 2)) && x!=y){
			if(x > y)
				System.out.println(">");
			else
				System.out.println("<");
		}
		else{
			if(x==y)
				System.out.println("=");
			else if(x > y)
				System.out.println("<");
			else
				System.out.println(">");
		}
	}
	
}
