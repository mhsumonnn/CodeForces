import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B988_Substrings_Sort {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] str = new String[n];
		input.nextLine();
		
		for(int i = 0; i < n; i++)
			str[i] = input.nextLine();
		
		sortStrArray(str);
		String checker = "YES";
		for(int i = 0; i < str.length-1; i++){
			if(!str[i+1].contains(str[i]))
				checker = "NO";
		}
		
		if(checker == "YES"){
			System.out.println(checker);
			for(int i = 0; i < n; i++){
				System.out.println(str[i]);
			}
		}
		else
			System.out.println(checker);
		
		input.close();
	}
	
	public static String[] sortStrArray(String[] array){
		    Arrays.sort(array, new Comparator<String>() {
		        @Override
		        public int compare(String a, String b) {
		            return Integer.compare(a.length(),b.length());
		        }
		    });
		     return array;
		}
	
}
