
package real.world.objects2;

/**
 *
 * @author cgonz
 */
public class Muskellunge extends FreshwaterFish {
    // Certain muskie have certain patterns on their bodies
    // ex: spotted, tiger stripes, barred

    private String muskieBodyPattern;

    public String getMuskieBodyPattern() {
        return muskieBodyPattern;
    }

    public final void setMuskieBodyPattern(String muskieBodyPattern) {
        //requires validation
        this.muskieBodyPattern = muskieBodyPattern;
    }

    @Override
    public final void swim() {
        System.out.println("I swim horizontally and use my fins");
    }

    @Override
    public final void searchForFood() {
        System.out.println("I search for small fish and small animals including"
                + " birds and frogs");
    }

    @Override
    public final void takeInFreshwater() {
        System.out.println("I'm taking in Freshwater since I'm a freshwater "
                + "fish");
    }

    @Override
    public final void takeInOxygen() {
        System.out.println("I take in oxygen through the use of my gills.");

    }
}
