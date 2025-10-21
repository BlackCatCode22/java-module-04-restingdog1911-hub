public class Hyena extends Animal {

    // Unique variable for the sub class
    private String favoriteFood;


    //default constructor
    public Hyena() {
        this.favoriteFood = "Steak";
    }

    //Ussr-defined Constructor
    public Hyena(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
