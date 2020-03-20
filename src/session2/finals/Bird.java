package session2.finals;

public class Bird {
    //a final method cannot be override
    public boolean hasFeathers() {
        return true;
    }
}
 class Penguin extends Bird {
    public final boolean hasFeathers() {
// DOES NOT COMPILE
        return true;
    }
}
