package inheritance;
import interFases.ShopInterFace;
import java.util.LinkedList;

public class Shop implements ShopInterFace {
    private String name;
    private String description;
    private int numOfDollarSigns;
    private int i;
    private int numStars;
    private float starsRating; //floate beacause it avg
    private LinkedList<Review> reviews = new LinkedList<Review>();

    public Shop(String name, String description, int numOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numOfDollarSigns = numOfDollarSigns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumOfDollarSigns() {
        return numOfDollarSigns;
    }

    public void setNumOfDollarSigns(int numOfDollarSigns) {

        this.numOfDollarSigns = numOfDollarSigns;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numOfDollarSigns=" + numOfDollarSigns +
                '}';
    }
    public LinkedList<Review> getReviews() {
        return reviews;
    }
    public void addReview(Review review){
        this.reviews.add(review);
        System.out.println("ssssss"+this.reviews.size()); //size of list
        i++;
        starsRating += review.getNumStars();
        System.out.println("starsRating: "+ starsRating);
        // make avg to get rating
        System.out.println(starsRating/i);
        this.numStars= (int) (starsRating/i);
    }
}
