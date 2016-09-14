
package real.world.objects1;

/**
 *
 * @author cgonz
 */
public class Muskellunge extends FreshwaterFish {

    private String geneticVariation;
    private String bodyPattern;
    private String finClassification;

    public Muskellunge(String geneticVariation, String muskieBodyPattern, String finClassification) {
        this.geneticVariation = geneticVariation;
        this.bodyPattern = muskieBodyPattern;
        this.finClassification = finClassification;
    }

    // Certain muskie have certain patterns on their bodies
    // ex: spotted, tiger stripes, barred
    public final String getBodyPattern() {
        return bodyPattern;
    }

    public final void setBodyPattern(String bodyPattern) {
        //requires validation
        this.bodyPattern = bodyPattern;
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

    @Override
    public final String getGeneticVariation() {
        return geneticVariation;
    }

    @Override
    public final void setGeneticVariation(String geneticVariation) {
        //this method would most likely take the bodyPattern property and 
        //finClassification property to determine geneticVariation
        this.geneticVariation = geneticVariation;
    }

    // Certain Muskie have different fin patterns. 
    // Ex: Spotted Muskie tend to have pointier tails compared to a Tiger Muskie
    @Override
    public final String getFinClassification() {
        return finClassification;
    }

    @Override
    public final void setFinClassification(String finClassification) {
        this.finClassification = finClassification;
    }

}
