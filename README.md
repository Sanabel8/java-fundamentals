# java-fundamentals

## Lab-06: Inheritance and Interfaces
Overview
In this lab I created classes to represent reviews of restaurants. Restaurant class for create a resturant and Review class to add a review for a restaurant.

## Methods
Restaurant Class: The Constructor of Restaurant class accept three variables:String name ,int numberOfStars ,String priceCategory

Review Class: The Constructor of Review class acept three variables:
String body, String author ,int numberOfStars
 
toString()for resturant class : To print the restaurant data like this statment: Restaurant{name='aldaiaa', numberOfStars=2, priceCategory=3}

toString()for review class : To print the restaurant data like this statment: Restaurant{body='good restaurant', author="sanabel", numberOfStars=5}

generate the getter and seeter for all fileds in restaurant class : 
* getName(),setName(String name)
* getNumStars(),setNumStars(int numStars)
* getPriceCategory() ,setPriceCategory(int priceCategory)

generate the getter and seeter for all fileds in restaurant class : 
* getAuthor(),setAuthor(String author)
* getNumStars(),setNumStars(int numStars)
* getBody() ,setBody(String body)
addReview(Review review):this method  take in a Review instance, and associate that review with this Restaurant


getReviews(): The Type of this method is LinkedList<Review> and it is for store the all reviews in the list.

updateStars(): The purpose of this method is to update the rate of the restaurant (depend on the stars from reviews) by calculating the average of stars.







