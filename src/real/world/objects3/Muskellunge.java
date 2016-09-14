
package real.world.objects3;

/**
 *
 * @author cgonz
 */
public class Muskellunge extends FreshwaterFish {
    // Certain muskie have certain patterns on their bodies
    // ex: spotted, tiger stripes, barred

    private String bodyPattern;

    public Muskellunge(String finClassification, double lengthFromSnoutToTail) {
        super(finClassification, lengthFromSnoutToTail);
    }

    public final String getBodyPattern() {
        return bodyPattern;
    }

    public final void setBodyPattern(String bodyPattern) {
        //requires validation
        this.bodyPattern = bodyPattern;
    }

    // ****NOTE****
    //These methods need to be OVERRIDDEN to avoid "Unknown" being inherited 
    @Override
    public final void swim() {
        System.out.println("I swim horizontally and use my fins");
    }

    @Override
    public final void takeInFreshwater() {
        System.out.println("I'm taking in Freshwater since I'm a freshwater "
                + "fish");
    }

    @Override
    public final void searchForFood() {
        System.out.println("I search for small fish and small animals including"
                + " birds and frogs");
    }

    @Override
    public final void takeInOxygen() {
        System.out.println("I take in oxygen through the use of my gills.");

    }
}
