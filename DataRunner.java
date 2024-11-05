import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

    /* 
     * I created an object from the UserStory class called fashion.
     * I included the files that have lists that are going to be utilized to find the
     * clothing item that best matches the users needs.
     */
 UserStory fashion = new UserStory("productName.txt", "brand.txt", "price.txt", "rating.txt", "color.txt", "size.txt");
       FashionData recommendation = fashion.getRecommendation();
        if (recommendation != null) {
            System.out.println(recommendation);
        } else {
            System.out.println("Sorry, we don't have that.");
        }
    /*
     * I made another object, but this time from the FashionData class
     * called recommendation that gets the recommendation method. 
     * I also made an if statement that states that if the recommendation is
     * not null, then it should print out the recommendation, otherwise it will print
     * sorry we don't have that.
     */
    
     


  }
}