package session2;

class Camel{
    protected String getNumberOfHumps() {
        return "Undefined";
    }
}
public class WildCamel extends Camel {
    protected String getNumberOfHumps() {
// DOES NOT COMPILE
        return "2";
    }
}
