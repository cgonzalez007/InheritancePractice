
package real.world.objects1;

/**
 *
 * @author cgonz
 */
public class Muskellunge extends FreshwaterFish {
    private String bodyPattern;
    
    @Override
    public void swim() {
        System.out.println("I swim horizontally and use my fins");
    }

    @Override
    public void searchForFood() {
        System.out.println("I search for small fish and small animals including"
                + " birds and frogs");
    }

    public String getBodyPattern() {
        return bodyPattern;
    }

    public void setBodyPattern(String bodyPattern) {
        //requires validation
        this.bodyPattern = bodyPattern;
    }
    
}
