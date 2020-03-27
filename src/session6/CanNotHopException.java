package session6;

import java.io.IOException;

public class CanNotHopException extends Exception{

}
    class Hopper {
        public void hop1() { }
        public void hop2() throws CanNotHopException { }
        public void hop3() throws Exception { }
        public void hop4() { }
    }
    class Bunny extends Hopper {
        public void hop1()  {}//CanNotHopException { }// DOES NOT COMPILE
        public void hop2() throws CanNotHopException { }
        public void hop3() throws CanNotHopException { }
        public void hop4() throws IllegalStateException { } // IllegalStateException ii runtimexception deasta merge override cu throws
}
