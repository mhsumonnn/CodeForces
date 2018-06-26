import java.util.Scanner;

public class D988_Points_and_Powers_of_Two {
	
	public static int[] maxPoints = new int[4000];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numOfPoints = input.nextInt();
		int[] points = new int[4000];
		
		for(int i = 0; i < numOfPoints; i++)
			points[i] = input.nextInt();
		
		int tempValue = 0, index = 0, difference;
		for(int i = 0; i < numOfPoints; i++){
			tempValue = points[i];
			if((Math.log(tempValue) / Math.log(2)) % 1 == 0)
				maxPoints[index++] = tempValue;
			else{
				for(int j = i; j < numOfPoints; j++){
					difference = Math.abs(points[j] - points[j+1]);
					if((Math.log(difference) / Math.log(2)) == (double)(difference)){
						if(!isThere(tempValue, index)){
							maxPoints[index++] = tempValue;
						}
					}
				}
			}
		}
		
		
		for(int i = 0; i < index; i++)
			System.out.println(maxPoints[i]);
		input.close();
	}
	
	public static boolean isThere(int value, int length){
		
		boolean result = false;
		
		for(int i = 0; i < length; i++){
			if(maxPoints[i] == value){
				result = true;
				break;
			}
		}
		
		return result;
	}

}
