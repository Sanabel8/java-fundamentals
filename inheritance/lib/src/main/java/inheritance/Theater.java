package inheritance;

import interFases.TheaterInterFace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theater implements TheaterInterFace {

    private String name;
//private String namesOfMovies="";

    private ArrayList<String> movies = new ArrayList<>(); // added linked list to srtore the movies
    private Map<String, Review> reviewsMovie = new HashMap<String, Review>();


    public Theater(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies='" + movies + '\'' +
                '}';
    }

    public void addMovie(String movieTitle) {
        movies.add(movieTitle);
    }
    public List<String> getMovies() {
        return this.movies;
    }

    public void removeMovie(String movieTitle) {
        movies.remove(movieTitle);
    }

    //
    public Review addRev(String body, String author, int stars) {
        Review review = new Review(body, author, stars);
        reviewsMovie.put("", review);
        return review;
    }

    public void addRev(Review rev, String movieName) {
        if (movies.contains(movieName)) {
            reviewsMovie.put(movieName,rev);
            System.out.println("the movie added");
        } else {
            System.out.println("no movies");

        }
    }

}