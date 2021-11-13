package factorymethodpattern.after;

public abstract class DefaultShipFactory implements ShipFactory{

    @Override
    public void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
}
