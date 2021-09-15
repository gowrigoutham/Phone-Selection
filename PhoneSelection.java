/*
 * Gowri Goutham Course Section Number: 37573
 * **********************************************/
import java.util.Scanner; 

public class PhoneSelection{
	public static void main(String [] args){
		Scanner scnr = new Scanner(System.in);
		/*
		 * output: print out the message to user "Enter a single letter, and I will tell you what the corresponding digit is on the telephone"
		 ********************************************/
		System.out.println("Enter a single letter, and I will tell you what the corresponding digit is on the telephone");
		/*
		 * input: letterInput and set to input.next and charAt(0)
		 **********************************************/ 
		char letter = scnr.next() .charAt(0);
		letter = Character.toUpperCase(letter);
		
		if (letter == 'A' || letter == 'B' || letter == 'C'){
		/*
		* print/output the digit 2 that corresponds to the letterInput of A B C
		**************************************************/
			System.out.println("The digit " + 2 + " corresponds to the letter " + letter + " on the telephone.");
		}
			else if (letter == 'D' || letter == 'E'  || letter == 'F' ){
		/*
		* print/output the digit 3 that corresponds to the letterInput of D E F 
		********************************************** */
				System.out.println("The digit " + 3 + " corresponds to the letter " + letter + " on the telephone.");
		}
				else if (letter == 'G'  || letter == 'H' || letter == 'I' ){
		/*
		* print/output the digit 4 that corresponds to the letterInput of G H K
		***********************************************/
					System.out.println("The digit " + 4 + " corresponds to the letter " + letter + " on the telephone.");
		}
					else if (letter == 'J'  || letter == 'K'  || letter == 'L' ){
		/*
		* print/output the digit 5 that corresponds to the letterInput of J H K L
		************************************************/
						System.out.println("The digit " + 5 + " corresponds to the letter " + letter + " on the telephone."); 
		}
						else if (letter == 'M' || letter == 'N' || letter == 'O'){
		/*
		* print/output the digit 6 that corresponds to the letterInput of M N O
		**************************************************/
							System.out.println("The digit " + 6 + " corresponds to the letter " + letter + " on the telephone.");
		}
							else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S'){
		/*
		* print/output the digit 7 that corresponds to the letterInput of P Q R S 
		***********************************************/
								System.out.println("The digit " + 7 + " corresponds to the letter " + letter + " on the telephone.");
		}
								else if (letter == 'T' || letter == 'U' || letter == 'V'){
		/*
		* print/output the digit 8 that corresponds to the letterInput of T U V
		*************************************************/
									System.out.println("The digit " + 8 + " corresponds to the letter " + letter + " on the telephone.");
		}
									else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z'){
		/*
		* print/output the digit 9 that corresponds to the letterInput of W X Y Z
		*************************************************/
										System.out.println("The digit " + 9 + " corresponds to the letter " + letter + " on the telephone.");
		}

	}
}





 