package session2.exceptions;

import session2.exceptions.InsufficientDataException;

public class Reptile {
    protected boolean hasLegs() throws
            InsufficientDataException {
        throw new InsufficientDataException();
    }
    protected double getWeight() throws Exception {
        return 2;
    }
}
