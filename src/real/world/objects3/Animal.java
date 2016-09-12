
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

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //requires validation
        this.name = name;
    }

    //Exactly why concrete classes as super classes is BAD. 
    //These will need to be overridden
    public void takeInOxygen() {
        System.out.println("Unknown");
    }

    public void searchForFood() {
        System.out.println("Unknown");
    }

}
