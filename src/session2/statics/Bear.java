package session2.statics;

 public class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }
    public void print(){
        System.out.println("bear");
    }
     public static void sneeze() {
         System.out.println("Bear is sneezing");
     }
     public void hibernate() {
         System.out.println("Bear is hibernating");
     }
 }
//TO DO Curs1:ascunde metoda “sleep” si apeleaz-o
// in main pt toate clasele din ierarhie
class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }
    public void print(){
        System.out.println("bear");
    }
    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }
    public void hibernate() {
        System.out.println("Bear is hibernating");
    }

    public static void main(String[] args) {
        Panda.eat();
        Panda p = new Panda();
        p.print();
    }
}
