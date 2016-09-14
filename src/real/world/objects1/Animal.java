
package real.world.objects1;

/**
 *
 * @author cgonz
 * Probably the best version for this hierarchy
 * Animal super class as interface, Fish interface extending Animal,
 * Freshwater Abstract Class implementing Fish,
 * Muskellunge concrete class extending Freshwater Fish
 * 
 * More interface utilization = less dangerous
 */
public interface Animal {

    // All animals have some sort of genetic variation
    public abstract void setGeneticVariation(String geneticVariation);

    public abstract String getGeneticVariation();

    // All animals have a way of taking in oxygen. Notice I did not use the word
    // "breathe" for the method name. 
    public abstract void takeInOxygen();

    // All animals need to find food. As to what and how, we will leave for the 
    // concrete classes
    public abstract void searchForFood();

}
