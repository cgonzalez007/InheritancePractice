
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

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //requires validation
        this.name = name;
    }

    public abstract void takeInOxygen();

    public abstract void searchForFood();
}
