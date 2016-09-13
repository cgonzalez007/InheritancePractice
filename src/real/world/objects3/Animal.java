
package real.world.objects3;

/**
 *
 * @author cgonz
 * No interfaces or abstract classes used for this version
 * The real dangerous of inheritance are exposed in this demo,
 * especially with concrete classes being the super classes. 
 * 
 * Animal super class as concrete class, Fish concrete class extending Animal,
 * Freshwater concrete Class extending Fish,
 * Muskellunge concrete class extending Freshwater Fish
 * 
 * No interface or abstract class utilization = most dangerous of all
 * ---NOT A GOOD IDEA---
 */
public class Animal {

    // Dictating that all Animals need to have a name
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //requires validation
        this.name = name;
    }
    // ****NOTE****
    //This is exactly why concrete classes as super classes is a BAD idea. 
    //These will need to be overridden

    // All animals have a way of taking in oxygen. Notice I did not use the word
    // "breathe" for the method name. 
    public void takeInOxygen() {
        System.out.println("Unknown");
    }

    // All animals need to find food. As to what and how, we will leave for the 
    // concrete classes
    public void searchForFood() {
        System.out.println("Unknown");
    }

}
