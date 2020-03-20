package session5;

class AnimalsOutForAWalk extends RuntimeException { }
class ExhibitClosed extends RuntimeException { }
class ExhibitClosedForLunch extends ExhibitClosed { }

public class ZooException {

    public static void main(String[] args) {
        ZooException zoo = new ZooException();
        //zoo.visitAnimals();
        zoo.Exception22();
    }
        public void visitAnimals() {
            try {
                seeAnimal(16);
            } catch (AnimalsOutForAWalk e) {// first catch block
                System.out.print("try back later");
            } catch (ExhibitClosed e) {// second catch block
                System.out.print("not today");
            }
        }
        private void seeAnimal(int hour) {
            switch (hour){
                case 9: throw new ExhibitClosedForLunch();
                case 10 : throw new AnimalsOutForAWalk();
                case 16 : throw new ExhibitClosed();
                default: System.out.print("visit animals");
            }
        }


        private void Exception22(){
            String s = "";
            try {
                s += "t";
                throw new Exception();
            } catch(Exception e) {
                s += "c";
                try{
                    throw new NullPointerException();
                } catch (NullPointerException np){
                    s += "s";
                }
            } finally {
                s += "f";
            }
            System.out.println(s);
        }
    }

