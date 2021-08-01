/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    //test for resturant  constructor
    @Test public void testConstructorRestaurant(){
        Restaurant test =new Restaurant("aldaiaa" ,3,5);
        assertEquals("aldaiaa" ,test.getName());
        assertEquals( 3,test.getNumStars());
        assertEquals(5 ,test.getPriceCategory());
    }
    //test for review  constructor
    @Test public void testConstructorReview(){
        Review test =new Review("goodRestaurant" ,"sanabel",5);
        assertEquals("goodRestaurant" ,test.getBody());
        assertEquals("sanabel" ,test.getAuthor());
        assertEquals( 5,test.getNumStars());
    }
    @Test public void testRestaurantToString(){
        Restaurant test =new Restaurant("aldaiaa" ,3,5);
//        test.toString();
        assertEquals("Restaurant{name='aldaiaa', numStars=3, priceCategory=5}",test.toString());

    }
    @Test public void testReviewToString(){
        Review test =new Review("good resturant" ,"sanabel",5);
        assertEquals("Review{author='sanabel', numStars=5, body='good resturant'}",test.toString());
    }
      @Test public void testAddReview(){
//        Restaurant restaurant = new Restaurant("aldaiaa",3,5);
        Review test =new Review("good resturant" ,"sanabel",5);
//        restaurant.addReview(test);
        assertEquals("Review{author='sanabel', numStars=5, body='good resturant'}",test.toString());

    }



}
