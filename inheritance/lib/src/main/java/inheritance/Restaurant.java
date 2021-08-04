package inheritance;

import java.util.LinkedList;

public class Restaurant {
    private String name;
    private int numStars;
    private int priceCategory;
    // add anew review instance to store the reviwes in list
    private LinkedList<Review> reviews = new LinkedList<Review>();

    public Restaurant(String name, int numStars, int priceCategory) {
        this.name = name;
        this.numStars = numStars;
        this.priceCategory = priceCategory;
// to check the num of stasrs between 1,5
        if(numStars>5) {
         this.numStars=5;
        }else if (numStars<0){
            this.numStars=0;
        }else{
            this.numStars=numStars;
        }
        this.priceCategory=priceCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumStars() {
        return numStars;
    }

    public void setNumStars(int numStars) {
        this.numStars = numStars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    // generate getter and seeter to linked list also /////////
//    public LinkedList<Review> getReviews() {
//        return reviews;
//    }
//
//    public void setReviews(LinkedList<Review> reviews) {
//        this.reviews = reviews;
//    }
///////////////////////////////////////////////////
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numStars=" + numStars +
                ", priceCategory=" + priceCategory +
                '}';
    }


  public void addReview(Review review){
        LinkedList<Review> reviews = new LinkedList<Review>();
         System.out.println(reviews.add(review));
         System.out.println("Name of resturant"+name+ ": "+ review);
      System.out.println(reviews);// as array we will use it
}
//make method to store the all reviews in linked list
//    public  LinkedList storesReviews(Review review){
//        System.out.println(reviews+"vvvvvvvv");
//        List list = Collections.singletonList(reviews.add(review));
//        System.out.println(list);
//   return (LinkedList) list;
//    }
public LinkedList<Review> getReviews() {
    return reviews;
}

    public void updateStars() {
      int currentRate=0;
        for (int i=0; i < getReviews().size(); i++) {
            currentRate += getReviews().get(i).getNumStars();
        }
        currentRate = currentRate/(getReviews().size());
        currentRate = Math.round(currentRate );
        this.numStars = currentRate;
    }
    }

