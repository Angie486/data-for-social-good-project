/*
 * Represents a fashion object
 */
public class FashionData {

/*
* These are the variables to be used
* for the lists stored in files.
*/
private String productName;     // The name of the product (item)
private String brand;           // The brand of the item
private int price;              // The price of the item
private double rating;          // The rating of the item
private String color;           // The color of the item
private String size;            // The size of the item


 /*
  * Sets the productName, brand, price, rating, color,
  * and size to the specified values
  */
  public FashionData(){
     this("Jeans", "Zara", 40, 3.337937559, "Blue", "M");
  }

  public FashionData(String productName, String brand, int price, double rating, String color, String size) {
  this.productName = productName;
    this.brand = brand;
   this.price = price;
   this.rating = rating;
   this.color = color;
   this.size = size;
  }
  
 /*
  * Returns the name of the product (item)
  */
public String getProductName() {
  return productName;
}

 /*
  * Returns the brand of the item
  */
public String getBrand() {
  return brand;
}

   /*
  * Returns the price of the item
  */
public int getPrice() {
  return price;
}

   /*
  * Returns the rating of the item
  */
public double getRating() {
  return rating;
}

   /*
  * Returns the color of the item
  */
public String getColor() {
  return color;
}

   /*
  * Returns the size of the item
  */
public String getSize() {
  return size;
}

   /*
  * Returns a String containing the productName, brand,
  * price, rating, color, and size of the fashion item
  */
public String toString() {
  return "Product Name: " + productName + "\nBrand: " + brand + "\nPrice: $" + price + "\nRating: " + rating + "\nColor: " + color + "\nSize: " + size;
}

  
}