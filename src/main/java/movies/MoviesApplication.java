package movies;

import util.Input;

import java.util.Arrays;
import java.util.Objects;

public class MoviesApplication {

    private static Movie[] movies = MoviesArray.findAll();
    private static final Input input = new Input();

    public static void main(String[] args) {
        boolean again;
        do {
            start();
            System.out.println("Would you like to continue? (Y/N)");
            String yOrN = input.getString();
            again = input.yesNo(yOrN);
        } while (again);
        end();
    }

    public static void start() {
        System.out.print("""
                What would you like to do?

                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                6 - view movies in the musical category
                7 - add a movie

                Enter your choice:\040""");
        userChoice();
    }

    public static void userChoice() {
        int userInput = input.getInt(0, 7);
        if (userInput == 0) {
            end();
        } else if (userInput == 1) {
            displayMovies();
            System.out.println();
        } else if (userInput == 2) {
            displayMovies(0);
        } else if (userInput == 3) {
            displayMovies(1);
        } else if (userInput == 4) {
            displayMovies(2);
        } else if (userInput == 5) {
            displayMovies(3);
        } else if (userInput == 6) {
            displayMovies(4);
        } else if (userInput == 7) {
            choice7();
        }
    }

    public static void end() {
        System.out.println("Goodbye!");
        System.exit(1);
    }

    public static void displayMovies() {
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public static void displayMovies(int userChoice) {
        for (Movie movie: movies) {
            if (Objects.equals(movie.getCategory(), movieCategory(userChoice))) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void choice7() {
        System.out.println("Please enter the title of the movie");
        String newMovieName = input.getString();
        System.out.println("""
        Please enter the category of the category of the movie:
        0 - animated
        1 - drama
        2 - horror
        3 - scifi
        4 - musical
        """);
        int newMovieCategory = input.getInt(0, 4);
        Movie newMovie = new Movie(newMovieName, movieCategory(newMovieCategory));
        movies = Arrays.copyOf(movies, movies.length);
        movies[movies.length-1] = newMovie;
        System.out.printf("Movie \"%s -- %s\" has been added.%n", newMovie.getName(), newMovie.getCategory());
    }

    public static String movieCategory(int userChoice) {
        if (userChoice == 0) {
            return "animated";
        } else if (userChoice == 1) {
            return "drama";
        } else if (userChoice == 2) {
            return "horror";
        } else if (userChoice == 3) {
            return "scifi";
        }
        return "musical";
    }
}
