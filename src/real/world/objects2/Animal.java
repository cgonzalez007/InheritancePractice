
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
 * No interface utilization = more dangerous
 */
public abstract class Animal {

    // Dictating here that all animals should have a name
    private String name;
    // May not be a good idea in terms of how animals get named (Certain animals
    // get grouped differently which may cause for a slight name difference,
    // Ex: "Tiger" Muskie)
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        //requires validation
        this.name = name;
    }

    // All animals have a way of taking in oxygen. Notice I did not use the word
    // "breathe" for the method name. 
    public abstract void takeInOxygen();

    // All animals need to find food. As to what and how, we will leave for the 
    // concrete classes
    public abstract void searchForFood();
}
