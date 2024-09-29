package com.example.oop1implment;

public class Movie {
    // Instance variables
    private String title;
    private String studio;
    private String rating;

    // Constructor (a)
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG"; // Default rating set to "PG"
    }

    // Getter for rating (optional, not required but useful)
    public String getRating() {
        return rating;
    }

    public static Movie[] getPG(Movie[] movies) {
        int count = 0;

        // Count how many PG movies there are
        for (Movie movie : movies) {
            if ("PG".equals(movie.getRating())) {
                count++;
            }
        }

        Movie[] pgMovies = new Movie[count];
        int index = 0;

        // Add PG movies to the new array
        for (Movie movie : movies) {
            if ("PG".equals(movie.getRating())) {
                pgMovies[index++] = movie;
            }
        }

        return pgMovies;
    }

    public static void main(String[] args) {
        // Creating an instance of Movie (d)
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");

        // Printing the details of the movie
        System.out.println("Movie: " + casinoRoyale.title +
                ", Studio: " + casinoRoyale.studio +
                ", Rating: " + casinoRoyale.rating);

        Movie[] movies = {
                new Movie("Movie A", "Studio A", "PG"),
                new Movie("Movie B", "Studio B", "R"),
                new Movie("Movie C", "Studio C", "PG"),
                new Movie("Movie D", "Studio D", "PG13")
        };

        Movie[] pgMovies = Movie.getPG(movies);

        System.out.println("PG Movies:");
        for (Movie movie : pgMovies) {
            System.out.println(movie.title);
        }
    }
}
