package com.monocept.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.monocept.exceptions.CapcityFullException;
import com.monocept.exceptions.NoSuchMovieFoundException;
import com.monocept.model.Movie;

public class MovieDeserializable {

	@SuppressWarnings({ "unchecked", "resource" })
	public static void main(String[] args) {

		ArrayList<Movie> movies = new ArrayList<Movie>(5);
		Scanner sc = new Scanner(System.in);

		try {
			FileInputStream fileInputStream = new FileInputStream("movies.ser");
			ObjectInputStream moviesList = new ObjectInputStream(fileInputStream);

			// Type casting the readedObject into ArrayList
			movies = (ArrayList<Movie>) moviesList.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// While loop
		boolean choice = false;

		while (!choice) {
			System.out.println(
					"Choice an option from below \n1. Add a Movie \n2. Display All Movies \n3. Display a Particular Movie \n4. Exit");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				try {
					addMovie(sc, movies);
				} catch (CapcityFullException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 2:
				displayMovie(movies);
				break;

			case 3:
				try {
					displayAParticularMovie(sc, movies);
				} catch (NoSuchMovieFoundException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 4:
				choice = true;
				break;

			default:
				System.out.println("Enter numbers between 1 and 4");
			}
		}
		System.out.println("Main : Ended");
	}

	// Add a Movie
	private static void addMovie(Scanner sc, ArrayList<Movie> movies) {
		if (movies.size() == 5) {
			throw new CapcityFullException();
		}
		Movie movie = new Movie();

		System.out.println("Enter Movie id: ");
		movie.setMovieId(sc.nextInt());

		System.out.println("Enter Movie Name: ");
		movie.setMovieName(sc.next());

		System.out.println("Enter Movie Genre: ");
		movie.setGenre(sc.next());

		System.out.println("Enter Moive Year: ");
		movie.setYear(sc.nextInt());

		movies.add(movie);
	}

	// Display all Movies
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

	// Display a Particular Movie
	private static void displayAParticularMovie(Scanner sc, ArrayList<Movie> movies) throws NoSuchMovieFoundException {
		System.out.println("Enter a movie ID to search: ");
		int movieId = sc.nextInt();

		boolean moiveFound = false;

		for (Movie movie : movies) {
			if (movie.getMovieId() == movieId) {
				moiveFound = true;
				System.out.println("Movie id: " + movie.getMovieId());
				System.out.println("Movie Name: " + movie.getMovieName());
				System.out.println("Movie genre: " + movie.getGenre());
				System.out.println("Movie year: " + movie.getYear());
			}
		}
		if (!moiveFound) {
			throw new NoSuchMovieFoundException();
		}
	}
}
