import java.util.Scanner;

/*
 * This has the Scanner class so that it can be able to collect the users
 * input. This class collects the data and uses it to produce a product for the user.
 */ 
public class UserStory {

  /* 
  * This is the 1D (or one dimensional) array 
  * of fashion objects.
  */
private FashionData[] fashionData;

 /*
  * This reads the data from productNameFile, brandFile,
  * priceFile, ratingFile, colorFile, and sizeFile to
  * initialize fashionData.
  */
 public UserStory(String productNameFile, String brandFile, String priceFile, String ratingFile, String colorFile, String sizeFile) {
    fashionData = createFashionData(productNameFile, brandFile, priceFile, ratingFile, colorFile, sizeFile);
}

 /*
  * Returns a 1D array of Fashion objects using the 
  * data from productNameFile, brandFile, priceFile,
  * ratingFile, colorFile, and sizeFile.
  */
public FashionData[] createFashionData(String productNameFile, String brandFile, String priceFile, String ratingFile, String colorFile, String sizeFile) {
    String[] productNameData = FileReader.toStringArray(productNameFile);
    String[] brandData = FileReader.toStringArray(brandFile);
    int[] priceData = FileReader.toIntArray(priceFile);
    double[] ratingData = FileReader.toDoubleArray(ratingFile);
    String[] colorData = FileReader.toStringArray(colorFile);
    String[] sizeData = FileReader.toStringArray(sizeFile);

    FashionData[] tempFashionData = new FashionData[productNameData.length];
  
     for (int index = 0; index < tempFashionData.length; index++) {
      tempFashionData[index] = new FashionData(productNameData[index], brandData[index], priceData[index], ratingData[index], colorData[index], sizeData[index]);
    }

    return tempFashionData;
  }

 /*
  * This method first collects the users input about what
  * style they want, what their maximum price is, and what 
  * size they need. Then, it runs a for loop that checks if
  * the productName, price, and size are all there for a specific
  * item, and then outputs that item if it there.
  */
public FashionData getRecommendation() {
    Scanner scanner = new Scanner(System.in);

    // Get user inputs
    System.out.print("What style are you looking for? ");
    String userStyle = scanner.nextLine();

    System.out.print("What is your maximum price? ");
    int userPrice = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("What size do you need? ");
    String userSize = scanner.nextLine();

for (FashionData item : fashionData) {
        if (item.getProductName().equalsIgnoreCase(userStyle) && item.getPrice() <= userPrice && item.getSize().equalsIgnoreCase(userSize)) {
            return item;
        }
    }
    return null; 
}
  
}