/*
 * Create a new object of type Scanner that reads from the keyboard
Create a new movie object
Prompt the user to enter the title of a movie 
Read in the line that the user types
Set the title in the movie object
Prompt the user to enter the movie’s rating
Read in the line that the user types
Set the rating in the movie object
Prompt the user to enter the number of tickets sold at a (unnamed) theater
Read in the integer that the user types
Set the number of tickets sold in the movie object
Print out the information using the movie’s toString method
Ask the user if they want to enter another movie
If the user types “y” or “Y” then repeat the process
If the user types “n” or “N” then exit the program
 */

import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Movie movie = new Movie();
		String title;
		String rating;
		int tickets;
		String answer;
		do {
			System.out.println("Enter the title of a movie: ");
			title = keyboard.nextLine();
			movie.setTitle(title);
			System.out.println("Enter the rating of the movie: ");
			rating = keyboard.nextLine();
			movie.setRating(rating);
			System.out.println("Enter the number of tickets sold at a theater: ");
			tickets = keyboard.nextInt();
			movie.setSoldTickets(tickets);
			System.out.println(movie.toString());
			System.out.println("Do you want to enter another movie? (y/n)");
			answer = keyboard.next();
			keyboard.nextLine();
		} while (answer.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");
	}

}
