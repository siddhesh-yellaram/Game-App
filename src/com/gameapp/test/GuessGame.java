package com.gameapp.test;
import java.util.*;
public class GuessGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessNo();
	}
	public static void GuessNo() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the number!!!\n");
		System.out.println("I am thinking of no from 1 to 10\n");
		int randomNo = r.nextInt(5);
		int count = 0,guessNo;
		System.out.println("Your Guess: ");
		guessNo = sc.nextInt();
		while(guessNo != randomNo) {
			if(guessNo > randomNo) {
				System.out.println("Too High");
				count += 1;
				System.out.println("Your Guess: ");
				guessNo = sc.nextInt();
			}else {
				System.out.println("Too Low");
				count += 1;
				System.out.println("Your Guess: ");
				guessNo = sc.nextInt();
			}
		}
		System.out.println("You guessed it in "+count+" tries.");
		System.out.println("Do you want to continue press (y/n): ");
		char ch = sc.next().charAt(0);
		if(ch == 'y') {
			GuessNo();
		}else {
			System.out.println("Bye.");
		}
		sc.close();
	}
}
