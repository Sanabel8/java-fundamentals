package inheritance;

import java.util.LinkedList;

public class Restaurant {
    private String name;
    private int numStars;
    private int priceCategory;
    private float starsRating= 0;
    private int i =0;
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
        this.reviews.add(review);
         System.out.println("ssssss"+this.reviews.size()); //size of list
           i++;
          starsRating += review.getNumStars();
      System.out.println("starsRating: "+ starsRating);
      // make avg to get rating
      System.out.println(starsRating/i);
      this.numStars= (int) (starsRating/i);
  }

public LinkedList<Review> getReviews() {
    return reviews;
}

    }

