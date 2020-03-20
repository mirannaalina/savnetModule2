package session5;

public class TestException {

    void explore(){
        try{
            fall();
            System.out.println("never get here");
        } catch(RuntimeException e){
            System.out.println("exceptional case");
        }
        System.out.println("end of explore");
    }
    void fall() { throw new RuntimeException(); }

    public static void main(String[] args) {
        TestException te= new TestException();
        te.explore();
    }
}
