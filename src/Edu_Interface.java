interface Predator{}
interface Prey{}

interface Barkable{
    void bark();
}

interface BarkablePredator extends Predator , Barkable{

}
public class Edu_Interface {
    public static void main(String[] args){
        Bouncer bo = new Bouncer();
        Lion li = new Lion();
        bo.barkAnimal(li);
    }
}

class Animal2{
    String name;
}

class Tiger extends Animal2 implements BarkablePredator{
    @Override
    public void bark() {
        System.out.println("어흥");
    }


}
class Lion extends Animal2 implements  BarkablePredator{
    @Override
    public void bark() {
        System.out.println("으르렁");
    }
}
class Rabbit extends Animal2 implements Prey{}
class Rat extends Animal2 implements Prey{}
class ZooKeeper{
    void feed(Predator predator){
        System.out.println("feed apple");
    }

    void feed(Prey prey){
        System.out.println("feed banana");
    }

}

class Bouncer{
    void barkAnimal(BarkablePredator animal){
        animal.bark();
    }
}