package factorymethodpattern.before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = ShipFactory.orderShip("WhiteShip", "jaden@email.com");
        System.out.println(whiteShip);

        Ship blackShip = ShipFactory.orderShip("BlackShip", "jaden@email.com");
        System.out.println(blackShip);
    }

}
