import java.util.Scanner;

public class Checks_ISBN {
/* We will take the first 9 numbers of the ISBN number to find the 10th digit of the ISBN number from the user.
 * We will calculate the 10th digit using the formula:
 *  (A × 1 + 𝐵 × 2 + 𝐶 × 3 + 𝐷 × 4 + 𝐸 × 5 + 𝐹 × 6 + 𝐾 × 7 + 𝐿 × 8 + 𝑀 × 9) % 11
 *  After that if the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention
 name=Umut  Surname=Bayar  Student ID=150120043
 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int numberOfISBN,digit1,digit2,digit3,digit4,digit5,digit6,digit7,digit8,digit9,digit10;
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		numberOfISBN=scan.nextInt();
		digit9=numberOfISBN%10;
		digit8=(numberOfISBN%100)/10;
		digit7=(numberOfISBN%1000)/100;
		digit6=(numberOfISBN%10000)/1000;
		digit5=(numberOfISBN%100000)/10000;
		digit4=(numberOfISBN%1000000)/100000;
		digit3=(numberOfISBN%10000000)/1000000;
		digit2=(numberOfISBN%100000000)/10000000;
		digit1=(numberOfISBN%1000000000)/100000000;
		digit10=(digit1*1+digit2*2+digit3*3+digit4*4+digit5*5+digit6*6+digit7*7+digit8*8+digit9*9)%11;
	if(digit10==10) {
		System.out.println("The ISBN-10 number is "+digit1+digit2+digit3+digit4+digit5+digit6+digit7+digit8+digit9+"X");	
	}
	else {
		System.out.println("The ISBN-10 number is "+digit1+digit2+digit3+digit4+digit5+digit6+digit7+digit8+digit9+digit10);
	}
	}
}
