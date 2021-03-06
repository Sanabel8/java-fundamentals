package inheritance;

public class Review {
    private String author;
    private int numStars;
    private String body;

    //for test the constructor should added the method for shop and theater her
    private String name;
    private String description;
    private int numOfDollarSigns;

    public Review(String body, String author, int numStars) {
        this.body = body;
        this.author = author;
        this.numStars = numStars;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumStars() {
        return numStars;
    }

    public void setNumStars(int numStars) {
        this.numStars = numStars;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", numStars=" + numStars +
                ", body='" + body + '\'' +
                '}';
    }
}
