package com.monocept.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.monocept.model.Movie;

public class MovieSerializableTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Movie> movies = new ArrayList<Movie>(5);
		boolean choice = false;

		while (!choice) {
			System.out.println("Enter an Option: \n1. Add Movie \n2. Display \n3. Exit");
			{
				int option = sc.nextInt();

				switch (option) {
				case 1:
					addMovie(sc, movies);
					break;

				case 2:
					displayMovie(movies);
					break;

				case 3:
					choice = true;
					System.out.println("Thank you for Visiting");
					break;

				default:
					System.out.println("Enter between 1 to 3 number");
				}
			}
		}

		// Serializing the movies ArrayList
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("movies.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(movies);

			objectOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// addMovie Function
	private static void addMovie(Scanner sc, ArrayList<Movie> movies) {
		Movie movie = new Movie(); // Creating movie object

		System.out.println("Enter Movie Details: ");

		System.out.println("Enter Movie id: ");
		int movieId = sc.nextInt();
		movie.setMovieId(movieId);

		System.out.println("Enter Movie Name: ");
		String movieName = sc.next();
		movie.setMovieName(movieName);

		System.out.println("Enter Movie genre: ");
		String genre = sc.next();
		movie.setGenre(genre);

		System.out.println("Enter Movie year: ");
		int year = sc.nextInt();
		movie.setYear(year);

		movies.add(movie); // Adding movie object to Movies ArrayList
	}

	// diplayMovie Function
	private static void displayMovie(ArrayList<Movie> movies) {
		// Looping through the movies ArrayList.
		for (Movie movie : movies) {
			System.out.println("Movie id: " + movie.getMovieId());
			System.out.println("Movie Name: " + movie.getMovieName());
			System.out.println("Movie Genre: " + movie.getGenre());
			System.out.println("Movie Year: " + movie.getYear());
			System.out.println();
		}
	}
}
