package session1.Inheritance;

public class Zebra extends Animal {


    public Zebra(int age) {
        super();
        //super always on first line
        //super method call constructor from parent class
    }

    public Zebra(){
        this(4);

        //this method call constructor in the same class
    }
}
