package session2.exceptions;

public class Camel {
    private String getNumberOfHumps() {
        return "Undefined";
    }
}
class BactrianCamel extends Camel {
    private Integer getNumberOfHumps() {
        return new Integer(2);
    }
}
