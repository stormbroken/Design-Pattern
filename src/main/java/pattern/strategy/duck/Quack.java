package pattern.strategy.duck;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
