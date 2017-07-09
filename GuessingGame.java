import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
				
		Random random = new Random(1000);
		
		int correctNumber = random.nextInt(100);
		int guessNumber;
		boolean win = false;
		System.out.println(correctNumber);
		
		
		while(win == false){
			System.out.println("\n\nPlease enter a number");
			Scanner text2 = new Scanner(System.in);
			guessNumber = text2.nextInt();

			if(guessNumber == correctNumber)
				win = true;
			else if (guessNumber < correctNumber)
				System.out.println("the number was lower");
			else if(guessNumber > correctNumber)
				System.out.println("The number was higher");
		}
			
			
		
		
	}

}
