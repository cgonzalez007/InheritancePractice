
package real.world.objects2;

/**
 *
 * @author cgonz
 * No interfaces used for this version
 * 
 * Animal super class as abstract class, Fish abstract class extending Animal,
 * Freshwater Abstract Class extending Fish,
 * Muskellunge concrete class extending Freshwater Fish
 * 
 * No interface utilization =  much riskier
 */
public abstract class Animal {

    // Dictating here that all animals should have some sort of genetic 
    // variation
    public abstract String getGeneticVariation();

    public abstract void setGeneticVariation(String geneticVariation);

    // All animals have a way of taking in oxygen. Notice I did not use the word
    // "breathe" for the method name. 
    public abstract void takeInOxygen();

    // All animals need to find food. As to what and how, we will leave for the 
    // concrete classes
    public abstract void searchForFood();
}
