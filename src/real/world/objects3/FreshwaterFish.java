
package real.world.objects3;

/**
 *
 * @author cgonz
 */
public class FreshwaterFish extends Fish {

    //Exactly why concrete classes as super classes is BAD. 
    //These will need to be overridden
    public void takeInFreshwater() {
        System.out.println("Unknown");
    }
}
