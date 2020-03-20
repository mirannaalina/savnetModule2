package session4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bear {

    private String name;
    private int legs;
    public Bear(String name,int legs){
        this.name=name;
        this.legs=legs;
    }
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Bear bear = (Bear)o;
        return legs == bear.legs && Objects.equals(name, bear.name);
    }
    public static void main(String[] args) {
        List<Bear> bears = new ArrayList<>();
        Bear b1 = new Bear("b1",4);
        bears.add(b1);
        Bear b2 = new Bear("b2",4);
        bears.add(b2);
        Bear b3 = new Bear("b3",4);
        bears.add(b3);
        Bear b4 = new Bear("b3",4);//not add in the bears list
        System.out.println(bears.contains(b4));
        Bear b5 = new Bear("b3",3);//not add in the bears list
        System.out.println(bears.contains(b5));
    }
}
