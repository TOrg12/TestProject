package arthurmkrtchian.javaCore.OOP1.homeWorks.homeWork1;

public class Swallow extends FlyingBird{

    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.print("Swallow: ");
        super.fly();
    }
}
