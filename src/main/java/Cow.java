/**
 * Cow class that represents cow's name, age and their weight
 */
public class Cow {
    private String name;
    private int age;
    private double weight;

    /**
     * Constructor for all the instance variables
     * @param name of cow
     * @param age of cow
     * @param weight of cow
     */
    public Cow (String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    //Getters
    /**
     * Returns the Name of cow
     * @return the name of cow
     */
    public String getName (){
        return this.name;
    }
    /**
     * Returns the age of cow
     * @return the age of cow
     */
    public int getAge (){
        return this.age;
    }
    /**
     * Returns the weight of cow
     * @return weight of cow
     */
    public double getWeight(){
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.name + ", " + this.age + " - " + this.weight;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Check if the other object is null or of a different class
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        //Cast the other object to the Cow class
        Cow cow = (Cow) obj;
        // 2. Compare all relevant instance variables for equality
        if (this.name.equals(cow.name) && this.age == cow.age && Double.compare(this.weight, cow.weight) == 0) {
            return true;
        }
        return false; 
    }
}