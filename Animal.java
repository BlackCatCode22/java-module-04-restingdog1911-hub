// Class Declaration
public class Animal {

    // Static variable that is shared between all animals
    static int numOfAnimals=0;

    // Private variables that hold the information of the animal
    private String sex;
    private int age;
    private int weight;
    private String animalName;
    private String animalID;
    private String animalBirthDate;
    private String animalColor;
    private String animalOrigin;
    private String animalArrivalDate;

    // Default constructor that increases the number of animals
    public Animal() {
        numOfAnimals++;
    }

    // User-defined Constructor that accepts variables as arguments and assignments to the animal
    public Animal(String sex, int age, int weight, String animalName, String animalId, String animalBirthDate,
                  String animalColor, String animalOrigin, String animalArrivalDate){
       //uses the this key word to assign the value passed into the constructor
        //to the variables
        numOfAnimals++;
        this.sex=sex;
        this.age=age;
        this.weight=weight;
        this.animalName=animalName;
        this.animalID=animalId;
        this.animalBirthDate=animalBirthDate;
        this.animalColor=animalColor;
        this.animalOrigin=animalOrigin;
        this.animalArrivalDate=animalArrivalDate;
    }

    // Getter and Setter functions to access and modify all the private variables
    // Get functions simply return the value back
    // Set functions sets the variable to whatever was passed in
    public String getSex(){
        return sex;
    }
    public void setSex(String sex) {
            this.sex=sex;
    }

    public int getAge(){
        return age;
    }
    public void set(int age) {
        this.age = age;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight) {
        this.weight=weight;
    }


    public String getAnimalName(){
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName=animalName;
    }


    public String getAnimalID(){
        return animalID;
    }
    public void setAnimalID(String animalID) {
        this.animalID=animalID;
    }


    public String getAnimalBirthDate(){
        return animalBirthDate;
    }
    public void setAnimalBirthDate( String animalBirthDate) {
        this.animalBirthDate=animalBirthDate;
    }


    public String getAnimalColor(){
        return animalColor;
    }
    public void setAnimalColor(String animalColor) {
        this.animalColor=animalColor;
    }


    public String getAnimalOrigin(){
        return animalOrigin;
    }
    public void setAnimalOrigin( String animalOrigin) {
        this.animalOrigin=animalOrigin;
    }


    public String getAnimalArrivalDate(){
        return animalArrivalDate;
    }
    public void setAnimalArrivalDate( String animalArrivalDate) {
        this.animalArrivalDate=animalArrivalDate;
    }



//remember this is going to interact with the rest of your programs so if you want to display it as a list don't forget to add +"\n" and remember the colon:
public void displayAnimal(){
            System.out.println(
                  "Name: "+ getAnimalName() + "\n"
                  +"ID: "+ getAnimalID() + "\n"
                  +"Age: "+ getAge() + "\n"
                  +"SeX: "+ getSex() + "\n"
                  +"Weight: "+ getWeight() + "\n"
                  +"color: "+ getAnimalColor() + "\n"
                  +"Origin: "+ getAnimalOrigin() + "\n"
                  +"Birth Date: "+ getAnimalBirthDate() + "\n"
                  +"Arrival Date: "+  getAnimalArrivalDate()
            );
}










}
//parse each part of mySixParts