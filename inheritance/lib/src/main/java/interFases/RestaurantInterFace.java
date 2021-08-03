package interFases;

import inheritance.Review;

public interface RestaurantInterFace {
// we will added the method for restaurant her
    String getName();
    int getNumStars();
    int getPriceCategory();
    void addReview(Review review);

}
