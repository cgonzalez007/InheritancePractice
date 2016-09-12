
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

    public abstract void setName(String name);

    public abstract String getName();

    public abstract void takeInOxygen();

    public abstract void searchForFood();

}
