
package imaginary.objects2;

/**
 *
 * @author cgonz
 */
public class Ghost implements UndeadBeing {

    private String name;

    // Dictated that ghosts have the special ability to walk through walls
    public final void walkThroughWall() {
        System.out.println("I am walking through this wall.");
    }

    // Ghosts are known to make the room temperature drop significantly
    public final void dropTempuratureOfSurroundings() {
        System.out.println("The tempurature has dropped.");
    }

    @Override
    public final void hauntTheLiving() {
        System.out.println("Booooooo...");
    }

    @Override
    public final void setName(String name) {
        //requires validation
        this.name = name;
    }

    @Override
    public final String getName() {
        return name;
    }

    @Override
    public final void riseFromDead() {
        System.out.println("I rose from the dead as a ghost");
    }

}
