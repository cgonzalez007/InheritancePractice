
package real.world.objects3;

/**
 *
 * @author cgonz
 */
public class FreshwaterFish extends Fish {

    // ****NOTE****
    //This is exactly why concrete classes as super classes is a BAD idea. 
    //This will need to be overridden
    
    // All Freshwater Fish take in Freshwater. Each type of freshwater fish 
    //might have their own specific way of doing so.
    public void takeInFreshwater() {
        System.out.println("Unknown");
    }
}
