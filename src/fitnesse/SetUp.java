package fitnesse;
import fit.Fixture;
import Model.Aplikacja;

public class SetUp extends Fixture {
    static Aplikacja aplikacja;
    public SetUp() {
        aplikacja = new Aplikacja();
    }
}
