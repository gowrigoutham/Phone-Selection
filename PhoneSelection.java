/*
 * Gowri Goutham Course Section Number: 37573
 * **********************************************/
import java.util.Scanner; 

public class PhoneSelection{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		/*
		 * output: print out the message to user "Enter a single letter, and I will tell you what the corresponding digit is on the telephone"
		 ********************************************/
		System.out.print("Enter a single letter, and I will tell you what the corresponding digit is on the telephone");
		/*
		 * input: letterInput and set to input.next and charAt(0)
		 **********************************************/ 
		char c = input.next().charAt(0);
		char letterInput = Character.toUpperCase(c);
		
		if (letterInput == 'A' || letterInput == 'B' || letterInput == 'C'){
		/*
		* print/output the digit 2 that corresponds to the letterInput of A B C
		**************************************************/
			System.out.print("The digit " + 2 + " corresponds to the letter " + letterInput + " on the telephone");
		}
			else if (letterInput == 'D' || letterInput == 'E'  || letterInput == 'F' ){
		/*
		* print/output the digit 3 that corresponds to the letterInput of D E F 
		********************************************** */
				System.out.print("The digit " + 3 + " corresponds to the letter " + letterInput + " on the telephone");
		}
				else if (letterInput == 'G'  || letterInput == 'H' || letterInput == 'I' ){
		/*
		* print/output the digit 4 that corresponds to the letterInput of G H K
		***********************************************/
					System.out.print("The digit " + 4 + " corresponds to the letter " + letterInput + " on the telephone");
		}
					else if (letterInput == 'J'  || letterInput == 'K'  || letterInput == 'L' ){
		/*
		* print/output the digit 5 that corresponds to the letterInput of J H K L
		************************************************/
						System.out.print("The digit " + 5 + " corresponds to the letter " + letterInput + " on the telephone"); 
		}
						else if (letterInput == 'M' || letterInput == 'N' || letterInput == 'O'){
		/*
		* print/output the digit 6 that corresponds to the letterInput of M N O
		**************************************************/
							System.out.print("The digit " + 6 + " corresponds to the letter " + letterInput + " on the telephone");
		}
							else if (letterInput == 'P' || letterInput == 'Q' || letterInput == 'R' || letterInput == 'S'){
		/*
		* print/output the digit 7 that corresponds to the letterInput of P Q R S 
		***********************************************/
								System.out.print("The digit " + 7 + " corresponds to the letter " + letterInput + " on the telephone");
		}
								else if (letterInput == 'T' || letterInput == 'U' || letterInput == 'V'){
		/*
		* print/output the digit 8 that corresponds to the letterInput of T U V
		*************************************************/
									System.out.print("The digit " + 8 + " corresponds to the letter " + letterInput + " on the telephone");
		}
									else if (letterInput == 'W' || letterInput == 'X' || letterInput == 'Y' || letterInput == 'Z'){
		/*
		* print/output the digit 9 that corresponds to the letterInput of W X Y Z
		*************************************************/
										System.out.print("The digit " + 9 + " corresponds to the letter " + letterInput + " on the telephone");
		}

	}
}





 